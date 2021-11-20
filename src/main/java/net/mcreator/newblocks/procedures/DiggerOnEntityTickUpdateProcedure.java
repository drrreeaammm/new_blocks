package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class DiggerOnEntityTickUpdateProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DiggerOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DiggerOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DiggerOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DiggerOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DiggerOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)) {
			if ((!(world.isAirBlock(new BlockPos((int) x, (int) (y - 1), (int) z))))) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.7)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.7)) {
								if ((Math.random() < 0.7)) {
									if ((Math.random() < 0.7)) {
										if ((Math.random() < 0.7)) {
											if ((Math.random() < 0.7)) {
												if ((Math.random() < 0.7)) {
													if ((Math.random() < 0.7)) {
														if ((Math.random() < 0.7)) {
															if ((Math.random() < 0.7)) {
																if ((Math.random() < 0.7)) {
																	if (entity instanceof LivingEntity)
																		((LivingEntity) entity).addPotionEffect(new EffectInstance(
																				Effects.REGENERATION, (int) 130, (int) 4, (false), (false)));
																	{
																		Entity _ent = entity;
																		_ent.setPositionAndUpdate(x, (y - 5), z);
																		if (_ent instanceof ServerPlayerEntity) {
																			((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y - 5), z,
																					_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
																		}
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
																			if ((((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null) instanceof LivingEntity)) {
																				{
																					Entity _ent = entity;
																					_ent.setPositionAndUpdate(
																							(((entity instanceof MobEntity)
																									? ((MobEntity) entity).getAttackTarget()
																									: null).getPosX()),
																							((((entity instanceof MobEntity)
																									? ((MobEntity) entity).getAttackTarget()
																									: null).getPosY()) - 5),
																							(((entity instanceof MobEntity)
																									? ((MobEntity) entity).getAttackTarget()
																									: null).getPosZ()));
																					if (_ent instanceof ServerPlayerEntity) {
																						((ServerPlayerEntity) _ent).connection.setPlayerLocation(
																								(((entity instanceof MobEntity)
																										? ((MobEntity) entity).getAttackTarget()
																										: null).getPosX()),
																								((((entity instanceof MobEntity)
																										? ((MobEntity) entity).getAttackTarget()
																										: null).getPosY()) - 5),
																								(((entity instanceof MobEntity)
																										? ((MobEntity) entity).getAttackTarget()
																										: null).getPosZ()),
																								_ent.rotationYaw, _ent.rotationPitch,
																								Collections.emptySet());
																					}
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
																						if ((!(world.isAirBlock(
																								new BlockPos((int) x, (int) (y + 1), (int) z))))) {
																							{
																								Entity _ent = entity;
																								_ent.setPositionAndUpdate(
																										(((entity instanceof MobEntity)
																												? ((MobEntity) entity)
																														.getAttackTarget()
																												: null).getPosX()),
																										(y + 2),
																										(((entity instanceof MobEntity)
																												? ((MobEntity) entity)
																														.getAttackTarget()
																												: null).getPosZ()));
																								if (_ent instanceof ServerPlayerEntity) {
																									((ServerPlayerEntity) _ent).connection
																											.setPlayerLocation(
																													(((entity instanceof MobEntity)
																															? ((MobEntity) entity)
																																	.getAttackTarget()
																															: null).getPosX()),
																													(y + 2),
																													(((entity instanceof MobEntity)
																															? ((MobEntity) entity)
																																	.getAttackTarget()
																															: null).getPosZ()),
																													_ent.rotationYaw,
																													_ent.rotationPitch,
																													Collections.emptySet());
																								}
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
																									if ((!(world.isAirBlock(new BlockPos((int) x,
																											(int) (y + 1), (int) z))))) {
																										{
																											Entity _ent = entity;
																											_ent.setPositionAndUpdate(
																													(((entity instanceof MobEntity)
																															? ((MobEntity) entity)
																																	.getAttackTarget()
																															: null).getPosX()),
																													(y + 2),
																													(((entity instanceof MobEntity)
																															? ((MobEntity) entity)
																																	.getAttackTarget()
																															: null).getPosZ()));
																											if (_ent instanceof ServerPlayerEntity) {
																												((ServerPlayerEntity) _ent).connection
																														.setPlayerLocation(
																																(((entity instanceof MobEntity)
																																		? ((MobEntity) entity)
																																				.getAttackTarget()
																																		: null).getPosX()),
																																(y + 2),
																																(((entity instanceof MobEntity)
																																		? ((MobEntity) entity)
																																				.getAttackTarget()
																																		: null).getPosZ()),
																																_ent.rotationYaw,
																																_ent.rotationPitch,
																																Collections
																																		.emptySet());
																											}
																										}
																										new Object() {
																											private int ticks = 0;
																											private float waitTicks;
																											private IWorld world;
																											public void start(IWorld world,
																													int waitTicks) {
																												this.waitTicks = waitTicks;
																												MinecraftForge.EVENT_BUS
																														.register(this);
																												this.world = world;
																											}

																											@SubscribeEvent
																											public void tick(
																													TickEvent.ServerTickEvent event) {
																												if (event.phase == TickEvent.Phase.END) {
																													this.ticks += 1;
																													if (this.ticks >= this.waitTicks)
																														run();
																												}
																											}

																											private void run() {
																												if ((!(world.isAirBlock(new BlockPos(
																														(int) x, (int) (y + 1),
																														(int) z))))) {
																													{
																														Entity _ent = entity;
																														_ent.setPositionAndUpdate(
																																(((entity instanceof MobEntity)
																																		? ((MobEntity) entity)
																																				.getAttackTarget()
																																		: null).getPosX()),
																																(y + 2),
																																(((entity instanceof MobEntity)
																																		? ((MobEntity) entity)
																																				.getAttackTarget()
																																		: null).getPosZ()));
																														if (_ent instanceof ServerPlayerEntity) {
																															((ServerPlayerEntity) _ent).connection
																																	.setPlayerLocation(
																																			(((entity instanceof MobEntity)
																																					? ((MobEntity) entity)
																																							.getAttackTarget()
																																					: null).getPosX()),
																																			(y + 2),
																																			(((entity instanceof MobEntity)
																																					? ((MobEntity) entity)
																																							.getAttackTarget()
																																					: null).getPosZ()),
																																			_ent.rotationYaw,
																																			_ent.rotationPitch,
																																			Collections
																																					.emptySet());
																														}
																													}
																													new Object() {
																														private int ticks = 0;
																														private float waitTicks;
																														private IWorld world;
																														public void start(
																																IWorld world,
																																int waitTicks) {
																															this.waitTicks = waitTicks;
																															MinecraftForge.EVENT_BUS
																																	.register(this);
																															this.world = world;
																														}

																														@SubscribeEvent
																														public void tick(
																																TickEvent.ServerTickEvent event) {
																															if (event.phase == TickEvent.Phase.END) {
																																this.ticks += 1;
																																if (this.ticks >= this.waitTicks)
																																	run();
																															}
																														}

																														private void run() {
																															if ((!(world.isAirBlock(
																																	new BlockPos(
																																			(int) x,
																																			(int) (y + 1),
																																			(int) z))))) {
																																{
																																	Entity _ent = entity;
																																	_ent.setPositionAndUpdate(
																																			(((entity instanceof MobEntity)
																																					? ((MobEntity) entity)
																																							.getAttackTarget()
																																					: null).getPosX()),
																																			(y + 2),
																																			(((entity instanceof MobEntity)
																																					? ((MobEntity) entity)
																																							.getAttackTarget()
																																					: null).getPosZ()));
																																	if (_ent instanceof ServerPlayerEntity) {
																																		((ServerPlayerEntity) _ent).connection
																																				.setPlayerLocation(
																																						(((entity instanceof MobEntity)
																																								? ((MobEntity) entity)
																																										.getAttackTarget()
																																								: null).getPosX()),
																																						(y + 2),
																																						(((entity instanceof MobEntity)
																																								? ((MobEntity) entity)
																																										.getAttackTarget()
																																								: null).getPosZ()),
																																						_ent.rotationYaw,
																																						_ent.rotationPitch,
																																						Collections
																																								.emptySet());
																																	}
																																}
																																new Object() {
																																	private int ticks = 0;
																																	private float waitTicks;
																																	private IWorld world;
																																	public void start(
																																			IWorld world,
																																			int waitTicks) {
																																		this.waitTicks = waitTicks;
																																		MinecraftForge.EVENT_BUS
																																				.register(
																																						this);
																																		this.world = world;
																																	}

																																	@SubscribeEvent
																																	public void tick(
																																			TickEvent.ServerTickEvent event) {
																																		if (event.phase == TickEvent.Phase.END) {
																																			this.ticks += 1;
																																			if (this.ticks >= this.waitTicks)
																																				run();
																																		}
																																	}

																																	private void run() {
																																		if ((!(world
																																				.isAirBlock(
																																						new BlockPos(
																																								(int) x,
																																								(int) (y + 1),
																																								(int) z))))) {
																																			{
																																				Entity _ent = entity;
																																				_ent.setPositionAndUpdate(
																																						(((entity instanceof MobEntity)
																																								? ((MobEntity) entity)
																																										.getAttackTarget()
																																								: null).getPosX()),
																																						(y + 2),
																																						(((entity instanceof MobEntity)
																																								? ((MobEntity) entity)
																																										.getAttackTarget()
																																								: null).getPosZ()));
																																				if (_ent instanceof ServerPlayerEntity) {
																																					((ServerPlayerEntity) _ent).connection
																																							.setPlayerLocation(
																																									(((entity instanceof MobEntity)
																																											? ((MobEntity) entity)
																																													.getAttackTarget()
																																											: null).getPosX()),
																																									(y + 2),
																																									(((entity instanceof MobEntity)
																																											? ((MobEntity) entity)
																																													.getAttackTarget()
																																											: null).getPosZ()),
																																									_ent.rotationYaw,
																																									_ent.rotationPitch,
																																									Collections
																																											.emptySet());
																																				}
																																			}
																																		}
																																		MinecraftForge.EVENT_BUS
																																				.unregister(
																																						this);
																																	}
																																}.start(world,
																																		(int) 10);
																															}
																															MinecraftForge.EVENT_BUS
																																	.unregister(this);
																														}
																													}.start(world, (int) 10);
																												}
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
																											}
																										}.start(world, (int) 10);
																									}
																									MinecraftForge.EVENT_BUS.unregister(this);
																								}
																							}.start(world, (int) 10);
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 10);
																			}
																			MinecraftForge.EVENT_BUS.unregister(this);
																		}
																	}.start(world, (int) 65);
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
