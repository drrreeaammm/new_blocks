package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class MakeAnimalsBreedProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
			Entity entity = event.getEntityLiving();
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

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MakeAnimalsBreed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MakeAnimalsBreed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MakeAnimalsBreed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MakeAnimalsBreed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure MakeAnimalsBreed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof CowEntity) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (22 / 2d), y - (22 / 2d), z - (22 / 2d), x + (22 / 2d), y + (22 / 2d), z + (22 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.6) {
												if (Math.random() < 0.4) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.4) {
															if (!((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false)) {
																if (!((((Entity) world
																		.getEntitiesWithinAABB(CowEntity.class,
																				new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																						x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
																				? ((LivingEntity) ((Entity) world
																						.getEntitiesWithinAABB(CowEntity.class,
																								new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d),
																										z - (16 / 2d), x + (16 / 2d), y + (16 / 2d),
																										z + (16 / 2d)),
																								null)
																						.stream().sorted(new Object() {
																							Comparator<Entity> compareDistOf(double _x, double _y,
																									double _z) {
																								return Comparator.comparing(
																										(Function<Entity, Double>) (_entcnd -> _entcnd
																												.getDistanceSq(_x, _y, _z)));
																							}
																						}.compareDistOf(x, y, z)).findFirst().orElse(null))).isChild()
																				: false)) {
																	NewBlocksModVariables.WorldVariables.get(world).UUIDOFBREEDER = ((Entity) world
																			.getEntitiesWithinAABB(CowEntity.class,
																					new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																							x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																					null)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator
																							.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																									.getDistanceSq(_x, _y, _z)));
																				}
																			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getUniqueID()
																					.toString();
																	NewBlocksModVariables.WorldVariables.get(world).syncData(world);
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					("data merge entity @s {InLove:600" + "}"));
																		}
																	}
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager().handleCommand(
																				new CommandSource(ICommandSource.DUMMY, new Vector3d(
																						x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
																						new StringTextComponent(""), ((World) world).getServer(),
																						null).withFeedbackDisabled(),
																				("data merge entity " + NewBlocksModVariables.WorldVariables
																						.get(world).UUIDOFBREEDER + "" + "{InLove:600}"));
																	}
																	System.out.println("Trying to breed a cow...");
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
																			NewBlocksMod.LOGGER.debug(
																					("Attempting to breed animals at" + x + " " + y + " " + z));
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 80);
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
		} else if (entity instanceof ChickenEntity) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (28 / 2d), y - (28 / 2d), z - (28 / 2d), x + (28 / 2d), y + (28 / 2d), z + (28 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.6) {
												if (Math.random() < 0.4) {
													if (Math.random() < 0.4) {
														if (Math.random() < 0.4) {
															if (!((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false)) {
																if (!((((Entity) world
																		.getEntitiesWithinAABB(ChickenEntity.class,
																				new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																						x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
																				? ((LivingEntity) ((Entity) world
																						.getEntitiesWithinAABB(ChickenEntity.class,
																								new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d),
																										z - (16 / 2d), x + (16 / 2d), y + (16 / 2d),
																										z + (16 / 2d)),
																								null)
																						.stream().sorted(new Object() {
																							Comparator<Entity> compareDistOf(double _x, double _y,
																									double _z) {
																								return Comparator.comparing(
																										(Function<Entity, Double>) (_entcnd -> _entcnd
																												.getDistanceSq(_x, _y, _z)));
																							}
																						}.compareDistOf(x, y, z)).findFirst().orElse(null))).isChild()
																				: false)) {
																	NewBlocksModVariables.WorldVariables.get(world).UUIDOFBREEDER = ((Entity) world
																			.getEntitiesWithinAABB(ChickenEntity.class,
																					new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																							x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																					null)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator
																							.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																									.getDistanceSq(_x, _y, _z)));
																				}
																			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getUniqueID()
																					.toString();
																	NewBlocksModVariables.WorldVariables.get(world).syncData(world);
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					("data merge entity @s {InLove:600" + "}"));
																		}
																	}
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager().handleCommand(
																				new CommandSource(ICommandSource.DUMMY, new Vector3d(
																						x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
																						new StringTextComponent(""), ((World) world).getServer(),
																						null).withFeedbackDisabled(),
																				("data merge entity " + NewBlocksModVariables.WorldVariables
																						.get(world).UUIDOFBREEDER + "" + "{InLove:600}"));
																	}
																	System.out.println("Trying to breed a chicken...");
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
																			NewBlocksMod.LOGGER.debug(
																					("Attempting to breed animals at" + x + " " + y + " " + z));
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 80);
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
		} else if (entity instanceof FoxEntity) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (28 / 2d), y - (28 / 2d), z - (28 / 2d), x + (28 / 2d), y + (28 / 2d), z + (28 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.6) {
												if (Math.random() < 0.4) {
													if (Math.random() < 0.4) {
														if (Math.random() < 0.4) {
															if (!((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false)) {
																if (!((((Entity) world
																		.getEntitiesWithinAABB(FoxEntity.class,
																				new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																						x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
																				? ((LivingEntity) ((Entity) world
																						.getEntitiesWithinAABB(FoxEntity.class,
																								new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d),
																										z - (16 / 2d), x + (16 / 2d), y + (16 / 2d),
																										z + (16 / 2d)),
																								null)
																						.stream().sorted(new Object() {
																							Comparator<Entity> compareDistOf(double _x, double _y,
																									double _z) {
																								return Comparator.comparing(
																										(Function<Entity, Double>) (_entcnd -> _entcnd
																												.getDistanceSq(_x, _y, _z)));
																							}
																						}.compareDistOf(x, y, z)).findFirst().orElse(null))).isChild()
																				: false)) {
																	NewBlocksModVariables.WorldVariables.get(world).UUIDOFBREEDER = ((Entity) world
																			.getEntitiesWithinAABB(FoxEntity.class,
																					new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																							x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																					null)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator
																							.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																									.getDistanceSq(_x, _y, _z)));
																				}
																			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getUniqueID()
																					.toString();
																	NewBlocksModVariables.WorldVariables.get(world).syncData(world);
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					("data merge entity @s {InLove:600" + "}"));
																		}
																	}
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager().handleCommand(
																				new CommandSource(ICommandSource.DUMMY, new Vector3d(
																						x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
																						new StringTextComponent(""), ((World) world).getServer(),
																						null).withFeedbackDisabled(),
																				("data merge entity " + NewBlocksModVariables.WorldVariables
																						.get(world).UUIDOFBREEDER + "" + "{InLove:600}"));
																	}
																	System.out.println("Trying to breed a fox...");
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
																			NewBlocksMod.LOGGER.debug(
																					("Attempting to breed animals at" + x + " " + y + " " + z));
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 80);
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
		} else if (entity instanceof HorseEntity) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (28 / 2d), y - (28 / 2d), z - (28 / 2d), x + (28 / 2d), y + (28 / 2d), z + (28 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.6) {
												if (Math.random() < 0.4) {
													if (Math.random() < 0.4) {
														if (Math.random() < 0.4) {
															if (!((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false)) {
																if (!((((Entity) world
																		.getEntitiesWithinAABB(HorseEntity.class,
																				new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																						x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
																				? ((LivingEntity) ((Entity) world
																						.getEntitiesWithinAABB(HorseEntity.class,
																								new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d),
																										z - (16 / 2d), x + (16 / 2d), y + (16 / 2d),
																										z + (16 / 2d)),
																								null)
																						.stream().sorted(new Object() {
																							Comparator<Entity> compareDistOf(double _x, double _y,
																									double _z) {
																								return Comparator.comparing(
																										(Function<Entity, Double>) (_entcnd -> _entcnd
																												.getDistanceSq(_x, _y, _z)));
																							}
																						}.compareDistOf(x, y, z)).findFirst().orElse(null))).isChild()
																				: false)) {
																	NewBlocksModVariables.WorldVariables.get(world).UUIDOFBREEDER = ((Entity) world
																			.getEntitiesWithinAABB(HorseEntity.class,
																					new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																							x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																					null)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator
																							.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																									.getDistanceSq(_x, _y, _z)));
																				}
																			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getUniqueID()
																					.toString();
																	NewBlocksModVariables.WorldVariables.get(world).syncData(world);
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					("data merge entity @s {InLove:600" + "}"));
																		}
																	}
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager().handleCommand(
																				new CommandSource(ICommandSource.DUMMY, new Vector3d(
																						x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
																						new StringTextComponent(""), ((World) world).getServer(),
																						null).withFeedbackDisabled(),
																				("data merge entity " + NewBlocksModVariables.WorldVariables
																						.get(world).UUIDOFBREEDER + "" + "{InLove:600}"));
																	}
																	System.out.println("Trying to breed a horse...");
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
																			NewBlocksMod.LOGGER.debug(
																					("Attempting to breed animals at " + x + " " + y + " " + z));
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 80);
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
		} else if (entity instanceof PigEntity) {
			if (((Entity) world
					.getEntitiesWithinAABB(PlayerEntity.class,
							new AxisAlignedBB(x - (28 / 2d), y - (28 / 2d), z - (28 / 2d), x + (28 / 2d), y + (28 / 2d), z + (28 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.6) {
												if (Math.random() < 0.4) {
													if (Math.random() < 0.4) {
														if (Math.random() < 0.4) {
															if (!((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false)) {
																if (!((((Entity) world
																		.getEntitiesWithinAABB(PigEntity.class,
																				new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																						x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity)
																				? ((LivingEntity) ((Entity) world
																						.getEntitiesWithinAABB(PigEntity.class,
																								new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d),
																										z - (16 / 2d), x + (16 / 2d), y + (16 / 2d),
																										z + (16 / 2d)),
																								null)
																						.stream().sorted(new Object() {
																							Comparator<Entity> compareDistOf(double _x, double _y,
																									double _z) {
																								return Comparator.comparing(
																										(Function<Entity, Double>) (_entcnd -> _entcnd
																												.getDistanceSq(_x, _y, _z)));
																							}
																						}.compareDistOf(x, y, z)).findFirst().orElse(null))).isChild()
																				: false)) {
																	NewBlocksModVariables.WorldVariables.get(world).UUIDOFBREEDER = ((Entity) world
																			.getEntitiesWithinAABB(PigEntity.class,
																					new AxisAlignedBB(x - (16 / 2d), y - (16 / 2d), z - (16 / 2d),
																							x + (16 / 2d), y + (16 / 2d), z + (16 / 2d)),
																					null)
																			.stream().sorted(new Object() {
																				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																					return Comparator
																							.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																									.getDistanceSq(_x, _y, _z)));
																				}
																			}.compareDistOf(x, y, z)).findFirst().orElse(null)).getUniqueID()
																					.toString();
																	NewBlocksModVariables.WorldVariables.get(world).syncData(world);
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					("data merge entity @s {InLove:600" + "}"));
																		}
																	}
																	if (world instanceof ServerWorld) {
																		((World) world).getServer().getCommandManager().handleCommand(
																				new CommandSource(ICommandSource.DUMMY, new Vector3d(
																						x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
																						new StringTextComponent(""), ((World) world).getServer(),
																						null).withFeedbackDisabled(),
																				("data merge entity " + NewBlocksModVariables.WorldVariables
																						.get(world).UUIDOFBREEDER + "" + "{InLove:600}"));
																	}
																	System.out.println("Trying to breed a pig...");
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
																			NewBlocksMod.LOGGER.debug(
																					("Attempting to breed animals at" + x + " " + y + " " + z));
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 80);
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
