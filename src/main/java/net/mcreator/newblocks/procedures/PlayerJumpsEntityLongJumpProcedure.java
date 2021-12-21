package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.enchantment.LongJumpEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PlayerJumpsEntityLongJumpProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlayerJumpsEntityLongJump!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerJumpsEntityLongJump!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isOnGround()) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
					.getItem() == Items.ELYTRA) {
				if ((EnchantmentHelper.getEnchantmentLevel(LongJumpEnchantment.enchantment,
						((entity instanceof LivingEntity)
								? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST)
								: ItemStack.EMPTY)) != 0)) {
					entity.setMotion((0 - Math.sin(entity.rotationYaw * Math.PI / 180)), 2.4, Math.cos(entity.rotationYaw * Math.PI / 180));
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (entity instanceof PlayerEntity) {
								((PlayerEntity) entity).startFallFlying();
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 15);
				}
			}
		}
	}
}
