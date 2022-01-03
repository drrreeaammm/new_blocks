package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.newblocks.entity.BuilderZombieEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;
import java.util.Collections;

public class BuilderZombieOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BuilderZombieOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BuilderZombieOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY() < entity.getPosY()) {
				if (!((world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1), (int) (entity.getPosZ()))))
						.getBlock() == Blocks.BEDROCK)) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (((Entity) world.getEntitiesWithinAABB(BuilderZombieEntity.CustomEntity.class, new AxisAlignedBB(
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX())
															- (2.6 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY())
															- (80.5 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ())
															- (2.6 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX())
															+ (2.6 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY())
															+ (80.5 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ())
															+ (2.6 / 2d)),
													null).stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparing(
																	(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
														}
													}.compareDistOf(
															(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																	.getPosX()),
															(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																	.getPosY()),
															(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																	.getPosZ())))
													.findFirst().orElse(null)) != null) {
												if (world instanceof World) {
													Block.spawnDrops(
															world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1),
																	(int) (entity.getPosZ()))),
															(World) world, new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1),
																	(int) (entity.getPosZ())));
													world.destroyBlock(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1),
															(int) (entity.getPosZ())), false);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			} else if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY() > entity.getPosY() + 0.2) {
				if ((world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() + 1), (int) (entity.getPosZ()))))
						.getBlock() == Blocks.AIR) {
					if (!world.isAirBlock(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1), (int) (entity.getPosZ())))) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (((Entity) world.getEntitiesWithinAABB(BuilderZombieEntity.CustomEntity.class,
															new AxisAlignedBB(
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosX()) - (2.6 / 2d),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosY()) - (80.5 / 2d),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosZ()) - (2.6 / 2d),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosX()) + (2.6 / 2d),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosY()) + (80.5 / 2d),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosZ()) + (2.6 / 2d)),
															null).stream().sorted(new Object() {
																Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																	return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																			.getDistanceSq(_x, _y, _z)));
																}
															}.compareDistOf(
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosX()),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosY()),
																	(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																			.getPosZ())))
															.findFirst().orElse(null)) != null) {
														world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()),
																(int) (entity.getPosZ())), Blocks.COBBLESTONE.getDefaultState(), 3);
														{
															Entity _ent = entity;
															_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY() + 1.2),
																	(entity.getPosZ()));
															if (_ent instanceof ServerPlayerEntity) {
																((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
																		(entity.getPosY() + 1.2), (entity.getPosZ()), _ent.rotationYaw,
																		_ent.rotationPitch, Collections.emptySet());
															}
														}
														if (entity instanceof LivingEntity)
															((LivingEntity) entity).addPotionEffect(
																	new EffectInstance(Effects.SLOWNESS, (int) 50, (int) 10, (false), (false)));
													}
												}
											}
										}
									}
								}
							}
						}
					}
				} else {
					if (Math.random() < 0.6) {
						if (Math.random() < 0.6) {
							if (Math.random() < 0.6) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (((Entity) world.getEntitiesWithinAABB(BuilderZombieEntity.CustomEntity.class, new AxisAlignedBB(
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX())
															- (2.6 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY())
															- (80.5 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ())
															- (2.6 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX())
															+ (2.6 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY())
															+ (80.5 / 2d),
													(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ())
															+ (2.6 / 2d)),
													null).stream().sorted(new Object() {
														Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
															return Comparator.comparing(
																	(Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
														}
													}.compareDistOf(
															(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																	.getPosX()),
															(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																	.getPosY()),
															(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)
																	.getPosZ())))
													.findFirst().orElse(null)) != null) {
												world.setBlockState(
														new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
														Blocks.COBBLESTONE.getDefaultState(), 3);
												{
													Entity _ent = entity;
													_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY() + 1.1), (entity.getPosZ()));
													if (_ent instanceof ServerPlayerEntity) {
														((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
																(entity.getPosY() + 1.1), (entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch,
																Collections.emptySet());
													}
												}
												if (world instanceof World) {
													Block.spawnDrops(
															world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() + 2),
																	(int) (entity.getPosZ()))),
															(World) world, new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() + 1),
																	(int) (entity.getPosZ())));
													world.destroyBlock(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() + 2),
															(int) (entity.getPosZ())), false);
												}
												if (entity instanceof LivingEntity)
													((LivingEntity) entity).addPotionEffect(
															new EffectInstance(Effects.SLOWNESS, (int) 50, (int) 10, (false), (false)));
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4, entity.getLook(1f).z * 4),
					RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getType() == RayTraceResult.Type.BLOCK) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (world instanceof World) {
													Block.spawnDrops(
															world.getBlockState(new BlockPos(
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																					entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getX()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																					entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getY()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																					entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getZ()))),
															(World) world,
															new BlockPos(
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																					entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getX()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																					entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getY()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																					entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getZ())));
													world.destroyBlock(new BlockPos(
															(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																			entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX()),
															(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																			entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY()),
															(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																			entity.getLook(1f).y * 2.7, entity.getLook(1f).z * 2.7),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ())),
															false);
												}
												if (Math.random() < 0.8) {
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
															if (world instanceof World) {
																Block.spawnDrops(
																		world.getBlockState(new BlockPos(
																				(int) (entity.world
																						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																								entity.getEyePosition(1f).add(
																										entity.getLook(1f).x * 2.7,
																										entity.getLook(1f).y * 2.7,
																										entity.getLook(1f).z * 2.7),
																								RayTraceContext.BlockMode.OUTLINE,
																								RayTraceContext.FluidMode.NONE, entity))
																						.getPos().getX()),
																				(int) (entity.world.rayTraceBlocks(new RayTraceContext(
																						entity.getEyePosition(1f),
																						entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																								entity.getLook(1f).y * 2.7,
																								entity.getLook(1f).z * 2.7),
																						RayTraceContext.BlockMode.OUTLINE,
																						RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1),
																				(int) (entity.world.rayTraceBlocks(new RayTraceContext(
																						entity.getEyePosition(1f),
																						entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																								entity.getLook(1f).y * 2.7,
																								entity.getLook(1f).z * 2.7),
																						RayTraceContext.BlockMode.OUTLINE,
																						RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))),
																		(World) world,
																		new BlockPos(
																				(int) (entity.world
																						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																								entity.getEyePosition(1f).add(
																										entity.getLook(1f).x * 2.7,
																										entity.getLook(1f).y * 2.7,
																										entity.getLook(1f).z * 2.7),
																								RayTraceContext.BlockMode.OUTLINE,
																								RayTraceContext.FluidMode.NONE, entity))
																						.getPos().getX()),
																				(int) (entity.world
																						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																								entity.getEyePosition(1f).add(
																										entity.getLook(1f).x * 2.7,
																										entity.getLook(1f).y * 2.7,
																										entity.getLook(1f).z * 2.7),
																								RayTraceContext.BlockMode.OUTLINE,
																								RayTraceContext.FluidMode.NONE, entity))
																						.getPos().getY() - 1),
																				(int) (entity.world
																						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																								entity.getEyePosition(1f).add(
																										entity.getLook(1f).x * 2.7,
																										entity.getLook(1f).y * 2.7,
																										entity.getLook(1f).z * 2.7),
																								RayTraceContext.BlockMode.OUTLINE,
																								RayTraceContext.FluidMode.NONE, entity))
																						.getPos().getZ())));
																world.destroyBlock(
																		new BlockPos(
																				(int) (entity.world
																						.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																								entity.getEyePosition(1f).add(
																										entity.getLook(1f).x * 2.7,
																										entity.getLook(1f).y * 2.7,
																										entity.getLook(1f).z * 2.7),
																								RayTraceContext.BlockMode.OUTLINE,
																								RayTraceContext.FluidMode.NONE, entity))
																						.getPos().getX()),
																				(int) (entity.world.rayTraceBlocks(new RayTraceContext(
																						entity.getEyePosition(1f),
																						entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																								entity.getLook(1f).y * 2.7,
																								entity.getLook(1f).z * 2.7),
																						RayTraceContext.BlockMode.OUTLINE,
																						RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1),
																				(int) (entity.world.rayTraceBlocks(new RayTraceContext(
																						entity.getEyePosition(1f),
																						entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.7,
																								entity.getLook(1f).y * 2.7,
																								entity.getLook(1f).z * 2.7),
																						RayTraceContext.BlockMode.OUTLINE,
																						RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
																		false);
															}
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 12);
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
