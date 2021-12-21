package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.enchantment.KnockingEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class KnockingEnchantmentProcedureProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingAttackEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				Entity imediatesourceentity = event.getSource().getImmediateSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("imediatesourceentity", imediatesourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure KnockingEnchantmentProcedure!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure KnockingEnchantmentProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (EnchantmentHelper.getEnchantmentLevel(KnockingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)) == 1) {
			if (Math.random() < 0.5) {
				sourceentity.setMotion((0 - Math.sin(sourceentity.rotationYaw * Math.PI / (-180))), (-0.1),
						Math.cos(sourceentity.rotationYaw * Math.PI / (-180)));
			}
		} else if (EnchantmentHelper.getEnchantmentLevel(KnockingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)) == 2) {
			if (Math.random() < 0.6) {
				sourceentity.setMotion((0 - Math.sin(sourceentity.rotationYaw * Math.PI / (-180))), (-0.2),
						Math.cos(sourceentity.rotationYaw * Math.PI / (-180)));
			}
		} else if (EnchantmentHelper.getEnchantmentLevel(KnockingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)) == 3) {
			if (Math.random() < 0.7) {
				sourceentity.setMotion((0 - Math.sin(sourceentity.rotationYaw * Math.PI / (-180))), (-0.3),
						Math.cos(sourceentity.rotationYaw * Math.PI / (-180)));
			}
		} else if (EnchantmentHelper.getEnchantmentLevel(KnockingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)) == 4) {
			if (Math.random() < 0.8) {
				sourceentity.setMotion((0 - Math.sin(sourceentity.rotationYaw * Math.PI / (-180))), (-0.4),
						Math.cos(sourceentity.rotationYaw * Math.PI / (-180)));
			}
		}
	}
}
