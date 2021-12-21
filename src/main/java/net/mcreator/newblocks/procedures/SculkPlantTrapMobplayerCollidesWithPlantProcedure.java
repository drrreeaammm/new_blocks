package net.mcreator.newblocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SculkPlantTrapMobplayerCollidesWithPlantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SculkPlantTrapMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 1, (false), (false)));
		if (Math.random() < 0.4) {
			if (Math.random() < 0.5) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.6) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.4) {
								if (entity instanceof LivingEntity) {
									((LivingEntity) entity).attackEntityFrom(new DamageSource("sculktrap").setDamageBypassesArmor(), (float) 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
