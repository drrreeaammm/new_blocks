package net.mcreator.newblocks.procedures;

import net.minecraft.util.Hand;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.GrenadeItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class BomberOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BomberOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean sz = false;
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
												if (entity instanceof LivingEntity) {
													Entity _ent = entity;
													if (!_ent.world.isRemote()) {
														GrenadeItem.shoot(_ent.world, (LivingEntity) entity, new Random(), (float) 0.5, (float) 4,
																(int) 0);
													}
												}
												if (entity instanceof LivingEntity) {
													((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
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
