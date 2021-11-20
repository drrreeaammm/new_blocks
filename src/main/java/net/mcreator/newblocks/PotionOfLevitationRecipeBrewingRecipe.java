
package net.mcreator.newblocks;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.newblocks.item.PotionOfLevitationItem;

@NewBlocksModElements.ModElement.Tag
public class PotionOfLevitationRecipeBrewingRecipe extends NewBlocksModElements.ModElement {
	public PotionOfLevitationRecipeBrewingRecipe(NewBlocksModElements instance) {
		super(instance, 441);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.SHULKER_SHELL;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(PotionOfLevitationItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
