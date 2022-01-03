package net.mcreator.newblocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class TadpoleOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TadpoleOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.isInWaterRainOrBubbleColumn()) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (entity.isOnGround()) {
											entity.setMotion(((new Random()).nextInt((int) 0.02 + 1)), (entity.getMotion().getY() + 0.11),
													((new Random()).nextInt((int) 0.02 + 1)));
										}
									}
									if (entity.isOnGround()) {
										if (Math.random() < 0.1) {
											entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
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
