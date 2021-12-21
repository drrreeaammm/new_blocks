
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class TheEndItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:the_end")
	public static final Item block = null;

	public TheEndItem(NewBlocksModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, NewBlocksModElements.sounds.get(new ResourceLocation("new_blocks:tall")),
					new Item.Properties().group(NewblocksItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("the_end");
		}
	}
}
