
package net.mcreator.newblocks.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.newblocks.procedures.GetDashValueTwoProcedure;
import net.mcreator.newblocks.procedures.GetDashValueThreeProcedure;
import net.mcreator.newblocks.procedures.GetDashValueProcedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@Mod.EventBusSubscriber
public class DashOverlayOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (GetDashValueProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("new_blocks:textures/dash_bar_one.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 70, posY + 56, 0, 0, 16, 16, 16, 16);
				if (GetDashValueTwoProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("new_blocks:textures/dash_bar_two.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 70, posY + 55, 0, 0, 16, 16, 16, 16);
				}
				if (GetDashValueThreeProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("new_blocks:textures/dash_bar_three.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 70, posY + 55, 0, 0, 16, 16, 16, 16);
				}
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("new_blocks:textures/dash_bar_zero.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 70, posY + 56, 0, 0, 16, 16, 16, 16);
			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
