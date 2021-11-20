
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

import java.util.List;

@NewBlocksModElements.ModElement.Tag
public class ElectricSpiderSoundsItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:electric_spider_sounds")
	public static final Item block = null;
	public ElectricSpiderSoundsItem(NewBlocksModElements instance) {
		super(instance, 100);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, NewBlocksModElements.sounds.get(new ResourceLocation("new_blocks:electric_spider_disc")),
					new Item.Properties().group(NewblocksItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("electric_spider_sounds");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Sounds of the Electric Spider."));
		}
	}
}
