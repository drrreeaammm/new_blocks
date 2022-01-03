package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.block.DripleafStemBlock;
import net.mcreator.newblocks.block.BigDripleafBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class BigDripleafOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BigDripleafOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure BigDripleafOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure BigDripleafOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure BigDripleafOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BigDripleafOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
				(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = BigDripleafBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
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
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), _bs.with(_property, (new Object() {
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
						}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
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
								}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
			}
		} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == BigDripleafBlock.block.asItem()) {
			if (world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
				(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
				{
					BlockPos _bp = new BlockPos((int) x, (int) (y + 1), (int) z);
					BlockState _bs = BigDripleafBlock.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
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
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
				try {
					BlockState _bs = world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), _bs.with(_property, (new Object() {
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
						}.getDirection(new BlockPos((int) x, (int) y, (int) z)))), 3);
					} else {
						world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z),
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
								}.getDirection(new BlockPos((int) x, (int) y, (int) z))).getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
				}
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wet_grass.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wet_grass.place")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		}
	}
}
