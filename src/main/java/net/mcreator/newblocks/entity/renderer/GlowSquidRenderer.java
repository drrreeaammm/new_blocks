package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
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

import net.mcreator.newblocks.entity.GlowSquidEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GlowSquidRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GlowSquidEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelglow_squid(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/glow_squidreal.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("new_blocks:textures/glow_squidreal.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.0.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelglow_squid extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer tentacle1;
		private final ModelRenderer tentacle2;
		private final ModelRenderer tentacle2_rotation;
		private final ModelRenderer tentacle3;
		private final ModelRenderer tentacle4;
		private final ModelRenderer tentacle4_rotation;
		private final ModelRenderer tentacle5;
		private final ModelRenderer tentacle6;
		private final ModelRenderer tentacle6_rotation;
		private final ModelRenderer tentacle7;
		private final ModelRenderer tentacle7_rotation;
		private final ModelRenderer tentacle8;
		private final ModelRenderer tentacle8_rotation;

		public Modelglow_squid() {
			textureWidth = 64;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, 0.0F, false);
			tentacle1 = new ModelRenderer(this);
			tentacle1.setRotationPoint(5.0F, 6.0F, 0.0F);
			tentacle1.setTextureOffset(48, 0).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle2 = new ModelRenderer(this);
			tentacle2.setRotationPoint(3.5F, 6.0F, -3.5F);
			tentacle2_rotation = new ModelRenderer(this);
			tentacle2_rotation.setRotationPoint(-7.0F, 9.0F, 0.0F);
			tentacle2.addChild(tentacle2_rotation);
			setRotationAngle(tentacle2_rotation, 0.0F, -2.3562F, 0.0F);
			tentacle2_rotation.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle3 = new ModelRenderer(this);
			tentacle3.setRotationPoint(0.0F, 6.0F, -5.0F);
			tentacle3.setTextureOffset(48, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle4 = new ModelRenderer(this);
			tentacle4.setRotationPoint(-3.5F, 6.0F, -3.5F);
			tentacle4_rotation = new ModelRenderer(this);
			tentacle4_rotation.setRotationPoint(7.0F, 9.0F, 0.0F);
			tentacle4.addChild(tentacle4_rotation);
			setRotationAngle(tentacle4_rotation, 0.0F, 2.3562F, 0.0F);
			tentacle4_rotation.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle5 = new ModelRenderer(this);
			tentacle5.setRotationPoint(10.0F, 6.0F, -5.0F);
			setRotationAngle(tentacle5, 0.0F, 1.5708F, 0.0F);
			tentacle5.setTextureOffset(48, 0).addBox(-6.0F, 0.0F, -6.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle6 = new ModelRenderer(this);
			tentacle6.setRotationPoint(-3.5F, 6.0F, 3.5F);
			tentacle6_rotation = new ModelRenderer(this);
			tentacle6_rotation.setRotationPoint(7.0F, 9.0F, 0.0F);
			tentacle6.addChild(tentacle6_rotation);
			setRotationAngle(tentacle6_rotation, 0.0F, 0.7854F, 0.0F);
			tentacle6_rotation.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle7 = new ModelRenderer(this);
			tentacle7.setRotationPoint(0.0F, 6.0F, 1.65F);
			setRotationAngle(tentacle7, 0.0F, 3.1416F, 0.0F);
			tentacle7_rotation = new ModelRenderer(this);
			tentacle7_rotation.setRotationPoint(0.0F, 9.0F, -3.35F);
			tentacle7.addChild(tentacle7_rotation);
			setRotationAngle(tentacle7_rotation, 0.0F, 3.1416F, 0.0F);
			tentacle7_rotation.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			tentacle8 = new ModelRenderer(this);
			tentacle8.setRotationPoint(3.5F, 6.0F, 3.5F);
			tentacle8_rotation = new ModelRenderer(this);
			tentacle8_rotation.setRotationPoint(-7.0F, 9.0F, 0.0F);
			tentacle8.addChild(tentacle8_rotation);
			setRotationAngle(tentacle8_rotation, 0.0F, -0.7854F, 0.0F);
			tentacle8_rotation.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle1.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle2.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle3.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle4.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle5.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle6.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle7.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacle8.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.tentacle1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle7_rotation.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle6_rotation.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle2_rotation.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle4_rotation.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle8_rotation.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
