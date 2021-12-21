package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.Hand;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class OmbieTakeItemProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingAttackEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				Entity imediatesourceentity = event.getSource().getImmediateSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("imediatesourceentity", imediatesourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure OmbieTakeItem!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure OmbieTakeItem!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure OmbieTakeItem!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof ZombieEntity) {
			if (Math.random() < 0.4) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() instanceof SwordItem) {
					if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (sourceentity instanceof LivingEntity) {
							ItemStack _setstack = (((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getHeldItemMainhand()
									: ItemStack.EMPTY).copy());
							_setstack.setCount((int) 1);
							((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
							if (sourceentity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) sourceentity).inventory.markDirty();
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
								if (entity instanceof LivingEntity) {
									ItemStack _setstack = new ItemStack(Blocks.AIR);
									_setstack.setCount((int) 1);
									((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
									if (entity instanceof ServerPlayerEntity)
										((ServerPlayerEntity) entity).inventory.markDirty();
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 1);
					}
				} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() instanceof PickaxeItem) {
					if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (sourceentity instanceof LivingEntity) {
							ItemStack _setstack = (((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getHeldItemMainhand()
									: ItemStack.EMPTY).copy());
							_setstack.setCount((int) 1);
							((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
							if (sourceentity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) sourceentity).inventory.markDirty();
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
								if (entity instanceof LivingEntity) {
									ItemStack _setstack = new ItemStack(Blocks.AIR);
									_setstack.setCount((int) 1);
									((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
									if (entity instanceof ServerPlayerEntity)
										((ServerPlayerEntity) entity).inventory.markDirty();
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 1);
					}
				} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() instanceof AxeItem) {
					if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (sourceentity instanceof LivingEntity) {
							ItemStack _setstack = (((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getHeldItemMainhand()
									: ItemStack.EMPTY).copy());
							_setstack.setCount((int) 1);
							((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
							if (sourceentity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) sourceentity).inventory.markDirty();
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
								if (entity instanceof LivingEntity) {
									ItemStack _setstack = new ItemStack(Blocks.AIR);
									_setstack.setCount((int) 1);
									((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
									if (entity instanceof ServerPlayerEntity)
										((ServerPlayerEntity) entity).inventory.markDirty();
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 1);
					}
				} else if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() instanceof ShovelItem) {
					if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == Blocks.AIR.asItem()) {
						if (sourceentity instanceof LivingEntity) {
							ItemStack _setstack = (((entity instanceof LivingEntity)
									? ((LivingEntity) entity).getHeldItemMainhand()
									: ItemStack.EMPTY).copy());
							_setstack.setCount((int) 1);
							((LivingEntity) sourceentity).setHeldItem(Hand.MAIN_HAND, _setstack);
							if (sourceentity instanceof ServerPlayerEntity)
								((ServerPlayerEntity) sourceentity).inventory.markDirty();
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
								if (entity instanceof LivingEntity) {
									ItemStack _setstack = new ItemStack(Blocks.AIR);
									_setstack.setCount((int) 1);
									((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
									if (entity instanceof ServerPlayerEntity)
										((ServerPlayerEntity) entity).inventory.markDirty();
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 1);
					}
				}
			}
		}
	}
}
