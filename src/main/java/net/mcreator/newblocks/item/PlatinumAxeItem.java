
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class PlatinumAxeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:platinum_axe")
	public static final Item block = null;

	public PlatinumAxeItem(NewBlocksModElements instance) {
		super(instance, 1046);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 227;
			}

			public float getEfficiency() {
				return 5.5f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatinumIngotItem.block));
			}
		}, 1, -3.1f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("platinum_axe"));
	}
}
