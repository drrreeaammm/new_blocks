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

import net.mcreator.newblocks.entity.WardenEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WardenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WardenEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwarden(), 1.4f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/warden.png");
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
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("new_blocks:textures/warden_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwarden extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer left_ear_r1;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public Modelwarden() {
			textureWidth = 128;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -10.0F, 0.0F);
			setRotationAngle(head, 0.1745F, 0.0F, 0.0F);
			left_ear_r1 = new ModelRenderer(this);
			left_ear_r1.setRotationPoint(0.0F, 34.0F, 0.25F);
			head.addChild(left_ear_r1);
			setRotationAngle(left_ear_r1, 0.0401F, 0.0F, 0.0F);
			left_ear_r1.setTextureOffset(106, 46).addBox(8.0F, -53.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			left_ear_r1.setTextureOffset(106, 36).addBox(-18.0F, -53.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
			left_ear_r1.setTextureOffset(0, 0).addBox(-8.0F, -50.0F, -5.0F, 16.0F, 16.0F, 10.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -10.0F, 0.0F);
			setRotationAngle(body, 0.1309F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 11.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0436F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 26).addBox(-9.0F, -11.0219F, -6.0032F, 18.0F, 21.0F, 11.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-11.0F, -6.0F, 0.0F);
			setRotationAngle(right_arm, -0.1309F, 0.0F, 0.0F);
			right_arm.setTextureOffset(52, 0).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(11.0F, -6.0F, 0.0F);
			setRotationAngle(left_arm, -0.1309F, 0.0F, 0.0F);
			left_arm.setTextureOffset(84, 0).addBox(-2.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(6.0F, 11.0F, 0.0F);
			left_leg.setTextureOffset(82, 36).addBox(-3.0F, 0.0F, -2.5F, 6.0F, 13.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-6.0F, 11.0F, 0.75F);
			right_leg.setTextureOffset(58, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (160F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (164F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.body_r1.rotateAngleX = MathHelper.cos(f * 0.1F) * 0.2F * f1;
			this.body_r1.rotateAngleZ = MathHelper.cos(f * 0.1F) * 0.1F * f1;
			this.right_leg.rotateAngleZ = MathHelper.cos(f * 0.1F) * 0.2F * f1;
			this.left_leg.rotateAngleZ = MathHelper.cos(f * 0.1F) * 0.2F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.1F) * -0.6F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.1F) * -0.6F * f1;
			this.head.rotateAngleZ = MathHelper.cos(f * 0.2F) * 0.2F * f1;
			this.head.rotateAngleY = MathHelper.cos(f * 0.1F) * 0.2F * f1;
			this.head.rotateAngleX = MathHelper.cos(f * 0.2F) * 0.4F * f1;
			this.body_r1.rotateAngleX = MathHelper.cos(f * 0.1F) * 0.4F * f1;
			this.head.rotateAngleX = MathHelper.cos(f * 0.2F) * -0.2F * f1;
		}
	}

}
