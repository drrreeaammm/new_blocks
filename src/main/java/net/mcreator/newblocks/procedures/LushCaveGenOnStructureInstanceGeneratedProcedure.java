package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.SummonTheBlocksBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class LushCaveGenOnStructureInstanceGeneratedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure LushCaveGenOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure LushCaveGenOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure LushCaveGenOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure LushCaveGenOnStructureInstanceGenerated!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				for (int index0 = 0; index0 < (int) (3); index0++) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 20), (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) (y - 40), (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) (y - 51), (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							world.setBlockState(new BlockPos((int) x, (int) (y - 20), (int) z), SummonTheBlocksBlock.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y - 40), (int) z), SummonTheBlocksBlock.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y - 50), (int) z), SummonTheBlocksBlock.block.getDefaultState(), 3);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 2);
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							world.setBlockState(new BlockPos((int) x, (int) (y - 21), (int) z), Blocks.STONE.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y - 41), (int) z), Blocks.STONE.getDefaultState(), 3);
							world.setBlockState(new BlockPos((int) x, (int) (y - 51), (int) z), Blocks.STONE.getDefaultState(), 3);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 20);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 100);
	}
}
