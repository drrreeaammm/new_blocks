package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.entity.WardenEntity;
import net.mcreator.newblocks.entity.SculkerEntity;
import net.mcreator.newblocks.enchantment.SculkingEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class SculkingArmorHelmetTickEventProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (78 / 2d), y - (78 / 2d), z - (78 / 2d), x + (78 / 2d), y + (78 / 2d), z + (78 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (((entityiterator instanceof WardenEntity.CustomEntity) || (entityiterator instanceof SculkerEntity.CustomEntity))) {
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 60, (int) 1, (false), (false)));
				}
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 20, (int) 0, (false), (false)));
		if (((EnchantmentHelper.getEnchantmentLevel(SculkingEnchantment.enchantment, (itemstack))) == 1)) {
			if (((((Entity) world
					.getEntitiesWithinAABB(WardenEntity.CustomEntity.class,
							new AxisAlignedBB(x - (12 / 2d), y - (12 / 2d), z - (12 / 2d), x + (12 / 2d), y + (12 / 2d), z + (12 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
							.getEntitiesWithinAABB(SculkerEntity.CustomEntity.class,
									new AxisAlignedBB(x - (12 / 2d), y - (12 / 2d), z - (12 / 2d), x + (12 / 2d), y + (12 / 2d), z + (12 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
				if ((Math.random() < 0.4)) {
					if ((Math.random() < 0.5)) {
						if ((Math.random() < 0.3)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.4)) {
									if ((Math.random() < 0.4)) {
										if ((Math.random() < 0.5)) {
											if ((Math.random() < 0.3)) {
												if (world instanceof World && !world.isRemote()) {
													((World) world).playSound(null,
															new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()),
																	(int) (entity.getPosZ())),
															(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																	.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
															SoundCategory.NEUTRAL, (float) 1, (float) 1);
												} else {
													((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
															(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																	.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
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
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(SculkingEnchantment.enchantment, (itemstack))) == 2)) {
			if (((((Entity) world
					.getEntitiesWithinAABB(WardenEntity.CustomEntity.class,
							new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
							.getEntitiesWithinAABB(SculkerEntity.CustomEntity.class,
									new AxisAlignedBB(x - (24 / 2d), y - (24 / 2d), z - (24 / 2d), x + (24 / 2d), y + (24 / 2d), z + (24 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
				if ((Math.random() < 0.6)) {
					if ((Math.random() < 0.5)) {
						if ((Math.random() < 0.6)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.6)) {
									if ((Math.random() < 0.5)) {
										if ((Math.random() < 0.6)) {
											if ((Math.random() < 0.5)) {
												if (world instanceof World && !world.isRemote()) {
													((World) world).playSound(null,
															new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()),
																	(int) (entity.getPosZ())),
															(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																	.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
															SoundCategory.NEUTRAL, (float) 1, (float) 1);
												} else {
													((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
															(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																	.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
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
			}
		} else if (((EnchantmentHelper.getEnchantmentLevel(SculkingEnchantment.enchantment, (itemstack))) == 3)) {
			if (((((Entity) world
					.getEntitiesWithinAABB(WardenEntity.CustomEntity.class,
							new AxisAlignedBB(x - (37 / 2d), y - (37 / 2d), z - (37 / 2d), x + (37 / 2d), y + (37 / 2d), z + (37 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) || (((Entity) world
							.getEntitiesWithinAABB(SculkerEntity.CustomEntity.class,
									new AxisAlignedBB(x - (37 / 2d), y - (37 / 2d), z - (37 / 2d), x + (37 / 2d), y + (37 / 2d), z + (37 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null))) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.7)) {
						if ((Math.random() < 0.2)) {
							if ((Math.random() < 0.5)) {
								if ((Math.random() < 0.4)) {
									if ((Math.random() < 0.6)) {
										if ((Math.random() < 0.6)) {
											if ((Math.random() < 0.4)) {
												if (world instanceof World && !world.isRemote()) {
													((World) world).playSound(null,
															new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()),
																	(int) (entity.getPosZ())),
															(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																	.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
															SoundCategory.NEUTRAL, (float) 1, (float) 1);
												} else {
													((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
															(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																	.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
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
			}
		}
	}
}
