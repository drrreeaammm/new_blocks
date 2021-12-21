package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.projectile.EvokerFangsEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DarkMagicFangsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DarkMagicFangs!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DarkMagicFangs!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DarkMagicFangs!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DarkMagicFangs!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DarkMagicFangs!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (((entity instanceof MobEntity)
																	? ((MobEntity) entity).getAttackTarget()
																	: null) instanceof LivingEntity) {
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
																		if (((entity instanceof MobEntity)
																				? ((MobEntity) entity).getAttackTarget()
																				: null) instanceof LivingEntity) {
																			if (entity instanceof LivingEntity)
																				((LivingEntity) entity).addPotionEffect(new EffectInstance(
																						Effects.SLOWNESS, (int) 27, (int) 2, (false), (false)));
																			if (((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null) instanceof LivingEntity)
																				((LivingEntity) ((entity instanceof MobEntity)
																						? ((MobEntity) entity).getAttackTarget()
																						: null)).addPotionEffect(
																								new EffectInstance(Effects.SLOWNESS, (int) 17,
																										(int) 2, (false), (false)));
																			if (world instanceof ServerWorld) {
																				Entity entityToSpawn = new EvokerFangsEntity(EntityType.EVOKER_FANGS,
																						(World) world);
																				entityToSpawn.setLocationAndAngles(
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosX()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosY()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosZ()),
																						world.getRandom().nextFloat() * 360F, 0);
																				if (entityToSpawn instanceof MobEntity)
																					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																							world.getDifficultyForLocation(
																									entityToSpawn.getPosition()),
																							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																							(CompoundNBT) null);
																				world.addEntity(entityToSpawn);
																			}
																			if (world instanceof ServerWorld) {
																				Entity entityToSpawn = new EvokerFangsEntity(EntityType.EVOKER_FANGS,
																						(World) world);
																				entityToSpawn.setLocationAndAngles(
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosX() + 1),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosY()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosZ()),
																						world.getRandom().nextFloat() * 360F, 0);
																				if (entityToSpawn instanceof MobEntity)
																					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																							world.getDifficultyForLocation(
																									entityToSpawn.getPosition()),
																							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																							(CompoundNBT) null);
																				world.addEntity(entityToSpawn);
																			}
																			if (world instanceof ServerWorld) {
																				Entity entityToSpawn = new EvokerFangsEntity(EntityType.EVOKER_FANGS,
																						(World) world);
																				entityToSpawn.setLocationAndAngles(
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosX() - 1),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosY()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosZ()),
																						world.getRandom().nextFloat() * 360F, 0);
																				if (entityToSpawn instanceof MobEntity)
																					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																							world.getDifficultyForLocation(
																									entityToSpawn.getPosition()),
																							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																							(CompoundNBT) null);
																				world.addEntity(entityToSpawn);
																			}
																			if (world instanceof ServerWorld) {
																				Entity entityToSpawn = new EvokerFangsEntity(EntityType.EVOKER_FANGS,
																						(World) world);
																				entityToSpawn.setLocationAndAngles(
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosX()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosY()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosZ() + 1),
																						world.getRandom().nextFloat() * 360F, 0);
																				if (entityToSpawn instanceof MobEntity)
																					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																							world.getDifficultyForLocation(
																									entityToSpawn.getPosition()),
																							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																							(CompoundNBT) null);
																				world.addEntity(entityToSpawn);
																			}
																			if (world instanceof ServerWorld) {
																				Entity entityToSpawn = new EvokerFangsEntity(EntityType.EVOKER_FANGS,
																						(World) world);
																				entityToSpawn.setLocationAndAngles(
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosX()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosY()),
																						(((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null).getPosZ() - 1),
																						world.getRandom().nextFloat() * 360F, 0);
																				if (entityToSpawn instanceof MobEntity)
																					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																							world.getDifficultyForLocation(
																									entityToSpawn.getPosition()),
																							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																							(CompoundNBT) null);
																				world.addEntity(entityToSpawn);
																			}
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 3);
																if (world instanceof World && !world.isRemote()) {
																	((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																			(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																					.getValue(new ResourceLocation("entity.evoker.prepare_attack")),
																			SoundCategory.NEUTRAL, (float) 1, (float) 1);
																} else {
																	((World) world).playSound(x, y, z,
																			(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																					.getValue(new ResourceLocation("entity.evoker.prepare_attack")),
																			SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
