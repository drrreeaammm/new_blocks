package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class JumpAndPlaceABlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure JumpAndPlaceABlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure JumpAndPlaceABlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure JumpAndPlaceABlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure JumpAndPlaceABlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure JumpAndPlaceABlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double varx = 0;
		double varz = 0;
		if (x < 0) {
			NewBlocksModVariables.WorldVariables.get(world).varX = (x - 1);
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		} else {
			NewBlocksModVariables.WorldVariables.get(world).varX = x;
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		}
		if (z < 0) {
			NewBlocksModVariables.WorldVariables.get(world).varZ = (z - 1);
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		} else {
			NewBlocksModVariables.WorldVariables.get(world).varZ = z;
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 30, (int) 7, (false), (false)));
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							{
								Entity _ent = entity;
								_ent.setPositionAndUpdate(NewBlocksModVariables.WorldVariables.get(world).varX, (y + 1),
										NewBlocksModVariables.WorldVariables.get(world).varZ);
								if (_ent instanceof ServerPlayerEntity) {
									((ServerPlayerEntity) _ent).connection.setPlayerLocation(NewBlocksModVariables.WorldVariables.get(world).varX,
											(y + 1), NewBlocksModVariables.WorldVariables.get(world).varZ, _ent.rotationYaw, _ent.rotationPitch,
											Collections.emptySet());
								}
							}
							new Object() {
								private int ticks = 0;
								private float waitTicks;
								private IWorld world;

								public void start(IWorld world, int waitTicks) {
									this.waitTicks = waitTicks;
									MinecraftForge.EVENT_BUS.register(this);
									this.world = world;
								}

								@SubscribeEvent
								public void tick(TickEvent.ServerTickEvent event) {
									if (event.phase == TickEvent.Phase.END) {
										this.ticks += 1;
										if (this.ticks >= this.waitTicks)
											run();
									}
								}

								private void run() {
									world.setBlockState(
											new BlockPos((int) NewBlocksModVariables.WorldVariables.get(world).varX, (int) (y - 1),
													(int) NewBlocksModVariables.WorldVariables.get(world).varZ),
											Blocks.COBBLESTONE.getDefaultState(), 3);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 8);
						}
					}
				}
			}
		}
	}
}
