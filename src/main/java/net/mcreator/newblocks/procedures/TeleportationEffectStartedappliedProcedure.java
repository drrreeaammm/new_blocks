package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;
import java.util.Collections;

public class TeleportationEffectStartedappliedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure TeleportationEffectStartedapplied!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TeleportationEffectStartedapplied!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double teleportxpos = 0;
		double teleportypos = 0;
		double teleportzpos = 0;
		NewBlocksModVariables.WorldVariables.get(world).ReturnXValue = ((new Random())
				.nextInt((int) (10000 - (new Random()).nextInt((int) 8000 + 1)) + 1));
		NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		NewBlocksModVariables.WorldVariables.get(world).ReturnZValue = ((new Random())
				.nextInt((int) (10000 - (new Random()).nextInt((int) 8000 + 1)) + 1));
		NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		NewBlocksModVariables.WorldVariables.get(world).ReturnYValue = ((new Random()).nextInt((int) 55 + 1));
		NewBlocksModVariables.WorldVariables.get(world).syncData(world);
		if (entity instanceof PlayerEntity) {
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
					if ((world.getBlockState(new BlockPos((int) NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
							(int) (NewBlocksModVariables.WorldVariables.get(world).ReturnYValue + 1),
							(int) NewBlocksModVariables.WorldVariables.get(world).ReturnZValue))).getBlock() == Blocks.CAVE_AIR) {
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate(NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
									NewBlocksModVariables.WorldVariables.get(world).ReturnYValue,
									NewBlocksModVariables.WorldVariables.get(world).ReturnZValue);
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation(NewBlocksModVariables.WorldVariables.get(world).ReturnXValue,
										NewBlocksModVariables.WorldVariables.get(world).ReturnYValue,
										NewBlocksModVariables.WorldVariables.get(world).ReturnZValue, _ent.rotationYaw, _ent.rotationPitch,
										Collections.emptySet());
							}
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null,
									new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
									SoundCategory.PLAYERS, (float) 3, (float) 1);
						} else {
							((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
									SoundCategory.PLAYERS, (float) 3, (float) 1, false);
						}
						for (int index0 = 0; index0 < (int) (50); index0++) {
							entity.fallDistance = (float) (0);
						}
					} else {
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate(((new Random()).nextInt((int) (10000 - (new Random()).nextInt((int) 8000 + 1)) + 1)),
									(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getPosX()), (int) (entity.getPosZ()))
											+ 8.5),
									((new Random()).nextInt((int) (10000 - (new Random()).nextInt((int) 8000 + 1)) + 1)));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation(
										((new Random()).nextInt((int) (10000 - (new Random()).nextInt((int) 8000 + 1)) + 1)),
										(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (entity.getPosX()), (int) (entity.getPosZ()))
												+ 8.5),
										((new Random()).nextInt((int) (10000 - (new Random()).nextInt((int) 8000 + 1)) + 1)), _ent.rotationYaw,
										_ent.rotationPitch, Collections.emptySet());
							}
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null,
									new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
									SoundCategory.PLAYERS, (float) 3, (float) 1);
						} else {
							((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
											.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
									SoundCategory.PLAYERS, (float) 3, (float) 1, false);
						}
						for (int index1 = 0; index1 < (int) (50); index1++) {
							entity.fallDistance = (float) (0);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 2);
		} else {
			if (!entity.world.isRemote())
				entity.remove();
		}
	}
}
