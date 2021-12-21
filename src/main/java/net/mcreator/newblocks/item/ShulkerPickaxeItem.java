
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class ShulkerPickaxeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:shulker_pickaxe")
	public static final Item block = null;

	public ShulkerPickaxeItem(NewBlocksModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 9.5f;
			}

			public float getAttackDamage() {
				return 2.3999999999999995f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.SHULKER_SHELL));
			}
		}, 1, -3.1f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("shulker_pickaxe"));
	}
}
