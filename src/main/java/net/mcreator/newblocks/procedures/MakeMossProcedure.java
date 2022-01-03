package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.SporeBlossomBlock;
import net.mcreator.newblocks.block.SmallSculkShroomBlock;
import net.mcreator.newblocks.block.SculkVineBlock;
import net.mcreator.newblocks.block.SculkSproutBlock;
import net.mcreator.newblocks.block.SculkShroomlightBlock;
import net.mcreator.newblocks.block.SculkSensorBlock;
import net.mcreator.newblocks.block.SculkBushBlock;
import net.mcreator.newblocks.block.MossBlock;
import net.mcreator.newblocks.block.MakeSculkBlock;
import net.mcreator.newblocks.block.GrimstoneBlock;
import net.mcreator.newblocks.block.FloweringAzaleaBlock;
import net.mcreator.newblocks.block.CavePlantBlock;
import net.mcreator.newblocks.block.BigDripleafBlock;
import net.mcreator.newblocks.block.AzaleaBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MakeMossProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MakeMoss!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MakeMoss!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MakeMoss!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MakeMoss!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double ycoord = 0;
		double ycoord2 = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (World.OVERWORLD)) {
			if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock())) {
					if (Math.random() < 0.8) {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MossBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MossBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.CLAY.getDefaultState(), 3);
					}
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock())) {
						if (0.04 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), MossBlock.block.getDefaultState(), 3);
						} else {
							world.setBlockState(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.CLAY.getDefaultState(), 3);
						}
					}
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MossBlock.block.getDefaultState(), 3);
						if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
								.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 2), (int) z))).getBlock())) {
							world.setBlockState(new BlockPos((int) x, (int) (y + 2), (int) z), MossBlock.block.getDefaultState(), 3);
							if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
									.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 3), (int) z))).getBlock())) {
								world.setBlockState(new BlockPos((int) x, (int) (y + 3), (int) z), MossBlock.block.getDefaultState(), 3);
								if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
										.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 4), (int) z))).getBlock())) {
									world.setBlockState(new BlockPos((int) x, (int) (y + 4), (int) z), MossBlock.block.getDefaultState(), 3);
									if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
											.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 5), (int) z))).getBlock())) {
										world.setBlockState(new BlockPos((int) x, (int) (y + 5), (int) z), MossBlock.block.getDefaultState(), 3);
									}
								}
							}
						}
					}
					if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), FloweringAzaleaBlock.block.getDefaultState(), 3);
					} else if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), AzaleaBlock.block.getDefaultState(), 3);
					} else if (0.1 >= Math.random()) {
						if (0.2 >= Math.random()) {
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
									world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.WATER.getDefaultState(), 3);
									if (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).isSolid()) {
										if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock()) {
											if (0.1 >= Math.random()) {
												world.setBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z),
														Blocks.WATER.getDefaultState(), 3);
											}
										}
									}
									if (world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).isSolid()) {
										if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock()) {
											if (0.1 >= Math.random()) {
												world.setBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z),
														Blocks.WATER.getDefaultState(), 3);
											}
										}
									}
									if (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).isSolid()) {
										if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock()) {
											if (0.1 >= Math.random()) {
												world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)),
														Blocks.WATER.getDefaultState(), 3);
											}
										}
									}
									if (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).isSolid()) {
										if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock()) {
											if (0.1 >= Math.random()) {
												world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)),
														Blocks.WATER.getDefaultState(), 3);
											}
										}
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 5);
						}
					} else if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GRASS.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), MossBlock.block.getDefaultState(), 3);
					} else if (0.1 >= Math.random()) {
						sx = (-3);
						found = (false);
						for (int index0 = 0; index0 < (int) (6); index0++) {
							sy = (-3);
							for (int index1 = 0; index1 < (int) (6); index1++) {
								sz = (-3);
								for (int index2 = 0; index2 < (int) (6); index2++) {
									if ((world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz)))).getBlock() == Blocks.WATER
											|| (world.getBlockState(new BlockPos((int) (x + sx), (int) (y + sy), (int) (z + sz))))
													.getBlock() == Blocks.WATER) {
										found = (true);
									}
									sz = (sz + 1);
								}
								sy = (sy + 1);
							}
							sx = (sx + 1);
						}
						if (found == true) {
							if (0.1 >= Math.random()) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BigDripleafBlock.block.getDefaultState(), 3);
							}
						}
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					}
				} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
					if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MossBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SporeBlossomBlock.block.getDefaultState(), 3);
					}
				} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
					world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MossBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), CavePlantBlock.block.getDefaultState(), 3);
				} else {
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
							.contains((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock())) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), MossBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					}
				}
			}
		} else {
			if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()) {
				if (GrimstoneBlock.block == (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock()) {
					world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), GrimstoneBlock.block.getDefaultState(), 3);
					if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SmallSculkShroomBlock.block.getDefaultState(), 3);
					} else if (0.1 >= Math.random()) {
						if (world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SculkSproutBlock.block.getDefaultState(), 3);
						}
					} else if (0.2 >= Math.random()) {
						if (0.1 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SculkVineBlock.block.getDefaultState(), 3);
							for (int index3 = 0; index3 < (int) (23); index3++) {
								ycoord = (ycoord + 1);
								if (world.isAirBlock(new BlockPos((int) x, (int) (y + ycoord), (int) z))) {
									world.setBlockState(new BlockPos((int) x, (int) (y + ycoord), (int) z), SculkVineBlock.block.getDefaultState(),
											3);
								} else {
									break;
								}
							}
						}
					} else if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SculkBushBlock.block.getDefaultState(), 3);
					} else if (0.1 >= Math.random()) {
						if (0.1 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SculkSensorBlock.block.getDefaultState(), 3);
						}
					} else if (0.1 >= Math.random()) {
						if (0.1 >= Math.random()) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), MakeSculkBlock.block.getDefaultState(), 3);
						}
					} else {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
					}
				} else if (0.1 >= Math.random()
						&& GrimstoneBlock.block == (world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock()) {
					if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), SculkShroomlightBlock.block.getDefaultState(), 3);
					}
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			}
		}
	}
}
