
package net.mcreator.newblocks.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.World;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.FlyingPathNavigator;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.horse.TraderLlamaEntity;
import net.minecraft.entity.passive.horse.SkeletonHorseEntity;
import net.minecraft.entity.passive.horse.MuleEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.WaterMobEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.passive.MooshroomEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.ZoglinEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.StrayEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.PhantomEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.HoglinEntity;
import net.minecraft.entity.monster.GiantEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.controller.FlyingMovementController;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureAttribute;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.procedures.CrimsonVexThisEntityKillsAnotherOneProcedure;
import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.entity.renderer.CrimsonVexRenderer;
import net.mcreator.newblocks.NewBlocksModElements;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumSet;

@NewBlocksModElements.ModElement.Tag
public class CrimsonVexEntity extends NewBlocksModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new).immuneToFire()
			.size(0.7000000000000001f, 1.7f)).build("crimson_vex").setRegistryName("crimson_vex");
	public CrimsonVexEntity(NewBlocksModElements instance) {
		super(instance, 14);
		FMLJavaModLoadingContext.get().getModEventBus().register(new CrimsonVexRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -3664619, -6352623, new Item.Properties().group(NewblocksItemGroup.tab))
				.setRegistryName("crimson_vex_spawn_egg"));
	}

	@SubscribeEvent
	public void addFeatureToBiomes(BiomeLoadingEvent event) {
		boolean biomeCriteria = false;
		if (new ResourceLocation("crimson_forest").equals(event.getName()))
			biomeCriteria = true;
		if (new ResourceLocation("nether_wastes").equals(event.getName()))
			biomeCriteria = true;
		if (!biomeCriteria)
			return;
		event.getSpawns().getSpawner(EntityClassification.MONSTER).add(new MobSpawnInfo.Spawners(entity, 2, 1, 3));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		EntitySpawnPlacementRegistry.register(entity, EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
				MonsterEntity::canMonsterSpawn);
	}
	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.5);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 50);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 1.4000000000000001);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 3);
			ammma = ammma.createMutableAttribute(Attributes.FLYING_SPEED, 0.5);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 7;
			setNoAI(false);
			this.setItemStackToSlot(EquipmentSlotType.MAINHAND, new ItemStack(Items.IRON_SWORD));
			this.moveController = new FlyingMovementController(this, 10, true);
			this.navigator = new FlyingPathNavigator(this, this.world);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new Goal() {
				{
					this.setMutexFlags(EnumSet.of(Goal.Flag.MOVE));
				}
				public boolean shouldExecute() {
					if (CustomEntity.this.getAttackTarget() != null && !CustomEntity.this.getMoveHelper().isUpdating()) {
						return true;
					} else {
						return false;
					}
				}

				@Override
				public boolean shouldContinueExecuting() {
					return CustomEntity.this.getMoveHelper().isUpdating() && CustomEntity.this.getAttackTarget() != null
							&& CustomEntity.this.getAttackTarget().isAlive();
				}

				@Override
				public void startExecuting() {
					LivingEntity livingentity = CustomEntity.this.getAttackTarget();
					Vector3d vec3d = livingentity.getEyePosition(1);
					CustomEntity.this.moveController.setMoveTo(vec3d.x, vec3d.y, vec3d.z, 1.5);
				}

				@Override
				public void tick() {
					LivingEntity livingentity = CustomEntity.this.getAttackTarget();
					if (CustomEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
						CustomEntity.this.attackEntityAsMob(livingentity);
					} else {
						double d0 = CustomEntity.this.getDistanceSq(livingentity);
						if (d0 < 16) {
							Vector3d vec3d = livingentity.getEyePosition(1);
							CustomEntity.this.moveController.setMoveTo(vec3d.x, vec3d.y, vec3d.z, 1.5);
						}
					}
				}
			});
			this.goalSelector.addGoal(2, new RandomWalkingGoal(this, 1.2, 20) {
				@Override
				protected Vector3d getPosition() {
					Random random = CustomEntity.this.getRNG();
					double dir_x = CustomEntity.this.getPosX() + ((random.nextFloat() * 2 - 1) * 16);
					double dir_y = CustomEntity.this.getPosY() + ((random.nextFloat() * 2 - 1) * 16);
					double dir_z = CustomEntity.this.getPosZ() + ((random.nextFloat() * 2 - 1) * 16);
					return new Vector3d(dir_x, dir_y, dir_z);
				}
			});
			this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.5, true));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Entity404Entity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WandererEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, HerobrineEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, HazbandoEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CowagerEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Entity404Entity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, GlowChickenEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, GlowCreeperEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, GlowCrabEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, VampireGhostEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, DreamEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, RatEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, CharredWitherSkeletonEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Entity404Entity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, EvilOinkerEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, ReaperEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, TommyInnitEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, GrizzlyBearEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, EvilOinkerEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, WardenEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, AnimalEntity.class, false, false));
			this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, AgeableEntity.class, false, false));
			this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, GhastEntity.class, false, false));
			this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, GiantEntity.class, false, false));
			this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, GolemEntity.class, false, false));
			this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, HoglinEntity.class, false, false));
			this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, HorseEntity.class, false, false));
			this.targetSelector.addGoal(33, new NearestAttackableTargetGoal(this, HuskEntity.class, false, false));
			this.targetSelector.addGoal(34, new NearestAttackableTargetGoal(this, IronGolemEntity.class, false, false));
			this.targetSelector.addGoal(35, new NearestAttackableTargetGoal(this, LlamaEntity.class, false, false));
			this.targetSelector.addGoal(36, new NearestAttackableTargetGoal(this, MagmaCubeEntity.class, false, false));
			this.targetSelector.addGoal(37, new NearestAttackableTargetGoal(this, MooshroomEntity.class, false, false));
			this.targetSelector.addGoal(38, new NearestAttackableTargetGoal(this, MuleEntity.class, false, false));
			this.targetSelector.addGoal(39, new NearestAttackableTargetGoal(this, PillagerEntity.class, false, false));
			this.targetSelector.addGoal(40, new NearestAttackableTargetGoal(this, PigEntity.class, false, false));
			this.targetSelector.addGoal(41, new NearestAttackableTargetGoal(this, PandaEntity.class, false, false));
			this.targetSelector.addGoal(42, new NearestAttackableTargetGoal(this, ParrotEntity.class, false, false));
			this.targetSelector.addGoal(43, new NearestAttackableTargetGoal(this, ZombifiedPiglinEntity.class, false, false));
			this.targetSelector.addGoal(44, new NearestAttackableTargetGoal(this, PolarBearEntity.class, false, false));
			this.targetSelector.addGoal(45, new NearestAttackableTargetGoal(this, SkeletonEntity.class, false, false));
			this.targetSelector.addGoal(46, new NearestAttackableTargetGoal(this, SilverfishEntity.class, false, false));
			this.targetSelector.addGoal(47, new NearestAttackableTargetGoal(this, SheepEntity.class, false, false));
			this.targetSelector.addGoal(48, new NearestAttackableTargetGoal(this, RabbitEntity.class, false, false));
			this.targetSelector.addGoal(49, new NearestAttackableTargetGoal(this, SkeletonHorseEntity.class, false, false));
			this.targetSelector.addGoal(50, new NearestAttackableTargetGoal(this, SlimeEntity.class, false, false));
			this.targetSelector.addGoal(51, new NearestAttackableTargetGoal(this, SnowGolemEntity.class, false, false));
			this.targetSelector.addGoal(52, new NearestAttackableTargetGoal(this, SpiderEntity.class, false, false));
			this.targetSelector.addGoal(53, new NearestAttackableTargetGoal(this, StrayEntity.class, false, false));
			this.targetSelector.addGoal(54, new NearestAttackableTargetGoal(this, TraderLlamaEntity.class, false, false));
			this.targetSelector.addGoal(55, new NearestAttackableTargetGoal(this, VillagerEntity.class, false, false));
			this.targetSelector.addGoal(56, new NearestAttackableTargetGoal(this, VindicatorEntity.class, false, false));
			this.targetSelector.addGoal(57, new NearestAttackableTargetGoal(this, WaterMobEntity.class, false, false));
			this.targetSelector.addGoal(58, new NearestAttackableTargetGoal(this, WitchEntity.class, false, false));
			this.targetSelector.addGoal(59, new NearestAttackableTargetGoal(this, WitherEntity.class, false, false));
			this.targetSelector.addGoal(60, new NearestAttackableTargetGoal(this, WitherSkeletonEntity.class, false, false));
			this.targetSelector.addGoal(61, new NearestAttackableTargetGoal(this, ZombieEntity.class, false, false));
			this.targetSelector.addGoal(62, new NearestAttackableTargetGoal(this, WolfEntity.class, false, false));
			this.targetSelector.addGoal(63, new NearestAttackableTargetGoal(this, ZombieVillagerEntity.class, false, false));
			this.targetSelector.addGoal(64, new NearestAttackableTargetGoal(this, PhantomEntity.class, false, false));
			this.targetSelector.addGoal(65, new NearestAttackableTargetGoal(this, RavagerEntity.class, false, false));
			this.targetSelector.addGoal(66, new NearestAttackableTargetGoal(this, PiglinEntity.class, false, false));
			this.targetSelector.addGoal(67, new NearestAttackableTargetGoal(this, PiglinBruteEntity.class, false, false));
			this.targetSelector.addGoal(68, new NearestAttackableTargetGoal(this, StriderEntity.class, false, false));
			this.targetSelector.addGoal(69, new NearestAttackableTargetGoal(this, ZoglinEntity.class, false, false));
			this.targetSelector.addGoal(70, new HurtByTargetGoal(this));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.ILLAGER;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.ambient"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vex.death"));
		}

		@Override
		public boolean onLivingFall(float l, float d) {
			return false;
		}

		@Override
		public boolean attackEntityFrom(DamageSource source, float amount) {
			if (source == DamageSource.FALL)
				return false;
			if (source == DamageSource.ANVIL)
				return false;
			return super.attackEntityFrom(source, amount);
		}

		@Override
		public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
			super.awardKillScore(entity, score, damageSource);
			double x = this.getPosX();
			double y = this.getPosY();
			double z = this.getPosZ();
			Entity sourceentity = this;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("sourceentity", sourceentity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				CrimsonVexThisEntityKillsAnotherOneProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		protected void updateFallState(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
		}

		@Override
		public void setNoGravity(boolean ignored) {
			super.setNoGravity(true);
		}

		public void livingTick() {
			super.livingTick();
			this.setNoGravity(true);
		}
	}
}
