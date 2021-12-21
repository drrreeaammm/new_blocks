package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class BackCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BackCommandExecuted!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BackCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(NewBlocksModVariables.WorldVariables.get(world).playerdeath1,
					NewBlocksModVariables.WorldVariables.get(world).playerdeath2, NewBlocksModVariables.WorldVariables.get(world).player3);
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(NewBlocksModVariables.WorldVariables.get(world).playerdeath1,
						NewBlocksModVariables.WorldVariables.get(world).playerdeath2, NewBlocksModVariables.WorldVariables.get(world).player3,
						_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
	}
}
