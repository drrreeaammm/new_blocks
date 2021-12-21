package net.mcreator.newblocks.procedures;

import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class YEsProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure YEs!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return !((entity instanceof TameableEntity
				&& ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)
						? ((TameableEntity) entity)
								.isOwner((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))
						: false);
	}
}
