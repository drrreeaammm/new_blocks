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

import net.mcreator.newblocks.entity.FroglettEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FroglettRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FroglettEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelfroglett(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/froglett.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelfroglett extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer sac;
		private final ModelRenderer tongue;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public Modelfroglett() {
			textureWidth = 58;
			textureHeight = 58;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(body, -0.1309F, 0.0F, 0.0F);
			body.setTextureOffset(3, 1).addBox(-3.5F, -4.0F, -4.0F, 7.0F, 3.0F, 9.0F, -0.34F, false);
			body.setTextureOffset(23, 22).addBox(-3.5F, -3.0F, -4.0F, 7.0F, 0.0F, 9.0F, -0.4F, false);
			body.setTextureOffset(46, 35).addBox(0.0F, -4.4958F, 2.1848F, 0.0F, 3.0F, 6.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 20.0F, 3.5F);
			setRotationAngle(head, -0.1309F, 0.0F, 0.0F);
			head.setTextureOffset(23, 13).addBox(-3.5F, 0.0F, -7.0F, 7.0F, 0.0F, 9.0F, -0.4F, false);
			head.setTextureOffset(0, 13).addBox(-3.5F, -1.0F, -7.0F, 7.0F, 3.0F, 9.0F, -0.37F, false);
			head.setTextureOffset(0, 5).addBox(0.25F, -2.25F, -6.0F, 3.0F, 2.0F, 3.0F, -0.3F, false);
			head.setTextureOffset(0, 0).addBox(-3.25F, -2.25F, -6.0F, 3.0F, 2.0F, 3.0F, -0.3F, false);
			sac = new ModelRenderer(this);
			sac.setRotationPoint(0.0F, 21.0F, -1.0F);
			sac.setTextureOffset(26, 5).addBox(-3.5F, -0.1F, -2.64F, 7.0F, 2.0F, 3.0F, -0.44F, false);
			tongue = new ModelRenderer(this);
			tongue.setRotationPoint(0.0F, 20.9F, 5.0F);
			tongue.setTextureOffset(17, 13).addBox(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F, -0.34F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.0F, 21.0F, -2.5F);
			left_arm.setTextureOffset(0, 32).addBox(-1.5F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, -0.35F, false);
			left_arm.setTextureOffset(18, 40).addBox(-4.0F, 2.4F, -5.0F, 8.0F, 0.0F, 8.0F, -0.2F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.0F, 21.0F, -2.5F);
			right_arm.setTextureOffset(0, 38).addBox(-0.5F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F, -0.35F, false);
			right_arm.setTextureOffset(2, 40).addBox(-4.0F, 2.4F, -5.0F, 8.0F, 0.0F, 8.0F, -0.2F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.5F, 21.0F, 4.0F);
			left_leg.setTextureOffset(14, 25).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, -0.3F, false);
			left_leg.setTextureOffset(34, 50).addBox(-2.0F, 2.4F, -4.0F, 8.0F, 0.0F, 8.0F, -0.2F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.5F, 21.0F, 4.0F);
			right_leg.setTextureOffset(0, 25).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, -0.3F, false);
			right_leg.setTextureOffset(18, 32).addBox(-6.0F, 2.4F, -4.0F, 8.0F, 0.0F, 8.0F, -0.2F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			sac.render(matrixStack, buffer, packedLight, packedOverlay);
			tongue.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_arm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
