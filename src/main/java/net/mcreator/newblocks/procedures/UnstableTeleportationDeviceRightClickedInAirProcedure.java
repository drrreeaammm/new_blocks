package net.mcreator.newblocks.procedures;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;
import java.util.Collections;

public class UnstableTeleportationDeviceRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure UnstableTeleportationDeviceRightClickedInAir!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure UnstableTeleportationDeviceRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure UnstableTeleportationDeviceRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 120);
		for (int index0 = 0; index0 < (int) (15); index0++) {
			NewBlocksModVariables.WorldVariables.get(world).ReturnXValue = ((new Random()).nextInt((int) 50 + 1));
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
			NewBlocksModVariables.WorldVariables.get(world).ReturnZValue = ((new Random()).nextInt((int) 50 + 1));
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
			if (world.isAirBlock(new BlockPos((int) NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
					(int) (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
							(int) NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
							(int) NewBlocksModVariables.WorldVariables.get(world).ReturnZValue)),
					(int) NewBlocksModVariables.WorldVariables.get(world).ReturnZValue))) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
							(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
									(int) NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
									(int) NewBlocksModVariables.WorldVariables.get(world).ReturnZValue)),
							NewBlocksModVariables.WorldVariables.get(world).ReturnZValue);
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
								(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
										(int) NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
										(int) NewBlocksModVariables.WorldVariables.get(world).ReturnZValue)),
								NewBlocksModVariables.WorldVariables.get(world).ReturnZValue, _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
				for (int index1 = 0; index1 < (int) (30); index1++) {
					entity.fallDistance = (float) (0);
				}
				break;
			} else {
				continue;
			}
		}
	}
}
