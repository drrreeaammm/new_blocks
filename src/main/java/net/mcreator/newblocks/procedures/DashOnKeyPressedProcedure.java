package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.newblocks.world.HowFastDashGameRule;
import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DashOnKeyPressedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DashOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DashOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			{
				double _setval = (double) (((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new NewBlocksModVariables.PlayerVariables())).dash) - 0);
				entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.dash = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			entity.setMotion((0 - Math.sin(((entity.rotationYaw) * (Math.PI / 180)))), 0.4, Math.cos(((entity.rotationYaw) * (Math.PI / 180))));
		} else if ((new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayerEntity) {
					return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.SURVIVAL;
				} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
					NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
							.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
					return _npi != null && _npi.getGameType() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if ((entity.isOnGround())) {
				if (((world.getWorldInfo().getGameRulesInstance().getInt(HowFastDashGameRule.gamerule)) == 1)) {
					if ((((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NewBlocksModVariables.PlayerVariables())).dash) > 5)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 8, (int) 0, (false), (false)));
						{
							double _setval = (double) (((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NewBlocksModVariables.PlayerVariables())).dash) - 5);
							entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.dash = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.setMotion((0 - Math.sin(((entity.rotationYaw) * (Math.PI / 180)))), 0.1,
								Math.cos(((entity.rotationYaw) * (Math.PI / 180))));
						if ((Math.random() < 0.7)) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).getFoodStats().setFoodLevel(
										(int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) - 1));
						} else if ((Math.random() < 0.4)) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).getFoodStats().setFoodLevel(
										(int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) - 2));
						}
					}
				} else if (((world.getWorldInfo().getGameRulesInstance().getInt(HowFastDashGameRule.gamerule)) == 2)) {
					if ((((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NewBlocksModVariables.PlayerVariables())).dash) > 5)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 8, (int) 0, (false), (false)));
						{
							double _setval = (double) (((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NewBlocksModVariables.PlayerVariables())).dash) - 5);
							entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.dash = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.setMotion((0 - Math.sin(((entity.rotationYaw) * (Math.PI / 180)))), 0.2,
								Math.cos(((entity.rotationYaw) * (Math.PI / 180))));
						if ((Math.random() < 0.7)) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).getFoodStats().setFoodLevel(
										(int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) - 1));
						} else if ((Math.random() < 0.4)) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).getFoodStats().setFoodLevel(
										(int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) - 2));
						}
					}
				} else if (((world.getWorldInfo().getGameRulesInstance().getInt(HowFastDashGameRule.gamerule)) == 3)) {
					if ((((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new NewBlocksModVariables.PlayerVariables())).dash) > 5)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 8, (int) 0, (false), (false)));
						{
							double _setval = (double) (((entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new NewBlocksModVariables.PlayerVariables())).dash) - 5);
							entity.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.dash = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.setMotion((0 - Math.sin(((entity.rotationYaw) * (Math.PI / 180)))), 0.3,
								Math.cos(((entity.rotationYaw) * (Math.PI / 180))));
						if ((Math.random() < 0.7)) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).getFoodStats().setFoodLevel(
										(int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) - 1));
						} else if ((Math.random() < 0.4)) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).getFoodStats().setFoodLevel(
										(int) (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).getFoodStats().getFoodLevel() : 0) - 2));
						}
					}
				}
			}
		}
	}
}
