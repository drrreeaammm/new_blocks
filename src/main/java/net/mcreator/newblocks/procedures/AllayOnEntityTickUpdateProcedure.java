package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class AllayOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure AllayOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false) {
			if (!entity.world.isRemote())
				entity.remove();
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof LivingEntity)
						((LivingEntity) entityiterator).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 40, (int) 1, (false), (true)));
				}
			}
		}
	}
}
