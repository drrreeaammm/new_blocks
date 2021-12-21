package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.MeteorEntityEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class ReProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure Re!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure Re!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure Re!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure Re!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure Re!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double RandomZ = 0;
		double RandomX = 0;
		double Y = 0;
		double Level = 0;
		boolean LaunchStatus = false;
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00C2\u00A7oCalling \u00C2\u00A76\u00C2\u00A7lMeteor Strike..."),
					(false));
		}
		LaunchStatus = (false);
		while (LaunchStatus == false) {
			if (Math.random() < 0.01) {
				if (Math.random() < 0.01) {
					LaunchStatus = (true);
				}
			}
		}
		if (LaunchStatus == true) {
			if (Math.random() < 0.5) {
				Level = 2;
			} else {
				Level = 1;
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(("Success calling a meteor strike with level " + Level + " !")),
						(false));
			}
			for (int index1 = 0; index1 < (int) (10 * Level); index1++) {
				if (Math.random() < 0.5) {
					RandomX = (x + Math.random() * 60);
				} else {
					RandomX = (x - Math.random() * 60);
				}
				if (Math.random() < 0.5) {
					RandomZ = (z + Math.random() * 60);
				} else {
					RandomZ = (z - Math.random() * 60);
				}
				Y = (y + 40);
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new MeteorEntityEntity.CustomEntity(MeteorEntityEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(RandomX, Y, RandomZ, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index2 = 0; index2 < (int) (7 * Level); index2++) {
				if (Math.random() < 0.5) {
					RandomX = (x + Math.random() * 40);
				} else {
					RandomX = (x - Math.random() * 40);
				}
				if (Math.random() < 0.5) {
					RandomZ = (z + Math.random() * 40);
				} else {
					RandomZ = (z - Math.random() * 40);
				}
				Y = (y + 70);
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new MeteorEntityEntity.CustomEntity(MeteorEntityEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(RandomX, Y, RandomZ, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index3 = 0; index3 < (int) (4 * Level); index3++) {
				if (Math.random() < 0.5) {
					RandomX = (x + Math.random() * 40);
				} else {
					RandomX = (x - Math.random() * 40);
				}
				if (Math.random() < 0.5) {
					RandomZ = (z + Math.random() * 40);
				} else {
					RandomZ = (z - Math.random() * 40);
				}
				Y = (y + 100);
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new MeteorEntityEntity.CustomEntity(MeteorEntityEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(RandomX, Y, RandomZ, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world)
						.playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:sculk_crystal_summon")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
								.getValue(new ResourceLocation("new_blocks:sculk_crystal_summon")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00C2\u00A78\u00C2\u00A7nA meteor srtike is occuring nearby!"),
						(false));
			}
		}
	}
}
