package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.newblocks.block.MossBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class SummonRootProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SummonRoot!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SummonRoot!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SummonRoot!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SummonRoot!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double zs = 0;
		double ys = 0;
		double xs = 0;
		if (y <= 65) {
			zs = (-22);
			for (int index0 = 0; index0 < (int) (32); index0++) {
				xs = (-22);
				for (int index1 = 0; index1 < (int) (32); index1++) {
					ys = (-12);
					for (int index2 = 0; index2 < (int) (12); index2++) {
						ys = (ys + 1);
						MakeRootsProcedure.executeProcedure(Stream
								.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", (x + xs)),
										new AbstractMap.SimpleEntry<>("y", (y + ys)), new AbstractMap.SimpleEntry<>("z", (z + zs)))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					}
					xs = (xs + 1);
				}
				zs = (zs + 1);
			}
		}
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MossBlock.block.getDefaultState(), 3);
	}
}
