package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.WardenEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class PlaySoundIfWardenNearbyProcedure {
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
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlaySoundIfWardenNearby!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PlaySoundIfWardenNearby!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PlaySoundIfWardenNearby!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PlaySoundIfWardenNearby!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (((Entity) world
				.getEntitiesWithinAABB(WardenEntity.CustomEntity.class,
						new AxisAlignedBB(x - (82 / 2d), y - (82 / 2d), z - (82 / 2d), x + (82 / 2d), y + (82 / 2d), z + (82 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			if (Math.random() < 0.8) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.6) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.5) {
								if (Math.random() < 0.4) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.9) {
											if (Math.random() < 0.9) {
												if (Math.random() < 0.5) {
													if (Math.random() < 0.6) {
														if (Math.random() < 0.8) {
															if (Math.random() < 0.9) {
																if (Math.random() < 0.5) {
																	if (Math.random() < 0.3) {
																		if (Math.random() < 0.3) {
																			if (world instanceof World && !world.isRemote()) {
																				((World) world).playSound(null,
																						new BlockPos((int) x, (int) y, (int) z),
																						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																								.getValue(new ResourceLocation(
																										"new_blocks:warden_distant")),
																						SoundCategory.AMBIENT, (float) 1, (float) 1);
																			} else {
																				((World) world).playSound(x, y, z,
																						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																								.getValue(new ResourceLocation(
																										"new_blocks:warden_distant")),
																						SoundCategory.AMBIENT, (float) 1, (float) 1, false);
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
