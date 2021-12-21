package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class BossSkeletonSpawnProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntitySpawned(EntityJoinWorldEvent event) {
			Entity entity = event.getEntity();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BossSkeletonSpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure BossSkeletonSpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure BossSkeletonSpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure BossSkeletonSpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BossSkeletonSpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof SkeletonEntity) {
			if (Math.random() < 0.2) {
				if (Math.random() < 0.3) {
					if (Math.random() < 0.4) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.1) {
								if (!entity.world.isRemote())
									entity.remove();
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
													new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
											"summon skeleton ~ ~ ~ {CustomNameVisible:1b,AbsorptionAmount:5f,Health:80f,CustomName:'{\"text\":\"Boss\"}',HandItems:[{id:\"minecraft:bow\",Count:1b,tag:{Enchantments:[{id:\"minecraft:power\",lvl:4s}]}},{}],ArmorItems:[{id:\"minecraft:netherite_boots\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:6s}]}},{id:\"minecraft:diamond_leggings\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:6s},{id:\"minecraft:thorns\",lvl:4s}]}},{id:\"minecraft:diamond_chestplate\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:6s}]}},{id:\"minecraft:diamond_helmet\",Count:1b,tag:{Enchantments:[{id:\"minecraft:protection\",lvl:6s}],AttributeModifiers:[{AttributeName:\"generic.max_health\",Name:\"generic.max_health\",Amount:6,Operation:0,UUID:[I;204636090,-548649842,-1759728408,-1479138811],Slot:\"head\"},{AttributeName:\"generic.armor\",Name:\"generic.armor\",Amount:7,Operation:0,UUID:[I;690287516,1667909044,-1682001788,1627438830],Slot:\"head\"}]}}],Attributes:[{Name:generic.max_health,Base:80},{Name:generic.follow_range,Base:150}]}");
								}
							}
						}
					}
				}
			}
		}
	}
}
