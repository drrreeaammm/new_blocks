package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.DormantDeepDarkGrassBlock;
import net.mcreator.newblocks.block.DeepDarkGrassBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DeepDarkGrassUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DeepDarkGrassUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DeepDarkGrassUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DeepDarkGrassUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DeepDarkGrassUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DormantDeepDarkGrassBlock.block.getDefaultState(), 3);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.POPPY) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.SUNFLOWER) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.DANDELION) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.FERN) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
		}
		if (Math.random() >= 0.33) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), DeepDarkGrassBlock.block.getDefaultState(), 3);
					}
				}
			}
		} else {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), DormantDeepDarkGrassBlock.block.getDefaultState(), 3);
		}
	}
}
