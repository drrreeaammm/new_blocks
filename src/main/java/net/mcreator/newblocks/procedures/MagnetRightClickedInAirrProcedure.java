package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.newblocks.enchantment.ElectricityEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class MagnetRightClickedInAirrProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure MagnetRightClickedInAirr!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure MagnetRightClickedInAirr!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MagnetRightClickedInAirr!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MagnetRightClickedInAirr!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MagnetRightClickedInAirr!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MagnetRightClickedInAirr!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if ((Items.ENCHANTED_BOOK == (itemstackiterator).getItem())) {
						if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, (itemstackiterator))) == 1)) {
							if ((!((itemstack).getItem() == (itemstackiterator).getItem()))) {
								((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 1);
								{
									Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstackiterator));
									if (_enchantments.containsKey(ElectricityEnchantment.enchantment)) {
										_enchantments.remove(ElectricityEnchantment.enchantment);
										EnchantmentHelper.setEnchantments(_enchantments, (itemstackiterator));
									}
								}
								if (world instanceof World && !world.isRemote()) {
									((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("block.enchantment_table.use")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1);
								} else {
									((World) world).playSound(x, y, z,
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("block.enchantment_table.use")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
								}
							}
						} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, (itemstackiterator))) == 2)) {
							if ((!((itemstack).getItem() == (itemstackiterator).getItem()))) {
								((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 2);
								{
									Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstackiterator));
									if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
										_enchantments.remove(Enchantments.UNBREAKING);
										EnchantmentHelper.setEnchantments(_enchantments, (itemstackiterator));
									}
								}
								if (world instanceof World && !world.isRemote()) {
									((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("block.enchantment_table.use")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1);
								} else {
									((World) world).playSound(x, y, z,
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("block.enchantment_table.use")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
								}
							}
						} else if (((EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, (itemstackiterator))) == 3)) {
							if ((!((itemstack).getItem() == (itemstackiterator).getItem()))) {
								((itemstack)).addEnchantment(Enchantments.UNBREAKING, (int) 3);
								{
									Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstackiterator));
									if (_enchantments.containsKey(Enchantments.UNBREAKING)) {
										_enchantments.remove(Enchantments.UNBREAKING);
										EnchantmentHelper.setEnchantments(_enchantments, (itemstackiterator));
									}
								}
								if (world instanceof World && !world.isRemote()) {
									((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("new_blocks:herobrinehurt")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1);
								} else {
									((World) world).playSound(x, y, z,
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("new_blocks:herobrinehurt")),
											SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
