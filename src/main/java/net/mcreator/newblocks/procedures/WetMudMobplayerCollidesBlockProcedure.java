package net.mcreator.newblocks.procedures;

import net.minecraft.util.Hand;
import net.minecraft.tags.FluidTags;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.MudBottleItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class WetMudMobplayerCollidesBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure WetMudMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.areEyesInFluid(FluidTags.WATER))) {
			if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == Items.GLASS_BOTTLE)) {
				if ((Math.random() < 0.7)) {
					if ((Math.random() < 0.7)) {
						if ((Math.random() < 0.7)) {
							if ((Math.random() < 0.7)) {
								if (entity instanceof LivingEntity) {
									ItemStack _setstack = new ItemStack(MudBottleItem.block);
									_setstack.setCount((int) 1);
									((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
									if (entity instanceof ServerPlayerEntity)
										((ServerPlayerEntity) entity).inventory.markDirty();
								}
							}
						}
					}
				}
			}
		}
	}
}
