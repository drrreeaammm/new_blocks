
package net.mcreator.newblocks;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.newblocks.potion.WeightItemTwoPotion;
import net.mcreator.newblocks.potion.WeightItemThreePotion;

@NewBlocksModElements.ModElement.Tag
public class WeightTwoRecipeBrewingRecipe extends NewBlocksModElements.ModElement {
	public WeightTwoRecipeBrewingRecipe(NewBlocksModElements instance) {
		super(instance, 1433);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			Item inputItem = input.getItem();
			return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
					&& PotionUtils.getPotionFromItem(input) == WeightItemTwoPotion.potionType;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.SLIME_BALL;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(input.getItem()), WeightItemThreePotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
