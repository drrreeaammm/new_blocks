package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.newblocks.block.ButtercupBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MoobloomOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MoobloomOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MoobloomOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MoobloomOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MoobloomOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getMaterial() == net.minecraft.block.material.Material.ORGANIC) {
			if (world.isAirBlock(new BlockPos((int) x, (int) y, (int) z))) {
				if (Math.random() < 0.2) {
					if (Math.random() < 0.2) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.2) {
								if (Math.random() < 0.2) {
									if (Math.random() < 0.2) {
										if (Math.random() < 0.2) {
											if (Math.random() < 0.2) {
												world.setBlockState(new BlockPos((int) x, (int) y, (int) z), ButtercupBlock.block.getDefaultState(),
														3);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
