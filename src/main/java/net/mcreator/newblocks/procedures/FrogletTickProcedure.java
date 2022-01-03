package net.mcreator.newblocks.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class FrogletTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure FrogletTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure FrogletTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure FrogletTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure FrogletTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double raytrace_y = 0;
		double raytrace_x = 0;
		double raytrace_z = 0;
		if (Math.random() < 0.4) {
			if (Math.random() < 0.4) {
				if (Math.random() < 0.4) {
					if (Math.random() < 0.3) {
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate(x, (y + 0.2), z);
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y + 0.2), z, _ent.rotationYaw, _ent.rotationPitch,
										Collections.emptySet());
							}
						}
					} else if (Math.random() < 0.3) {
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate(x, (y + 0.3), z);
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, (y + 0.3), z, _ent.rotationYaw, _ent.rotationPitch,
										Collections.emptySet());
							}
						}
					}
				}
			}
		}
		if (entity.isInWater()) {
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
																entity.setMotion((0 - Math.sin(entity.rotationYaw * Math.PI / 180)), 0.00001,
																		Math.cos(entity.rotationYaw * Math.PI / 180));
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
