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

import net.mcreator.newblocks.entity.SculkerEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SculkerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SculkerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsculker(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/sculker.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsculker extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer tail;
		private final ModelRenderer tail3_r1;
		private final ModelRenderer tail2_r1;
		private final ModelRenderer tail_r1;
		private final ModelRenderer neck;
		private final ModelRenderer neck_r1;
		private final ModelRenderer head_r1;
		public Modelsculker() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.3927F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 44).addBox(-5.0F, -9.0F, -6.5F, 10.0F, 6.0F, 14.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(tail);
			tail3_r1 = new ModelRenderer(this);
			tail3_r1.setRotationPoint(0.0F, -5.0F, 6.0F);
			tail.addChild(tail3_r1);
			setRotationAngle(tail3_r1, -0.0876F, -0.0869F, 0.0076F);
			tail3_r1.setTextureOffset(20, 33).addBox(-2.983F, -0.4961F, 2.9797F, 1.0F, 4.0F, 7.0F, 0.0F, true);
			tail2_r1 = new ModelRenderer(this);
			tail2_r1.setRotationPoint(0.0F, -5.0F, 6.0F);
			tail.addChild(tail2_r1);
			setRotationAngle(tail2_r1, -0.0876F, 0.0869F, -0.0076F);
			tail2_r1.setTextureOffset(20, 33).addBox(1.983F, -0.4961F, 2.9797F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(0.0F, -5.0F, 6.0F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, -0.0873F, 0.0F, 0.0F);
			tail_r1.setTextureOffset(20, 33).addBox(-0.5F, -0.4961F, 2.9586F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(neck);
			neck_r1 = new ModelRenderer(this);
			neck_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			neck.addChild(neck_r1);
			setRotationAngle(neck_r1, -0.1309F, 0.0F, 0.0F);
			neck_r1.setTextureOffset(4, 35).addBox(-2.0F, -10.0F, -8.75F, 4.0F, 3.0F, 6.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			neck.addChild(head_r1);
			setRotationAngle(head_r1, -0.0436F, 0.0F, 0.0F);
			head_r1.setTextureOffset(42, 26).addBox(-2.5F, -13.0F, -13.75F, 5.0F, 6.0F, 6.0F, 0.0F, false);
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
			this.tail3_r1.rotateAngleZ = MathHelper.cos(f * 0.7F) * 0.5F * f1;
			this.tail2_r1.rotateAngleZ = MathHelper.cos(f * 0.7F) * -0.5F * f1;
		}
	}
}
