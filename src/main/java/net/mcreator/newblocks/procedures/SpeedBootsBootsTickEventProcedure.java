package net.mcreator.newblocks.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.enchantment.SprintingEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SpeedBootsBootsTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SpeedBootsBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 25, (int) 0, (false), (false)));
		if (entity.isSprinting()) {
			if (EnchantmentHelper.getEnchantmentLevel(SprintingEnchantment.enchantment,
					((entity instanceof LivingEntity)
							? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET)
							: ItemStack.EMPTY)) == 1) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 25, (int) 1, (false), (false)));
			}
		} else if (entity.isSprinting()) {
			if (EnchantmentHelper.getEnchantmentLevel(SprintingEnchantment.enchantment,
					((entity instanceof LivingEntity)
							? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET)
							: ItemStack.EMPTY)) == 2) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 25, (int) 2, (false), (false)));
			}
		} else if (entity.isSprinting()) {
			if (EnchantmentHelper.getEnchantmentLevel(SprintingEnchantment.enchantment,
					((entity instanceof LivingEntity)
							? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET)
							: ItemStack.EMPTY)) == 3) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 25, (int) 3, (false), (false)));
			}
		}
	}
}
