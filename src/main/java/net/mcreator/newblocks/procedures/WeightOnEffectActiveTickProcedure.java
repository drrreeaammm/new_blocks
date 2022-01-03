package net.mcreator.newblocks.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.potion.WeightPotionEffect;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collection;

public class WeightOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure WeightOnEffectActiveTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WeightPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) == 0) {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() - 0.01), (entity.getMotion().getZ()));
		} else if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WeightPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) == 1) {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() - 0.02), (entity.getMotion().getZ()));
		} else if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WeightPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) == 2) {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() - 0.03), (entity.getMotion().getZ()));
		} else if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WeightPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) == 3) {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() - 0.04), (entity.getMotion().getZ()));
		} else {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() - 0.06), (entity.getMotion().getZ()));
		}
		if (new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WeightPotionEffect.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity) > 1) {
			if (entity instanceof PlayerEntity) {
				if (((PlayerEntity) entity).isSwimming()) {
					entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() - 0.08), (entity.getMotion().getZ()));
				}
			}
		}
	}
}
