
package net.mcreator.newblocks.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.newblocks.item.SniperRifileItem;
import net.mcreator.newblocks.item.RifleItem;
import net.mcreator.newblocks.item.PistolItem;
import net.mcreator.newblocks.item.MinigunItem;
import net.mcreator.newblocks.item.GrenadeLauncherItem;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class ReloadingEnchantment extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:reloading")
	public static final Enchantment enchantment = null;
	public ReloadingEnchantment(NewBlocksModElements instance) {
		super(instance, 1189);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("reloading"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == MinigunItem.block)
				return true;
			if (stack.getItem() == PistolItem.block)
				return true;
			if (stack.getItem() == GrenadeLauncherItem.block)
				return true;
			if (stack.getItem() == SniperRifileItem.block)
				return true;
			if (stack.getItem() == RifleItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
