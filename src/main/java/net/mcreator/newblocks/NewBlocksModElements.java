/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.newblocks;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class NewBlocksModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public NewBlocksModElements() {
		sounds.put(new ResourceLocation("new_blocks", "herobrinehurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "herobrinehurt")));
		sounds.put(new ResourceLocation("new_blocks", "reaper_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "reaper_ambient")));
		sounds.put(new ResourceLocation("new_blocks", "reaper_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "reaper_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "tommyinnithurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tommyinnithurt")));
		sounds.put(new ResourceLocation("new_blocks", "tommyinnitbazinga"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tommyinnitbazinga")));
		sounds.put(new ResourceLocation("new_blocks", "knifestab"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "knifestab")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_death")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_step")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_idle")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_health_low"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_health_low")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_disc"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_disc")));
		sounds.put(new ResourceLocation("new_blocks", "shulk_disc"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "shulk_disc")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_spit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_spit")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_roar")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_death")));
		sounds.put(new ResourceLocation("new_blocks", "iron_man_bullet_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iron_man_bullet_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "squirrel_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "squirrel_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "squirrel_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "squirrel_idle")));
		sounds.put(new ResourceLocation("new_blocks", "imposter"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "imposter")));
		sounds.put(new ResourceLocation("new_blocks", "cidada_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cidada_idle")));
		sounds.put(new ResourceLocation("new_blocks", "cicada_step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cicada_step")));
		sounds.put(new ResourceLocation("new_blocks", "shark_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "shark_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "balloon_pop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "balloon_pop")));
		sounds.put(new ResourceLocation("new_blocks", "hammood"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "hammood")));
		sounds.put(new ResourceLocation("new_blocks", "hamoodstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "hamoodstep")));
		sounds.put(new ResourceLocation("new_blocks", "hamood"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "hamood")));
		sounds.put(new ResourceLocation("new_blocks", "ham"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "ham")));
		sounds.put(new ResourceLocation("new_blocks", "cave"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cave")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_bubbles_1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_bubbles_1")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_bubbles_2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_bubbles_2")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_idle_air"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_idle_air")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "deep_dark"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "deep_dark")));
		sounds.put(new ResourceLocation("new_blocks", "warden_distant"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_distant")));
		sounds.put(new ResourceLocation("new_blocks", "deep_dark_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "deep_dark_ambient")));
		sounds.put(new ResourceLocation("new_blocks", "squirrel_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "squirrel_death")));
		sounds.put(new ResourceLocation("new_blocks", "wardenstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wardenstep")));
		sounds.put(new ResourceLocation("new_blocks", "sculker_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculker_idle")));
		sounds.put(new ResourceLocation("new_blocks", "wardenidle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wardenidle")));
		sounds.put(new ResourceLocation("new_blocks", "sculker_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculker_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "skulk_clicking_1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "skulk_clicking_1")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_step_1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_step_1")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_step_6"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_step_6")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_place")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_break")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_hit")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_step_block"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_step_block")));
		sounds.put(new ResourceLocation("new_blocks", "warden_hurt_2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_hurt_2")));
		sounds.put(new ResourceLocation("new_blocks", "ice_cube_summon"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "ice_cube_summon")));
		sounds.put(new ResourceLocation("new_blocks", "iceologer_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iceologer_death")));
		sounds.put(new ResourceLocation("new_blocks", "iceologer_grunt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iceologer_grunt")));
		sounds.put(new ResourceLocation("new_blocks", "iceologer_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iceologer_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_shrieker_shriek"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_shrieker_shriek")));
		sounds.put(new ResourceLocation("new_blocks", "allay_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_ambient")));
		sounds.put(new ResourceLocation("new_blocks", "allay_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_death")));
		sounds.put(new ResourceLocation("new_blocks", "allay_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "glare_angry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "glare_angry")));
		sounds.put(new ResourceLocation("new_blocks", "frog_croak"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "frog_croak")));
		sounds.put(new ResourceLocation("new_blocks", "tall"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tall")));
		sounds.put(new ResourceLocation("new_blocks", "wardenhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wardenhurt")));
		sounds.put(new ResourceLocation("new_blocks", "warden_angry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_angry")));
		sounds.put(new ResourceLocation("new_blocks", "say1"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "say1")));
		sounds.put(new ResourceLocation("new_blocks", "zombiehurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombiehurt")));
		sounds.put(new ResourceLocation("new_blocks", "zombiedeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombiedeath")));
		sounds.put(new ResourceLocation("new_blocks", "footsteps"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "footsteps")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_crystal"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_crystal")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_crystal_summon"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_crystal_summon")));
		sounds.put(new ResourceLocation("new_blocks", "otherside"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "otherside")));
		sounds.put(new ResourceLocation("new_blocks", "music.ancestry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "music.ancestry")));
		sounds.put(new ResourceLocation("new_blocks", "birds_screaming_loop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "birds_screaming_loop")));
		sounds.put(new ResourceLocation("new_blocks", "music.deep_dark_additions"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "music.deep_dark_additions")));
		sounds.put(new ResourceLocation("new_blocks", "warden_hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_hit")));
		sounds.put(new ResourceLocation("new_blocks", "sniper_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sniper_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "sniper_reload"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sniper_reload")));
		sounds.put(new ResourceLocation("new_blocks", "horn_blow1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "horn_blow1")));
		sounds.put(new ResourceLocation("new_blocks", "horn_2"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "horn_2")));
		sounds.put(new ResourceLocation("new_blocks", "minigun_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "minigun_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "pistol_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pistol_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "grenade_throw"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "grenade_throw")));
		sounds.put(new ResourceLocation("new_blocks", "drone_fly1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_fly1")));
		sounds.put(new ResourceLocation("new_blocks", "drone_fly2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_fly2")));
		sounds.put(new ResourceLocation("new_blocks", "drone_fly3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_fly3")));
		sounds.put(new ResourceLocation("new_blocks", "drone_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "drone_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_death")));
		sounds.put(new ResourceLocation("new_blocks", "wrench_turn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wrench_turn")));
		sounds.put(new ResourceLocation("new_blocks", "recall_potion_teleport"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "recall_potion_teleport")));
		sounds.put(new ResourceLocation("new_blocks", "meowmere_meow"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "meowmere_meow")));
		sounds.put(new ResourceLocation("new_blocks", "weak_magic_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "weak_magic_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "aaaa"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "aaaa")));
		sounds.put(new ResourceLocation("new_blocks", "breakingtheconditoning"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "breakingtheconditoning")));
		sounds.put(new ResourceLocation("new_blocks", "pixie_"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pixie_")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("new_blocks").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == NewBlocksModElements.ModElement.class)
						elements.add((NewBlocksModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(NewBlocksModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new NewBlocksModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		NewBlocksMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final NewBlocksModElements elements;
		protected final int sortid;

		public ModElement(NewBlocksModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}
