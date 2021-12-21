package net.mcreator.newblocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.WardenEntity;
import net.mcreator.newblocks.entity.VeryAngryWardenEntity;
import net.mcreator.newblocks.entity.SculkerEntity;
import net.mcreator.newblocks.entity.EndersculkEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SculkVineMobplayerCollidesWithPlantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SculkVineMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity instanceof WardenEntity.CustomEntity) && !(entity instanceof SculkerEntity.CustomEntity)
				&& !(entity instanceof EndersculkEntity.CustomEntity) && !(entity instanceof VeryAngryWardenEntity.CustomEntity)) {
			if (Math.random() < 0.2) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).attackEntityFrom(new DamageSource("skulk.vine.death").setDamageBypassesArmor(), (float) 3);
				}
			}
		}
	}
}
