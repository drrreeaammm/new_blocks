package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BuilderZombieOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BuilderZombieOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)) {
			if (((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY()) < (entity.getPosY()))) {
				if ((!((world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 1), (int) (entity.getPosZ()))))
						.getBlock() == Blocks.BEDROCK))) {
					if ((Math.random() < 0.7)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.7)) {
								if ((Math.random() < 0.7)) {
									if ((Math.random() < 0.7)) {
										if ((Math.random() < 0.7)) {
											if ((Math.random() < 0.7)) {
												if (world instanceof World) {
													Block.spawnDrops(
															world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 1),
																	(int) (entity.getPosZ()))),
															(World) world, new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 1),
																	(int) (entity.getPosZ())));
													world.destroyBlock(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) - 1),
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
			} else if (((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY()) > ((entity.getPosY()) + 0.2))) {
				if (((world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) + 1), (int) (entity.getPosZ()))))
						.getBlock() == Blocks.AIR)) {
					if ((Math.random() < 0.7)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.7)) {
								if ((Math.random() < 0.7)) {
									if ((Math.random() < 0.7)) {
										if ((Math.random() < 0.7)) {
											if ((Math.random() < 0.7)) {
												world.setBlockState(
														new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
														Blocks.COBBLESTONE.getDefaultState(), 3);
												{
													Entity _ent = entity;
													_ent.setPositionAndUpdate((entity.getPosX()), ((entity.getPosY()) + 1.2), (entity.getPosZ()));
													if (_ent instanceof ServerPlayerEntity) {
														((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
																((entity.getPosY()) + 1.2), (entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch,
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
					if ((Math.random() < 0.6)) {
						if ((Math.random() < 0.6)) {
							if ((Math.random() < 0.6)) {
								if ((Math.random() < 0.7)) {
									if ((Math.random() < 0.7)) {
										if ((Math.random() < 0.7)) {
											if ((Math.random() < 0.7)) {
												world.setBlockState(
														new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
														Blocks.COBBLESTONE.getDefaultState(), 3);
												{
													Entity _ent = entity;
													_ent.setPositionAndUpdate((entity.getPosX()), ((entity.getPosY()) + 1.1), (entity.getPosZ()));
													if (_ent instanceof ServerPlayerEntity) {
														((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
																((entity.getPosY()) + 1.1), (entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch,
																Collections.emptySet());
													}
												}
												if (world instanceof World) {
													Block.spawnDrops(
															world.getBlockState(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) + 2),
																	(int) (entity.getPosZ()))),
															(World) world, new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) + 1),
																	(int) (entity.getPosZ())));
													world.destroyBlock(new BlockPos((int) (entity.getPosX()), (int) ((entity.getPosY()) + 2),
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
			if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
					entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4, entity.getLook(1f).z * 4),
					RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getType() == RayTraceResult.Type.BLOCK)) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.7)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.7)) {
								if ((Math.random() < 0.7)) {
									if ((Math.random() < 0.7)) {
										if ((Math.random() < 0.7)) {
											if ((Math.random() < 0.7)) {
												if (world instanceof World) {
													Block.spawnDrops(
															world.getBlockState(new BlockPos(
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																					entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getX()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																					entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getY()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																					entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getZ()))),
															(World) world,
															new BlockPos(
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																					entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getX()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																					entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getY()),
																	(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																					entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getZ())));
													world.destroyBlock(new BlockPos(
															(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																			entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX()),
															(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																			entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY()),
															(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 3.5,
																			entity.getLook(1f).y * 3.5, entity.getLook(1f).z * 3.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ())),
															false);
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
