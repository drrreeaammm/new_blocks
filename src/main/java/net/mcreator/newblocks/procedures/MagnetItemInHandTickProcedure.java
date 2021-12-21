package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class MagnetItemInHandTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MagnetItemInHandTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MagnetItemInHandTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MagnetItemInHandTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MagnetItemInHandTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure MagnetItemInHandTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure MagnetItemInHandTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (18 / 2d), y - (18 / 2d), z - (18 / 2d), x + (18 / 2d), y + (18 / 2d), z + (18 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof ExperienceOrbEntity) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						if (!(EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
							if (Math.random() < 0.6) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.3) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						}
						if (EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) == 1) {
							if (Math.random() < 0.4) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.3) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) == 2) {
							if (Math.random() < 0.3) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.2) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) == 3) {
							if (Math.random() < 0.2) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.1) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						}
					} else if (entityiterator instanceof ItemEntity) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						if (!(EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) != 0)) {
							if (Math.random() < 0.7) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.3) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						}
						if (EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) == 1) {
							if (Math.random() < 0.5) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.3) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) == 2) {
							if (Math.random() < 0.3) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.2) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						} else if (EnchantmentHelper.getEnchantmentLevel(Enchantments.UNBREAKING, itemstack) == 3) {
							if (Math.random() < 0.2) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							} else if (Math.random() < 0.1) {
								{
									ItemStack _ist = itemstack;
									if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
