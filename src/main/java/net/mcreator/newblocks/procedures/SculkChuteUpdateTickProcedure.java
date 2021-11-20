package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.newblocks.block.SculkVineBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SculkChuteUpdateTickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SculkChuteUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SculkChuteUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SculkChuteUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SculkChuteUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			if ((Math.random() < 0.1)) {
				if ((Math.random() < 0.2)) {
					if ((Math.random() < 0.1)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.1)) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), SculkVineBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		} else if (((world.isAirBlock(new BlockPos((int) x, (int) (y + 2), (int) z)))
				&& (!(world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z)))))) {
			if ((Math.random() < 0.1)) {
				if ((Math.random() < 0.2)) {
					if ((Math.random() < 0.1)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.1)) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), SculkVineBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
