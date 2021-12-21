package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class GenRandomOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure GenRandomOnKeyPressed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GenRandomOnKeyPressed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.9) {
			world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
					Blocks.GRASS_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (entity.getPosX() + 2), (int) (entity.getPosY()), (int) (entity.getPosZ())),
					Blocks.GRASS_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (entity.getPosX() + 3), (int) (entity.getPosY()), (int) (entity.getPosZ())),
					Blocks.GRASS_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ() + 1)),
					Blocks.GRASS_BLOCK.getDefaultState(), 3);
			world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ() + 2)),
					Blocks.GRASS_BLOCK.getDefaultState(), 3);
			if (Math.random() < 0.6) {
				world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ() + 3)),
						Blocks.GRASS_BLOCK.getDefaultState(), 3);
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ() + 4)),
							Blocks.GRASS_BLOCK.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ() + 5)),
							Blocks.GRASS_BLOCK.getDefaultState(), 3);
				}
			} else {
				world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1), (int) (entity.getPosZ() + 5)),
						Blocks.GRASS_BLOCK.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1), (int) (entity.getPosZ() + 4)),
						Blocks.GRASS_BLOCK.getDefaultState(), 3);
				world.setBlockState(new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY() - 1), (int) (entity.getPosZ() + 3)),
						Blocks.GRASS_BLOCK.getDefaultState(), 3);
			}
		}
	}
}
