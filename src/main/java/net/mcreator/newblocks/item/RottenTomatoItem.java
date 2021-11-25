
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.newblocks.procedures.RottenTomatoFoodEatenProcedure;
import net.mcreator.newblocks.NewBlocksModElements;

import java.util.Map;
import java.util.HashMap;

@NewBlocksModElements.ModElement.Tag
public class RottenTomatoItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:rotten_tomato")
	public static final Item block = null;
	public RottenTomatoItem(NewBlocksModElements instance) {
		super(instance, 1242);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(1).saturation(-0.2f).build()));
			setRegistryName("rotten_tomato");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 37;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				RottenTomatoFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
