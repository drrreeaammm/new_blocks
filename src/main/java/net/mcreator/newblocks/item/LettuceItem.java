
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class LettuceItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:lettuce")
	public static final Item block = null;
	public LettuceItem(NewBlocksModElements instance) {
		super(instance, 1234);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).build()));
			setRegistryName("lettuce");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 23;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
