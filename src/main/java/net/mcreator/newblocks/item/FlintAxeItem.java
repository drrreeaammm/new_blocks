
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class FlintAxeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:flint_axe")
	public static final Item block = null;

	public FlintAxeItem(NewBlocksModElements instance) {
		super(instance, 832);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 175;
			}

			public float getEfficiency() {
				return 2.5f;
			}

			public float getAttackDamage() {
				return 3.199999999999999f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.FLINT));
			}
		}, 1, -2.9f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("flint_axe"));
	}
}
