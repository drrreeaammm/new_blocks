package net.mcreator.newblocks.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.enchantment.ReloadingEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class GrenadeLauncherRangedItemUsedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GrenadeLauncherRangedItemUsed!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure GrenadeLauncherRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (!(EnchantmentHelper.getEnchantmentLevel(ReloadingEnchantment.enchantment, itemstack) != 0)) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 55);
		} else if (EnchantmentHelper.getEnchantmentLevel(ReloadingEnchantment.enchantment, itemstack) == 1) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 47);
		} else if (EnchantmentHelper.getEnchantmentLevel(ReloadingEnchantment.enchantment, itemstack) == 2) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 42);
		} else if (EnchantmentHelper.getEnchantmentLevel(ReloadingEnchantment.enchantment, itemstack) == 3) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 35);
		}
	}
}
