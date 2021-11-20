package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class DeepDarkGenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DeepDarkGen!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DeepDarkGen!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DeepDarkGen!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DeepDarkGen!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) y, (int) z),
					((World) world).getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x - 1), (int) y, (int) z),
					((World) world).getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x - 2), (int) y, (int) z),
					((World) world).getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 2), (int) y, (int) z),
					((World) world).getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 2), (int) y, (int) z),
					((World) world).getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)),
					((World) world).getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 2), (int) y, (int) (z + 1)),
					((World) world).getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 1))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 2), (int) y, (int) (z + 2)),
					((World) world).getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z + 2))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) y, (int) (z + 2)),
					((World) world).getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 2))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)),
					((World) world).getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)),
					((World) world).getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 2), (int) y, (int) (z - 1)),
					((World) world).getBlockState(new BlockPos((int) (x + 2), (int) y, (int) (z - 1))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) (x + 1), (int) y, (int) (z - 2)),
					((World) world).getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 2))).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y + 1), (int) z),
					((World) world).getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) (y - 1), (int) z),
					((World) world).getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).getBlock());
		if ((Math.random() < 0.5)) {
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("world", world);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				GrimstoneBlockAddedProcedure.executeProcedure($_dependencies);
			}
			if ((Math.random() < 0.5)) {
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					GrimstoneBlockAddedProcedure.executeProcedure($_dependencies);
				}
				if ((Math.random() < 0.5)) {
					{
						Map<String, Object> $_dependencies = new HashMap<>();
						$_dependencies.put("world", world);
						$_dependencies.put("x", x);
						$_dependencies.put("y", y);
						$_dependencies.put("z", z);
						GrimstoneBlockAddedProcedure.executeProcedure($_dependencies);
					}
				}
			}
		}
	}
}
