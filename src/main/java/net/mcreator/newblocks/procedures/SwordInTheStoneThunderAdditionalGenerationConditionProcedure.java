package net.mcreator.newblocks.procedures;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SwordInTheStoneThunderAdditionalGenerationConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SwordInTheStoneThunderAdditionalGenerationCondition!");
			return false;
		}
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		return y > 90;
	}
}
