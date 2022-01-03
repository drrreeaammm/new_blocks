package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;

import net.mcreator.newblocks.block.CavePlantLitBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class CavePlantMiddleLitUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure CavePlantMiddleLitUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure CavePlantMiddleLitUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure CavePlantMiddleLitUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure CavePlantMiddleLitUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (!world.isAirBlock(new BlockPos((int) x, (int) (y - 1), (int) z))) {
			if (!BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:bottom_berry"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), CavePlantLitBlock.block.getDefaultState(), 3);
			}
		}
	}
}
