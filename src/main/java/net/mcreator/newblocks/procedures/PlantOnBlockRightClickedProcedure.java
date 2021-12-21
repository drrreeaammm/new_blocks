package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PlantOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlantOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PlantOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PlantOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PlantOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos((int) x, (int) (y + 0), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 6), (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 5), (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 5), (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) (z + 1)), Blocks.OAK_LEAVES.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) (z - 1)), Blocks.OAK_LEAVES.getDefaultState(), 3);
		if (Math.random() < 0.7) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) (z - 2)), Blocks.OAK_LEAVES.getDefaultState(), 3);
			if (Math.random() < 0.5) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 6), (int) (z - 1)), Blocks.OAK_LEAVES.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.7) {
			world.setBlockState(new BlockPos((int) (x - 2), (int) (y + 5), (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
			if (Math.random() < 0.5) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 6), (int) z), Blocks.OAK_LEAVES.getDefaultState(), 3);
			}
		}
	}
}
