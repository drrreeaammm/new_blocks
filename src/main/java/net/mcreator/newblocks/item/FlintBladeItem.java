
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
public class FlintBladeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:flint_blade")
	public static final Item block = null;
	public FlintBladeItem(NewBlocksModElements instance) {
		super(instance, 830);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 195;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -0.1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.FLINT));
			}
		}, 3, -2.2f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("flint_blade"));
	}
}
