package net.mcreator.newblocks.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.entity.player.ClientPlayerEntity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class ShulkerLeggingsTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure ShulkerLeggingsTickEvent!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ShulkerLeggingsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).isElytraFlying() : false) {
			if (entity instanceof ClientPlayerEntity) {
				((ClientPlayerEntity) entity).movementInput.sneaking = (true);
			}
			entity.setSneaking((true));
		}
	}
}
