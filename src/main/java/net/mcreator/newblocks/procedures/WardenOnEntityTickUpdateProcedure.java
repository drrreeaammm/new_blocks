package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class WardenOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure WardenOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
		if (entity.getPersistentData().getDouble("wardenAnger") > 2) {
			entity.getPersistentData().putDouble("wardenAnger", 0);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (10 / 2d), y - (10 / 2d), z - (10 / 2d), x + (10 / 2d), y + (10 / 2d), z + (10 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof PlayerEntity) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.5) {
							if (Math.random() < 0.3) {
								if (Math.random() < 0.5) {
									if (Math.random() < 0.3) {
										if (Math.random() < 0.3) {
											if (Math.random() < 0.3) {
												if (Math.random() < 0.2) {
													if (world instanceof World && !world.isRemote()) {
														((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																		.getValue(new ResourceLocation("new_blocks:warden_angry")),
																SoundCategory.AMBIENT, (float) 1, (float) 1);
													} else {
														((World) world).playSound(x, y, z,
																(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																		.getValue(new ResourceLocation("new_blocks:warden_angry")),
																SoundCategory.AMBIENT, (float) 1, (float) 1, false);
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
				if (!EntityTypeTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_mobs")).contains(entityiterator.getType())) {
					if ((entityiterator.getMotion().getX() > 0.5 || entityiterator.getMotion().getZ() > 0.5) && !entityiterator.isSneaking()) {
						entity.getPersistentData().putBoolean("beingDetected", (true));
					}
				}
			}
		}
	}
}
