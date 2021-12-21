package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class LaserGunRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure LaserGunRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure LaserGunRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure LaserGunRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure LaserGunRightClickedInAir!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure LaserGunRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double raytrace_distance = 0;
		raytrace_distance = 1;
		for (int index0 = 0; index0 < (int) (14); index0++) {
			if (!world.getBlockState(new BlockPos(
					(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
									entity.getLook(1f).z * raytrace_distance),
							RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
					(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
									entity.getLook(1f).z * raytrace_distance),
							RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
					(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
							entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
									entity.getLook(1f).z * raytrace_distance),
							RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
					.isSolid() || raytrace_distance < 14) {
				raytrace_distance = (raytrace_distance + 1);
				world.addParticle(ParticleTypes.FLAME, x, (y + 1), z, ((Math.sin(Math.toRadians(entity.rotationYaw + 180)) * raytrace_distance) / 2),
						((Math.sin(Math.toRadians(0 - entity.rotationPitch)) * raytrace_distance) / 2),
						((Math.cos(Math.toRadians(entity.rotationYaw)) * raytrace_distance) / 2));
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null,
							new BlockPos(
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
									(int) (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
											entity.getLook(1f).z * raytrace_distance),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
											entity.getLook(1f).z * raytrace_distance),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
							(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
									entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance, entity.getLook(1f).y * raytrace_distance,
											entity.getLook(1f).z * raytrace_distance),
									RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.shoot")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) - (1 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()) - (1 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) - (1 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()) + (1 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()) + (1 / 2d),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()) + (1 / 2d)),
									null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
									(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * raytrace_distance,
													entity.getLook(1f).y * raytrace_distance, entity.getLook(1f).z * raytrace_distance),
											RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity) && entityiterator instanceof LivingEntity && !((entity.getRidingEntity()) == entityiterator)
								&& !((entityiterator.getRidingEntity()) == entity)) {
							entityiterator.attackEntityFrom(DamageSource.MAGIC, (float) 5);
						}
					}
				}
			}
		}
	}
}
