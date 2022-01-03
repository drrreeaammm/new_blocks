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

import net.mcreator.newblocks.item.RedGlowBerriesItem;
import net.mcreator.newblocks.item.PurpleGlowBerriesItem;
import net.mcreator.newblocks.item.GlowBerriesItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class GiveRecipesDyeProcedure {
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
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GiveRecipesDye!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(GlowBerriesItem.block)) : false) {
			if (entity instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("new_blocks:yellow_dye_recipe")});
			}
		}
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RedGlowBerriesItem.block)) : false) {
			if (entity instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("new_blocks:red_dye_recipe")});
			}
		}
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(PurpleGlowBerriesItem.block)) : false) {
			if (entity instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) entity).unlockRecipes(new ResourceLocation[]{new ResourceLocation("new_blocks:purple_dye_recipe")});
			}
		}
	}
}
