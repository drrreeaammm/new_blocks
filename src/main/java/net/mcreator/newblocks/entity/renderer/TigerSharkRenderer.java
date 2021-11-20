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

import net.mcreator.newblocks.entity.TigerSharkEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TigerSharkRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TigerSharkEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelshark(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/tiger_shark.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelshark extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer left_fin_r1;
		private final ModelRenderer right_fin_r1;
		private final ModelRenderer head_r1;
		private final ModelRenderer mouth_r1;
		private final ModelRenderer fin_r1;
		private final ModelRenderer tail;
		private final ModelRenderer tail_1_r1;
		private final ModelRenderer tail_2_r1;
		public Modelshark() {
			textureWidth = 84;
			textureHeight = 84;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(28, 58).addBox(-3.5F, -5.5F, -10.0F, 7.0F, 5.0F, 21.0F, 0.0F, false);
			body.setTextureOffset(32, 63).addBox(-3.0F, -6.0F, -9.5F, 6.0F, 1.0F, 20.0F, 0.0F, false);
			left_fin_r1 = new ModelRenderer(this);
			left_fin_r1.setRotationPoint(-0.25F, -3.0F, 0.0F);
			body.addChild(left_fin_r1);
			setRotationAngle(left_fin_r1, 0.0F, 0.0F, 0.5236F);
			left_fin_r1.setTextureOffset(29, 79).addBox(-0.2835F, -2.0269F, -3.5F, 8.0F, 1.0F, 4.0F, 0.0F, true);
			right_fin_r1 = new ModelRenderer(this);
			right_fin_r1.setRotationPoint(-0.25F, -3.0F, 0.0F);
			body.addChild(right_fin_r1);
			setRotationAngle(right_fin_r1, 0.0F, 0.0F, -0.5236F);
			right_fin_r1.setTextureOffset(29, 79).addBox(-7.2835F, -1.7769F, -3.5F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(head_r1);
			setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
			head_r1.setTextureOffset(48, 30).addBox(-3.0F, -6.5F, -14.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			mouth_r1 = new ModelRenderer(this);
			mouth_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			head_r1.addChild(mouth_r1);
			setRotationAngle(mouth_r1, 0.0873F, 0.0F, 0.0F);
			mouth_r1.setTextureOffset(28, 50).addBox(-3.0F, -5.5F, -13.5F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			fin_r1 = new ModelRenderer(this);
			fin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(fin_r1);
			setRotationAngle(fin_r1, -0.48F, 0.0F, 0.0F);
			fin_r1.setTextureOffset(28, 72).addBox(-0.5F, -10.0F, -5.5F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 24.0F, 0.0F);
			tail.setTextureOffset(56, 71).addBox(-2.25F, -5.0F, 11.0F, 4.0F, 3.0F, 7.0F, 0.0F, false);
			tail_1_r1 = new ModelRenderer(this);
			tail_1_r1.setRotationPoint(-0.25F, -3.0F, 9.75F);
			tail.addChild(tail_1_r1);
			setRotationAngle(tail_1_r1, -0.3927F, 0.0F, 0.0F);
			tail_1_r1.setTextureOffset(74, 74).addBox(-0.5F, -9.4972F, 3.1402F, 1.0F, 6.0F, 4.0F, 0.0F, false);
			tail_2_r1 = new ModelRenderer(this);
			tail_2_r1.setRotationPoint(-0.25F, -3.0F, 9.75F);
			tail.addChild(tail_2_r1);
			setRotationAngle(tail_2_r1, 0.5236F, 0.0F, 0.0F);
			tail_2_r1.setTextureOffset(74, 74).addBox(-0.5F, 1.4731F, 4.5563F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_fin_r1.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.right_fin_r1.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.tail.rotateAngleY = MathHelper.cos(f * 0.5F) * 0.1F * f1;
			this.tail_2_r1.rotateAngleY = MathHelper.cos(f * 0.5F) * 0.1F * f1;
			this.tail_1_r1.rotateAngleY = MathHelper.cos(f * 0.5F) * 0.1F * f1;

		}
	}
}
