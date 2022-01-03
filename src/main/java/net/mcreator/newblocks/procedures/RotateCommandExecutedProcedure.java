package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class RotateCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure RotateCommandExecuted!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure RotateCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (5000);
		for (int index0 = 0; index0 < (int) (50); index0++) {
			for (int index1 = 0; index1 < (int) (50); index1++) {
				entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
				entity.setRenderYawOffset(entity.rotationYaw);
				entity.prevRotationYaw = entity.rotationYaw;
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
					((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
					((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
				}
				entity.rotationPitch = (float) (5000);
			}
			entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (5000);
			entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (5000);
		}
		entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
		entity.setRenderYawOffset(entity.rotationYaw);
		entity.prevRotationYaw = entity.rotationYaw;
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
			((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
			((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
		}
		entity.rotationPitch = (float) (5000);
		for (int index2 = 0; index2 < (int) (50); index2++) {
			entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (5000);
			for (int index3 = 0; index3 < (int) (25); index3++) {
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
						entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entity.rotationPitch = (float) (5000);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 15);
				entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
				entity.setRenderYawOffset(entity.rotationYaw);
				entity.prevRotationYaw = entity.rotationYaw;
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
					((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
					((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
				}
				entity.rotationPitch = (float) (5000);
			}
			entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (5000);
			entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
			entity.setRenderYawOffset(entity.rotationYaw);
			entity.prevRotationYaw = entity.rotationYaw;
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
				((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
				((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
			}
			entity.rotationPitch = (float) (5000);
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
					entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (5000);
					entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (5000);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 23);
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
					entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
					entity.setRenderYawOffset(entity.rotationYaw);
					entity.prevRotationYaw = entity.rotationYaw;
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
						((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
						((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
					}
					entity.rotationPitch = (float) (5000);
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
							entity.rotationYaw = (float) (((new Random()).nextInt((int) 5000 + 1)));
							entity.setRenderYawOffset(entity.rotationYaw);
							entity.prevRotationYaw = entity.rotationYaw;
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
								((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
								((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
							}
							entity.rotationPitch = (float) (5000);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 63);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 63);
		}
	}
}
