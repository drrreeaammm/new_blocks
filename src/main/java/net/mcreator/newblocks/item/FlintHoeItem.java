
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class FlintHoeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:flint_hoe")
	public static final Item block = null;
	public FlintHoeItem(NewBlocksModElements instance) {
		super(instance, 833);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 145;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return -1.6f;
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
		}, 0, -2.6f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("flint_hoe"));
	}
}
