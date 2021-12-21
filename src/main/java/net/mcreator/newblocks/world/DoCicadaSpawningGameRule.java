package net.mcreator.newblocks.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.newblocks.NewBlocksModElements;

import java.lang.reflect.Method;

@NewBlocksModElements.ModElement.Tag
public class DoCicadaSpawningGameRule extends NewBlocksModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("doCicadaSpawning", GameRules.Category.SPAWNING,
			create(true));

	public DoCicadaSpawningGameRule(NewBlocksModElements instance) {
		super(instance, 600);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
