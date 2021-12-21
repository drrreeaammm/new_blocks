package net.mcreator.newblocks.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DiamondSwordItemIsCraftedsmeltedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure DiamondSwordItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).addEnchantment(Enchantments.SHARPNESS, (int) 1);
		(itemstack).addEnchantment(Enchantments.KNOCKBACK, (int) 1);
		(itemstack).addEnchantment(Enchantments.LOOTING, (int) 1);
		(itemstack).addEnchantment(Enchantments.SWEEPING, (int) 3);
		(itemstack).addEnchantment(Enchantments.UNBREAKING, (int) 2);
	}
}
