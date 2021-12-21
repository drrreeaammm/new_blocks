package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
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
											if (Math.random() < 0.7) {
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
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												world.setBlockState(
														new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
														Blocks.COBBLESTONE.getDefaultState(), 3);
												{
													Entity _ent = entity;
													_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY() + 1.2), (entity.getPosZ()));
													if (_ent instanceof ServerPlayerEntity) {
														((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
																(entity.getPosY() + 1.2), (entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch,
																Collections.emptySet());
													}
												}
												if (entity instanceof LivingEntity)
													((LivingEntity) entity).addPotionEffect(
															new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 10, (false), (false)));
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
											if (Math.random() < 0.7) {
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
															new EffectInstance(Effects.SLOWNESS, (int) 80, (int) 10, (false), (false)));
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
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (world.getWorldInfo().getGameRulesInstance()
																		.getBoolean(GameRules.MOB_GRIEFING) == true) {
																	if (((entity instanceof MobEntity)
																			? ((MobEntity) entity).getAttackTarget()
																			: null) instanceof LivingEntity) {
																		if (!(world.isAirBlock(new BlockPos(
																				(int) (((entity instanceof MobEntity)
																						? ((MobEntity) entity).getAttackTarget()
																						: null).getPosX()),
																				(int) (((entity instanceof MobEntity)
																						? ((MobEntity) entity).getAttackTarget()
																						: null).getPosY() - 1),
																				(int) (((entity instanceof MobEntity)
																						? ((MobEntity) entity).getAttackTarget()
																						: null).getPosZ()))))) {
																			if (((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null).getPosX() > entity.getPosX() + 4.5) {
																				if (entity instanceof LivingEntity) {
																					ItemStack _setstack = new ItemStack(Items.FLINT_AND_STEEL);
																					_setstack.setCount((int) 1);
																					((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
																					if (entity instanceof ServerPlayerEntity)
																						((ServerPlayerEntity) entity).inventory.markDirty();
																				}
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
																						if (entity instanceof PlayerEntity) {
																							Entity _ent = entity;
																							BlockPos _bp = new BlockPos(
																									(int) (((entity instanceof MobEntity)
																											? ((MobEntity) entity).getAttackTarget()
																											: null).getPosX()),
																									(int) (((entity instanceof MobEntity)
																											? ((MobEntity) entity).getAttackTarget()
																											: null).getPosY()),
																									(int) (((entity instanceof MobEntity)
																											? ((MobEntity) entity).getAttackTarget()
																											: null).getPosZ()));
																							_ent.world.getBlockState(_bp).getBlock()
																									.onBlockActivated(_ent.world.getBlockState(_bp),
																											_ent.world, _bp, (PlayerEntity) entity,
																											Hand.MAIN_HAND,
																											BlockRayTraceResult.createMiss(
																													new Vector3d(_bp.getX(),
																															_bp.getY(), _bp.getZ()),
																													Direction.UP, _bp));
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 1);
																			} else if (((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null).getPosX() < entity.getPosX() - 4.5) {
																				if (entity instanceof LivingEntity) {
																					ItemStack _setstack = new ItemStack(Items.FLINT_AND_STEEL);
																					_setstack.setCount((int) 1);
																					((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
																					if (entity instanceof ServerPlayerEntity)
																						((ServerPlayerEntity) entity).inventory.markDirty();
																				}
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
																						if (entity instanceof PlayerEntity) {
																							Entity _ent = entity;
																							BlockPos _bp = new BlockPos(
																									(int) (((entity instanceof MobEntity)
																											? ((MobEntity) entity).getAttackTarget()
																											: null).getPosX()),
																									(int) (((entity instanceof MobEntity)
																											? ((MobEntity) entity).getAttackTarget()
																											: null).getPosY()),
																									(int) (((entity instanceof MobEntity)
																											? ((MobEntity) entity).getAttackTarget()
																											: null).getPosZ()));
																							_ent.world.getBlockState(_bp).getBlock()
																									.onBlockActivated(_ent.world.getBlockState(_bp),
																											_ent.world, _bp, (PlayerEntity) entity,
																											Hand.MAIN_HAND,
																											BlockRayTraceResult.createMiss(
																													new Vector3d(_bp.getX(),
																															_bp.getY(), _bp.getZ()),
																													Direction.UP, _bp));
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 1);
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
		}
	}
}
