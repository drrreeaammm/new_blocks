package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.block.DripleafStemBlock;
import net.mcreator.newblocks.block.BigDripleafBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class BigDripleafBlockAddedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BigDripleafBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure BigDripleafBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure BigDripleafBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure BigDripleafBlockAdded!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == BigDripleafBlock.block) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) (y - 1), (int) z);
				BlockState _bs = DripleafStemBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlockState(_bp, _bs, 3);
			}
			try {
				BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
				if (_property != null) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), _bs.with(_property, (new Object() {
						public Direction getDirection(BlockPos pos) {
							try {
								BlockState _bs = world.getBlockState(pos);
								DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
								if (property != null)
									return _bs.get(property);
								return Direction.getFacingFromAxisDirection(
										_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
										Direction.AxisDirection.POSITIVE);
							} catch (Exception e) {
								return Direction.NORTH;
							}
						}
					}.getDirection(new BlockPos((int) x, (int) (y - 1), (int) z)))), 3);
				} else {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
							_bs.with((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), (new Object() {
								public Direction getDirection(BlockPos pos) {
									try {
										BlockState _bs = world.getBlockState(pos);
										DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
										if (property != null)
											return _bs.get(property);
										return Direction.getFacingFromAxisDirection(
												_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
												Direction.AxisDirection.POSITIVE);
									} catch (Exception e) {
										return Direction.NORTH;
									}
								}
							}.getDirection(new BlockPos((int) x, (int) (y - 1), (int) z))).getAxis()), 3);
				}
			} catch (Exception e) {
			}
		}
		if (!world.isRemote()) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().putBoolean("yyy", (true));
			if (world instanceof World)
				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
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
				if (!world.isRemote()) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().putBoolean("yyy", (false));
					if (world instanceof World)
						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 35);
	}
}
