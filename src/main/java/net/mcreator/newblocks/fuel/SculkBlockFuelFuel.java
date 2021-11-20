
package net.mcreator.newblocks.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.newblocks.block.SkulkBlockBlock;

@Mod.EventBusSubscriber
public class SculkBlockFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == SkulkBlockBlock.block.asItem())
			event.setBurnTime(160);
	}
}
