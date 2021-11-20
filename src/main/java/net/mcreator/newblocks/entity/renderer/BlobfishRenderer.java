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

import net.mcreator.newblocks.entity.BlobfishEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlobfishRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlobfishEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelblobfish(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/jellyfishclear.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("new_blocks:textures/blobfish.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelblobfish extends EntityModel<Entity> {
		private final ModelRenderer body;
		public Modelblobfish() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 6).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(16, 2).addBox(2.5F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(14, 14).addBox(-3.5F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(20, 11).addBox(-2.0F, -5.0F, -3.5F, 4.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 18).addBox(-2.0F, -5.0F, 2.5F, 4.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 17).addBox(-1.5F, -1.25F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 4).addBox(-1.5F, -3.25F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 2).addBox(-2.0F, -2.25F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(1.0F, -2.25F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 24).addBox(-3.0F, -5.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 24).addBox(2.0F, -5.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 24).addBox(2.0F, -5.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 23).addBox(-3.0F, -5.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-2.5F, -6.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(20, 19).addBox(-3.25F, -6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(6, 20).addBox(2.25F, -6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(22, 2).addBox(-2.0F, -6.0F, 2.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 12).addBox(-2.0F, -7.0F, -2.25F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(15, 0).addBox(-2.0F, -6.0F, -3.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.25F, -4.75F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(0.25F, -4.75F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
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
