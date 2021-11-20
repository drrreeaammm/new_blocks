package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class PlayerDashProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerDash!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlayerDash!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
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
						{
							double _setval = (double) (((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NewBlocksModVariables.PlayerVariables())).dash) + 0.1);
							entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.dash = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if ((((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NewBlocksModVariables.PlayerVariables())).dash) > 16)) {
							{
								double _setval = (double) (((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NewBlocksModVariables.PlayerVariables())).dash) - 1);
								entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.dash = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 180);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 120);
	}
}
