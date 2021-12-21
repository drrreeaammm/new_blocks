package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.entity.player.ClientPlayerEntity;

import net.mcreator.newblocks.block.SkulkBlockBlock;
import net.mcreator.newblocks.block.SculkVineBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class GrantRecipesProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
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
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GrantRecipes!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SculkVineBlock.block)) : false)
				|| ((entity instanceof PlayerEntity)
						? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SkulkBlockBlock.block))
						: false)) {
			if (!(new Object() {
				public boolean hasRecipe(Entity _ent, ResourceLocation recipe) {
					if (_ent instanceof ServerPlayerEntity)
						return ((ServerPlayerEntity) _ent).getRecipeBook().isUnlocked(recipe);
					else if (_ent.world.isRemote() && _ent instanceof ClientPlayerEntity)
						return ((ClientPlayerEntity) _ent).getRecipeBook().isUnlocked(recipe);
					return false;
				}
			}.hasRecipe(entity, new ResourceLocation("new_blocks:sculk_sensor_recipe")))) {
				if (entity instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("new_blocks:sculk_sensor_recipe")});
				}
			}
		}
	}
}
