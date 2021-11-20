
package net.mcreator.newblocks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.newblocks.item.FriesItem;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class NewblocksItemGroup extends NewBlocksModElements.ModElement {
	public NewblocksItemGroup(NewBlocksModElements instance) {
		super(instance, 275);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnewblocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FriesItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
