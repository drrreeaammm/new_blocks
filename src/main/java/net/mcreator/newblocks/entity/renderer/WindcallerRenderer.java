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

import net.mcreator.newblocks.entity.WindcallerEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WindcallerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WindcallerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelwindcaller(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/windcaller.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelwindcaller extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer staff;
		private final ModelRenderer leg1;
		private final ModelRenderer leg0;
		private final ModelRenderer cape;
		private final ModelRenderer rightArm;
		private final ModelRenderer leftArm;
		public Modelwindcaller() {
			textureWidth = 94;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 2).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, false);
			staff = new ModelRenderer(this);
			staff.setRotationPoint(-5.0F, -4.0F, -10.0F);
			staff.setTextureOffset(38, 37).addBox(-2.0F, 9.0F, -2.0F, 1.0F, 1.0F, 26.0F, 0.0F, false);
			staff.setTextureOffset(66, 59).addBox(-2.0F, 10.0F, 19.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			staff.setTextureOffset(66, 57).addBox(-2.0F, 11.0F, 20.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			staff.setTextureOffset(66, 55).addBox(-2.0F, 8.0F, 17.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			staff.setTextureOffset(83, 58).addBox(-2.0F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			staff.setTextureOffset(66, 50).addBox(-2.0F, 8.0F, -5.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			staff.setTextureOffset(83, 58).addBox(-2.0F, 7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			staff.setTextureOffset(66, 45).addBox(-2.0F, 9.0F, -7.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			staff.setTextureOffset(82, 60).addBox(-2.0F, 10.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			staff.setTextureOffset(66, 42).addBox(-2.0F, 8.0F, -8.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			staff.setTextureOffset(66, 38).addBox(-2.0F, 7.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			staff.setTextureOffset(76, 61).addBox(-2.0F, 8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			staff.setTextureOffset(76, 57).addBox(-2.0F, 8.0F, -11.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			staff.setTextureOffset(76, 52).addBox(-2.0F, 11.0F, -10.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			staff.setTextureOffset(76, 55).addBox(-2.0F, 10.0F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			leg1 = new ModelRenderer(this);
			leg1.setRotationPoint(2.0F, 12.0F, 0.0F);
			leg1.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			leg0 = new ModelRenderer(this);
			leg0.setRotationPoint(-2.0F, 12.0F, 0.0F);
			leg0.setTextureOffset(0, 22).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			cape = new ModelRenderer(this);
			cape.setRotationPoint(0.0F, 0.0F, -5.5F);
			setRotationAngle(cape, 0.0873F, 0.0F, 0.0F);
			cape.setTextureOffset(44, 18).addBox(-4.5F, 0.5F, 8.5F, 9.0F, 21.0F, 1.0F, 0.0F, false);
			rightArm = new ModelRenderer(this);
			rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			rightArm.setTextureOffset(29, 46).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			rightArm.setTextureOffset(46, 46).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, false);
			leftArm = new ModelRenderer(this);
			leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			leftArm.setTextureOffset(29, 46).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
			leftArm.setTextureOffset(46, 46).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.2F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			staff.render(matrixStack, buffer, packedLight, packedOverlay);
			leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			leg0.render(matrixStack, buffer, packedLight, packedOverlay);
			cape.render(matrixStack, buffer, packedLight, packedOverlay);
			rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.leg0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.staff.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}
}
