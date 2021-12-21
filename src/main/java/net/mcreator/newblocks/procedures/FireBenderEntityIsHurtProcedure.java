package net.mcreator.newblocks.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class FireBenderEntityIsHurtProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure FireBenderEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure FireBenderEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure FireBenderEntityIsHurt!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure FireBenderEntityIsHurt!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 50, (int) 1, (false), (false)));
		if (5 >= Math.random() * 10) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x + Math.random() * 10), y, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + Math.random() * 10), y, z, _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
			if (5 >= Math.random() * 10) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, y, (z + Math.random() * 10));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z + Math.random() * 10), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			} else {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, y, (z - Math.random() * 10));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z - Math.random() * 10), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			}
		} else {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((x - Math.random() * 10), y, z);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((x - Math.random() * 10), y, z, _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
			if (5 >= Math.random() * 10) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, y, (z + Math.random() * 10));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z + Math.random() * 10), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			} else {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate(x, y, (z - Math.random() * 10));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(x, y, (z - Math.random() * 10), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
			}
		}
	}
}
