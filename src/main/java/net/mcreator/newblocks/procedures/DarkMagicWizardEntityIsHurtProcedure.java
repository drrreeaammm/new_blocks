package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;
import java.util.Collections;

public class DarkMagicWizardEntityIsHurtProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DarkMagicWizardEntityIsHurt!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DarkMagicWizardEntityIsHurt!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DarkMagicWizardEntityIsHurt!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DarkMagicWizardEntityIsHurt!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DarkMagicWizardEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double posx = 0;
		double posy = 0;
		double posZ = 0;
		if ((Math.random() < 0.3)) {
			posx = (double) ((new Random()).nextInt((int) 8 + 1));
			posy = (double) ((new Random()).nextInt((int) 2 + 1));
			posZ = (double) ((new Random()).nextInt((int) 8 + 1));
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if ((world.canBlockSeeSky(new BlockPos((int) (x + posx), (int) (y + posy), (int) (z + posZ))))) {
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((x + posx), (y + posy), (z + posZ));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + posx), (y + posy), (z + posZ), _ent.rotationYaw,
									_ent.rotationPitch, Collections.emptySet());
						}
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 60, (int) 1, (false), (false)));
					break;
				} else {
					posy = (double) ((new Random()).nextInt((int) 2 + 1));
					posx = (double) ((new Random()).nextInt((int) 8 + 1));
					posZ = (double) ((new Random()).nextInt((int) 8 + 1));
				}
			}
		}
	}
}
