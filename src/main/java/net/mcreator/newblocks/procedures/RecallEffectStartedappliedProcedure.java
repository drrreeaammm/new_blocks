package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class RecallEffectStartedappliedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure RecallEffectStartedapplied!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure RecallEffectStartedapplied!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"execute store result entity @s ForgeData.spawnX int 1 run data get entity @s SpawnX");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"execute store result entity @s ForgeData.spawnY int 1 run data get entity @s SpawnY");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"execute store result entity @s ForgeData.spawnZ int 1 run data get entity @s SpawnZ");
			}
		}
		if (entity instanceof PlayerEntity) {
			if (entity.getPersistentData().getDouble("spawnX") == 0 && entity.getPersistentData().getDouble("spawnZ") == 0) {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate((world.getWorldInfo().getSpawnX()), (world.getWorldInfo().getSpawnY()),
							(world.getWorldInfo().getSpawnZ()));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation((world.getWorldInfo().getSpawnX()),
								(world.getWorldInfo().getSpawnY()), (world.getWorldInfo().getSpawnZ()), _ent.rotationYaw, _ent.rotationPitch,
								Collections.emptySet());
					}
				}
				for (int index0 = 0; index0 < (int) (5); index0++) {
					entity.fallDistance = (float) (0);
				}
			} else {
				{
					Entity _ent = entity;
					_ent.setPositionAndUpdate((entity.getPersistentData().getDouble("spawnX")), (entity.getPersistentData().getDouble("spawnY")),
							(entity.getPersistentData().getDouble("spawnZ")));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPersistentData().getDouble("spawnX")),
								(entity.getPersistentData().getDouble("spawnY")), (entity.getPersistentData().getDouble("spawnZ")), _ent.rotationYaw,
								_ent.rotationPitch, Collections.emptySet());
					}
				}
				for (int index1 = 0; index1 < (int) (5); index1++) {
					entity.fallDistance = (float) (0);
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
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
								SoundCategory.PLAYERS, (float) 3, (float) 1);
					} else {
						((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
								SoundCategory.PLAYERS, (float) 3, (float) 1, false);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 3);
		} else {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate((world.getWorldInfo().getSpawnX()), (world.getWorldInfo().getSpawnY()), (world.getWorldInfo().getSpawnZ()));
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation((world.getWorldInfo().getSpawnX()), (world.getWorldInfo().getSpawnY()),
							(world.getWorldInfo().getSpawnZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
				}
			}
			for (int index2 = 0; index2 < (int) (5); index2++) {
				entity.fallDistance = (float) (0);
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
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) (entity.getPosX()), (int) (entity.getPosY()), (int) (entity.getPosZ())),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
								SoundCategory.PLAYERS, (float) 3, (float) 1);
					} else {
						((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:recall_potion_teleport")),
								SoundCategory.PLAYERS, (float) 3, (float) 1, false);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 3);
		}
	}
}
