package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.GrenadeLauncherItem;
import net.mcreator.newblocks.entity.TankEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class TankShootOnKeyPressedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TankShootOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure TankShootOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getRidingEntity()) instanceof LivingEntity)) {
			if (((entity.getRidingEntity()) instanceof TankEntity.CustomEntity)) {
				(entity.getRidingEntity()).getPersistentData().putDouble("timeCount",
						(((entity.getRidingEntity()).getPersistentData().getDouble("timeCount")) - 1));
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;
					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if ((((entity.getRidingEntity()).getPersistentData().getDouble("timeCount")) < 0)) {
							if ((entity.getRidingEntity()) instanceof LivingEntity) {
								Entity _ent = (entity.getRidingEntity());
								if (!_ent.world.isRemote()) {
									GrenadeLauncherItem.shoot(_ent.world, (LivingEntity) (entity.getRidingEntity()), new Random(), (float) 1,
											(float) 5, (int) 0.1);
								}
							}
							(entity.getRidingEntity()).getPersistentData().putDouble("timeCount", 5);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 20);
			}
		}
	}
}
