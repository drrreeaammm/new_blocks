
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class ShulkerAxeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:shulker_axe")
	public static final Item block = null;

	public ShulkerAxeItem(NewBlocksModElements instance) {
		super(instance, 257);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2360;
			}

			public float getEfficiency() {
				return 9.5f;
			}

			public float getAttackDamage() {
				return 5.8f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.SHULKER_SHELL));
			}
		}, 1, -3.2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shulker_axe"));
	}
}
