package net.mcreator.newblocks.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MeowmereMakeItemGlowProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure MeowmereMakeItemGlow!");
			return false;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		return itemstack.getOrCreateTag().getDouble("powered") == 1;
	}
}
