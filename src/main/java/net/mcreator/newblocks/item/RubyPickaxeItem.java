
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class RubyPickaxeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:ruby_pickaxe")
	public static final Item block = null;
	public RubyPickaxeItem(NewBlocksModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 0.9f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubyItem.block));
			}
		}, 1, -3.2f, new Item.Properties().group(NewblocksItemGroup.tab)) {
		}.setRegistryName("ruby_pickaxe"));
	}
}
