package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.newblocks.entity.BalloonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BalloonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BalloonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelballoon(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/balloon.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("new_blocks:textures/balloon_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelballoon extends EntityModel<Entity> {
		private final ModelRenderer bb_main;
		public Modelballoon() {
			textureWidth = 22;
			textureHeight = 16;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(0.0F, -5.0F, -0.5F, 0.0F, 5.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(2, 0).addBox(0.0F, -9.0F, -1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(4, 0).addBox(0.0F, -10.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 5).addBox(-2.5F, -17.0F, -2.25F, 6.0F, 6.0F, 5.0F, 0.0F, false);
			bb_main.setTextureOffset(5, 5).addBox(3.5F, -16.0F, -1.25F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(5, 5).addBox(-3.5F, -16.0F, -1.25F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(6, 11).addBox(-2.0F, -16.0F, 2.75F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(7, 11).addBox(-2.0F, -16.0F, -3.25F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			bb_main.setTextureOffset(3, 11).addBox(-2.0F, -18.0F, -1.75F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			bb_main.setTextureOffset(3, 11).addBox(-2.0F, -11.0F, -1.75F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
