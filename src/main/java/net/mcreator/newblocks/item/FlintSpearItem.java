
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class FlintSpearItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:flint_spear")
	public static final Item block = null;

	public FlintSpearItem(NewBlocksModElements instance) {
		super(instance, 834);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 115;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 0.3f;
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
		}, 3, -2.7000000000000002f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("flint_spear"));
	}
}
