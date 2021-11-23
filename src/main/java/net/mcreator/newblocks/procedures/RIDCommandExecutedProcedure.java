package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class RIDCommandExecutedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure RIDCommandExecuted!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure RIDCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		entity.getPersistentData().putDouble("ID1", ((new Random()).nextInt((int) 9 + 1)));
		entity.getPersistentData().putDouble("ID2", ((new Random()).nextInt((int) 9 + 1)));
		entity.getPersistentData().putDouble("ID3", ((new Random()).nextInt((int) 9 + 1)));
		entity.getPersistentData().putDouble("ID4", ((new Random()).nextInt((int) 9 + 1)));
		entity.getPersistentData().putDouble("ID5", ((new Random()).nextInt((int) 9 + 1)));
		entity.getPersistentData().putDouble("ID6", ((new Random()).nextInt((int) 9 + 1)));
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
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Your new ID is") + ""
							+ ((entity.getPersistentData().getDouble("ID1"))) + "" + ((entity.getPersistentData().getDouble("ID2"))) + ""
							+ ((entity.getPersistentData().getDouble("ID3"))) + "" + ((entity.getPersistentData().getDouble("ID4"))) + ""
							+ ((entity.getPersistentData().getDouble("ID5"))) + "" + ((entity.getPersistentData().getDouble("ID6"))))), (false));
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 25);
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
				NewBlocksMod.LOGGER.info((("Changed ID of ") + "" + ((entity.getDisplayName().getString())) + "" + ("to") + ""
						+ ((entity.getPersistentData().getDouble("ID1"))) + "" + ((entity.getPersistentData().getDouble("ID2"))) + ""
						+ ((entity.getPersistentData().getDouble("ID3"))) + "" + ((entity.getPersistentData().getDouble("ID4"))) + ""
						+ ((entity.getPersistentData().getDouble("ID5"))) + "" + ((entity.getPersistentData().getDouble("ID6")))));
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 15);
	}
}
