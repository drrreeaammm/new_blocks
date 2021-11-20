
package net.mcreator.newblocks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.newblocks.block.SculkChuteBlock;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class DeepDarkTabItemGroup extends NewBlocksModElements.ModElement {
	public DeepDarkTabItemGroup(NewBlocksModElements instance) {
		super(instance, 726);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdeep_dark_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SculkChuteBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
