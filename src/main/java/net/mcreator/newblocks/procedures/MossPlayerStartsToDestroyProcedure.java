package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.block.MossBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MossPlayerStartsToDestroyProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MossPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MossPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MossPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MossPlayerStartsToDestroy!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure MossPlayerStartsToDestroy!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock())) {
				world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), MossBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock())) {
				world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), MossBlock.block.getDefaultState(), 3);
			}
		}
	}
}
