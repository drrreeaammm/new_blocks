package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.MudBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MudUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MudUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MudUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MudUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MudUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.isAirBlock(new BlockPos((int) x, (int) (y - 1), (int) z))) {
			if (Math.random() < 0.3) {
				if (Math.random() < 0.3) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
							if (world instanceof ServerWorld) {
								FallingBlockEntity blockToSpawn = new FallingBlockEntity((World) world, x, (y - 1), z,
										MudBlock.block.getDefaultState());
								blockToSpawn.fallTime = 1;
								world.addEntity(blockToSpawn);
							}
						}
					}
				}
			}
		}
	}
}
