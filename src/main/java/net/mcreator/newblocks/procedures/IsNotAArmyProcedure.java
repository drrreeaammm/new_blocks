package net.mcreator.newblocks.procedures;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class IsNotAArmyProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure IsNotAArmy!");
			return false;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		return !EntityTypeTags.getCollection().getTagByID(new ResourceLocation("new_blocks:army")).contains(sourceentity.getType());
	}
}
