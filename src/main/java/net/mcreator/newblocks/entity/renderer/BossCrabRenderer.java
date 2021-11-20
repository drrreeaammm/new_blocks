package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.newblocks.entity.BossCrabEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BossCrabRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BossCrabEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelboss_crab(), 1.2000000000000002f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/crab.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelboss_crab extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer leg3;
		private final ModelRenderer leg3_r1;
		private final ModelRenderer leg4;
		private final ModelRenderer leg4_r1;
		private final ModelRenderer leg2;
		private final ModelRenderer leg2_r1;
		private final ModelRenderer leg6;
		private final ModelRenderer leg6_r1;
		private final ModelRenderer leg1;
		private final ModelRenderer leg1_r1;
		private final ModelRenderer leg5;
		private final ModelRenderer leg5_r1;
		private final ModelRenderer arm1;
		private final ModelRenderer pincer_r1;
		private final ModelRenderer arm_r1;
		private final ModelRenderer arm2;
		private final ModelRenderer pincer_r2;
		private final ModelRenderer arm_r2;
		public Modelboss_crab() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 28.5F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-14.0F, -24.0F, -9.0F, 28.0F, 16.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(40, 88).addBox(-12.0F, -33.0F, -8.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(40, 88).addBox(4.0F, -33.0F, -8.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			leg3 = new ModelRenderer(this);
			leg3.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(leg3);
			leg3_r1 = new ModelRenderer(this);
			leg3_r1.setRotationPoint(13.0F, -12.0F, 4.0F);
			leg3.addChild(leg3_r1);
			setRotationAngle(leg3_r1, 0.0F, 0.0F, -0.2618F);
			leg3_r1.setTextureOffset(0, 88).addBox(-38.6628F, -10.5236F, -2.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
			leg4 = new ModelRenderer(this);
			leg4.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(leg4);
			leg4_r1 = new ModelRenderer(this);
			leg4_r1.setRotationPoint(-13.0F, -12.0F, 4.0F);
			leg4.addChild(leg4_r1);
			setRotationAngle(leg4_r1, 0.0F, 0.0F, 0.2618F);
			leg4_r1.setTextureOffset(0, 88).addBox(22.6628F, -10.5236F, -2.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(leg2);
			leg2_r1 = new ModelRenderer(this);
			leg2_r1.setRotationPoint(13.0F, -12.0F, -1.0F);
			leg2.addChild(leg2_r1);
			setRotationAngle(leg2_r1, 0.0F, 0.0F, -0.2618F);
			leg2_r1.setTextureOffset(0, 88).addBox(-38.6628F, -10.5236F, -2.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
			leg6 = new ModelRenderer(this);
			leg6.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(leg6);
			leg6_r1 = new ModelRenderer(this);
			leg6_r1.setRotationPoint(-13.0F, -12.0F, -1.0F);
			leg6.addChild(leg6_r1);
			setRotationAngle(leg6_r1, 0.0F, 0.0F, 0.2618F);
			leg6_r1.setTextureOffset(0, 88).addBox(22.6628F, -10.5236F, -2.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(leg1);
			leg1_r1 = new ModelRenderer(this);
			leg1_r1.setRotationPoint(13.0F, -12.0F, -6.0F);
			leg1.addChild(leg1_r1);
			setRotationAngle(leg1_r1, 0.0F, 0.0F, -0.2618F);
			leg1_r1.setTextureOffset(0, 88).addBox(-38.6628F, -10.5236F, -2.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
			leg5 = new ModelRenderer(this);
			leg5.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(leg5);
			leg5_r1 = new ModelRenderer(this);
			leg5_r1.setRotationPoint(-13.0F, -12.0F, -6.0F);
			leg5.addChild(leg5_r1);
			setRotationAngle(leg5_r1, 0.0F, 0.0F, 0.2618F);
			leg5_r1.setTextureOffset(0, 88).addBox(22.6628F, -10.5236F, -2.0F, 16.0F, 4.0F, 4.0F, 0.0F, false);
			arm1 = new ModelRenderer(this);
			arm1.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(arm1);
			pincer_r1 = new ModelRenderer(this);
			pincer_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			arm1.addChild(pincer_r1);
			setRotationAngle(pincer_r1, 0.0F, 0.4363F, 0.0F);
			pincer_r1.setTextureOffset(52, 44).addBox(-21.0F, -29.75F, -40.0F, 16.0F, 12.0F, 20.0F, 0.0F, false);
			arm_r1 = new ModelRenderer(this);
			arm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			arm1.addChild(arm_r1);
			setRotationAngle(arm_r1, -0.1745F, 0.5672F, 0.0F);
			arm_r1.setTextureOffset(6, 17).addBox(-12.0F, -23.75F, -28.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(0.0F, 3.75F, 0.0F);
			body.addChild(arm2);
			pincer_r2 = new ModelRenderer(this);
			pincer_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			arm2.addChild(pincer_r2);
			setRotationAngle(pincer_r2, 0.0F, -0.4363F, 0.0F);
			pincer_r2.setTextureOffset(52, 44).addBox(5.0F, -29.75F, -40.0F, 16.0F, 12.0F, 20.0F, 0.0F, false);
			arm_r2 = new ModelRenderer(this);
			arm_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			arm2.addChild(arm_r2);
			setRotationAngle(arm_r2, -0.1745F, -0.5672F, 0.0F);
			arm_r2.setTextureOffset(0, 16).addBox(8.0F, -23.75F, -28.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
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
			this.leg2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg1_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg3_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg4_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg5_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.leg6_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}
}
