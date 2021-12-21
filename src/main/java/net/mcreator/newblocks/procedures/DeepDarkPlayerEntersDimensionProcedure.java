package net.mcreator.newblocks.procedures;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.IWorld;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class DeepDarkPlayerEntersDimensionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DeepDarkPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DeepDarkPlayerEntersDimension!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate((entity.getPosX()),
					(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getPosX()), (int) (entity.getPosZ()))),
					(entity.getPosZ()));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
						(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getPosX()), (int) (entity.getPosZ()))),
						(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
