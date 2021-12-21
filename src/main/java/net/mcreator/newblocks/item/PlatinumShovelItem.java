
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class PlatinumShovelItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:platinum_shovel")
	public static final Item block = null;

	public PlatinumShovelItem(NewBlocksModElements instance) {
		super(instance, 1045);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 227;
			}

			public float getEfficiency() {
				return 5.5f;
			}

			public float getAttackDamage() {
				return 1f;
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
		}, 1, -2.7000000000000002f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("platinum_shovel"));
	}
}
