package net.mcreator.newblocks.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.WardenEntity;
import net.mcreator.newblocks.entity.SculkerEntity;
import net.mcreator.newblocks.entity.GrimstoneSpiderEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class IsNotWardenProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure IsNotWarden!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return !(entity instanceof WardenEntity.CustomEntity) && !(entity instanceof SculkerEntity.CustomEntity)
				&& !(entity instanceof GrimstoneSpiderEntity.CustomEntity);
	}
}
