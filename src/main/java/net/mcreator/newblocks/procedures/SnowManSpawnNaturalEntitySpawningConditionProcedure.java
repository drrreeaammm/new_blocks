package net.mcreator.newblocks.procedures;

import java.util.Map;
import java.util.Calendar;

public class SnowManSpawnNaturalEntitySpawningConditionProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		return Calendar.getInstance().get(Calendar.MONTH) == 11 || Calendar.getInstance().get(Calendar.MONTH) == 12
				|| Calendar.getInstance().get(Calendar.MONTH) == 1 || Calendar.getInstance().get(Calendar.MONTH) == 2;
	}
}
