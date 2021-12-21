package net.mcreator.newblocks.procedures;

import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.CowagerEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class NotCowagerProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure NotCowager!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return !(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof CowagerEntity.CustomEntity)
				&& !((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false);
	}
}
