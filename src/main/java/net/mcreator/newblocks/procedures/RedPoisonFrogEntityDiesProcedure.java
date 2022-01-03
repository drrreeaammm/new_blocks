package net.mcreator.newblocks.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class RedPoisonFrogEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure RedPoisonFrogEntityDies!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 220, (int) 2, (false), (true)));
		if (Math.random() < 0.4) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(
						new EffectInstance(Effects.NAUSEA, (int) ((new Random()).nextInt((int) 180 + 1) + 70), (int) 3, (false), (true)));
		}
	}
}
