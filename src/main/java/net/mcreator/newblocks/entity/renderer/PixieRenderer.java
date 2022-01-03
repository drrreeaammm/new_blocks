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

import net.mcreator.newblocks.entity.PixieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PixieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PixieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelfairy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/fairy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelfairy extends EntityModel<Entity> {
		private final ModelRenderer bodypixie;
		private final ModelRenderer pixie;
		private final ModelRenderer head;
		private final ModelRenderer bone8;
		private final ModelRenderer bone8_r1;
		private final ModelRenderer bone10;
		private final ModelRenderer bone10_r1;
		private final ModelRenderer bone11;
		private final ModelRenderer bone11_r1;
		private final ModelRenderer bone9;
		private final ModelRenderer bone9_r1;
		private final ModelRenderer bone5;
		private final ModelRenderer bone5_r1;
		private final ModelRenderer bone7;
		private final ModelRenderer bone7_r1;
		private final ModelRenderer bone6;
		private final ModelRenderer bone6_r1;
		private final ModelRenderer bone4;
		private final ModelRenderer bone4_r1;
		private final ModelRenderer bone2;
		private final ModelRenderer bone2_r1;
		private final ModelRenderer bone3;
		private final ModelRenderer bone3_r1;
		private final ModelRenderer eyeslocked;
		private final ModelRenderer eyeslocked2;
		private final ModelRenderer orejas;
		private final ModelRenderer orejas_r1;
		private final ModelRenderer orejas2;
		private final ModelRenderer orejas2_r1;
		private final ModelRenderer body;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer wings2;
		private final ModelRenderer wings2_r1;
		private final ModelRenderer wings3;
		private final ModelRenderer wings3_r1;
		private final ModelRenderer arm2;
		private final ModelRenderer arm5;
		private final ModelRenderer arm3;
		private final ModelRenderer arm4;
		private final ModelRenderer body2;
		private final ModelRenderer body3;
		private final ModelRenderer legs3;
		private final ModelRenderer legss2;
		private final ModelRenderer legss2_r1;
		private final ModelRenderer legs4;
		private final ModelRenderer body4;
		private final ModelRenderer legs2;
		private final ModelRenderer legss3;
		private final ModelRenderer legss3_r1;
		private final ModelRenderer legs5;

		public Modelfairy() {
			textureWidth = 228;
			textureHeight = 228;
			bodypixie = new ModelRenderer(this);
			bodypixie.setRotationPoint(0.0F, 25.0F, 0.0F);
			pixie = new ModelRenderer(this);
			pixie.setRotationPoint(0.0F, -11.0F, -5.0F);
			bodypixie.addChild(pixie);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -11.8F, 4.0F);
			pixie.addChild(head);
			head.setTextureOffset(26, 7).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 10.0F, 10.0F, -1.0F, false);
			bone8 = new ModelRenderer(this);
			bone8.setRotationPoint(4.0F, -8.0F, 0.0F);
			head.addChild(bone8);
			bone8_r1 = new ModelRenderer(this);
			bone8_r1.setRotationPoint(-1.0F, 0.0F, -2.0F);
			bone8.addChild(bone8_r1);
			setRotationAngle(bone8_r1, 0.0F, 0.0F, -0.3054F);
			bone8_r1.setTextureOffset(138, 71).addBox(-4.0F, -1.0F, -1.0F, 10.0F, 16.0F, 2.0F, -1.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(4.0F, -8.0F, 1.0F);
			head.addChild(bone10);
			setRotationAngle(bone10, 0.0F, -0.4363F, 0.0F);
			bone10_r1 = new ModelRenderer(this);
			bone10_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
			bone10.addChild(bone10_r1);
			setRotationAngle(bone10_r1, 0.0F, 0.0F, -0.3054F);
			bone10_r1.setTextureOffset(138, 71).addBox(-4.0F, -1.0F, -1.0F, 10.0F, 16.0F, 2.0F, -1.0F, false);
			bone11 = new ModelRenderer(this);
			bone11.setRotationPoint(-4.0F, -8.0F, 1.0F);
			head.addChild(bone11);
			setRotationAngle(bone11, 0.0F, 0.4363F, 0.0F);
			bone11_r1 = new ModelRenderer(this);
			bone11_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
			bone11.addChild(bone11_r1);
			setRotationAngle(bone11_r1, 0.0F, 0.0F, 0.3054F);
			bone11_r1.setTextureOffset(138, 71).addBox(-6.0F, -1.0F, -1.0F, 10.0F, 16.0F, 2.0F, -1.0F, true);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(-4.0F, -8.0F, 0.0F);
			head.addChild(bone9);
			bone9_r1 = new ModelRenderer(this);
			bone9_r1.setRotationPoint(1.0F, 0.0F, -2.0F);
			bone9.addChild(bone9_r1);
			setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.3054F);
			bone9_r1.setTextureOffset(138, 71).addBox(-6.0F, -1.0F, -1.0F, 10.0F, 16.0F, 2.0F, -1.0F, true);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(3.5F, -7.0F, 0.0F);
			head.addChild(bone5);
			bone5_r1 = new ModelRenderer(this);
			bone5_r1.setRotationPoint(0.5F, -1.0F, 0.0F);
			bone5.addChild(bone5_r1);
			setRotationAngle(bone5_r1, 0.0F, 0.0F, -0.2182F);
			bone5_r1.setTextureOffset(118, 17).addBox(-4.0F, -1.0F, -5.0F, 5.0F, 16.0F, 10.0F, -1.0F, false);
			bone7 = new ModelRenderer(this);
			bone7.setRotationPoint(-0.5F, -1.0F, 3.0F);
			head.addChild(bone7);
			setRotationAngle(bone7, 0.0F, -1.5708F, 0.0F);
			bone7_r1 = new ModelRenderer(this);
			bone7_r1.setRotationPoint(0.96F, -6.996F, -0.56F);
			bone7.addChild(bone7_r1);
			setRotationAngle(bone7_r1, 0.0F, 0.0F, -0.2182F);
			bone7_r1.setTextureOffset(118, 17).addBox(-4.06F, -1.0F, -5.08F, 5.0F, 16.0F, 10.0F, -1.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(-3.5F, -7.0F, 0.0F);
			head.addChild(bone6);
			bone6_r1 = new ModelRenderer(this);
			bone6_r1.setRotationPoint(-0.5F, -1.0F, 0.0F);
			bone6.addChild(bone6_r1);
			setRotationAngle(bone6_r1, 0.0F, 0.0F, 0.2182F);
			bone6_r1.setTextureOffset(118, 17).addBox(-1.0F, -1.0F, -5.0F, 5.0F, 16.0F, 10.0F, -1.0F, true);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(0.5F, 0.7F, 3.7F);
			head.addChild(bone4);
			bone4_r1 = new ModelRenderer(this);
			bone4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone4.addChild(bone4_r1);
			setRotationAngle(bone4_r1, 0.3491F, 0.0F, 0.0F);
			bone4_r1.setTextureOffset(96, 9).addBox(-4.0F, -1.0F, 0.3F, 8.0F, 5.0F, 0.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(3.5F, 0.0F, -4.0F);
			head.addChild(bone2);
			setRotationAngle(bone2, 0.0873F, 0.0F, 0.0F);
			bone2_r1 = new ModelRenderer(this);
			bone2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone2.addChild(bone2_r1);
			setRotationAngle(bone2_r1, -0.2269F, 0.0F, -0.1745F);
			bone2_r1.setTextureOffset(17, 24).addBox(-0.8422F, -1.9063F, -0.1967F, 3.0F, 7.0F, 0.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-3.5F, 0.0F, -4.0F);
			head.addChild(bone3);
			setRotationAngle(bone3, 0.0873F, 0.0F, 0.0F);
			bone3_r1 = new ModelRenderer(this);
			bone3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone3.addChild(bone3_r1);
			setRotationAngle(bone3_r1, -0.2269F, 0.0F, 0.1745F);
			bone3_r1.setTextureOffset(17, 24).addBox(-2.1578F, -1.9063F, -0.1967F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			eyeslocked = new ModelRenderer(this);
			eyeslocked.setRotationPoint(1.9992F, -1.96F, -2.53F);
			head.addChild(eyeslocked);
			eyeslocked.setTextureOffset(51, 28).addBox(-1.02F, -1.02F, -0.51F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			eyeslocked2 = new ModelRenderer(this);
			eyeslocked2.setRotationPoint(-1.9992F, -1.96F, -2.53F);
			head.addChild(eyeslocked2);
			eyeslocked2.setTextureOffset(51, 28).addBox(-1.02F, -1.02F, -0.51F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			orejas = new ModelRenderer(this);
			orejas.setRotationPoint(4.0F, 0.0F, -4.0F);
			head.addChild(orejas);
			orejas_r1 = new ModelRenderer(this);
			orejas_r1.setRotationPoint(0.0F, -3.0F, 2.0F);
			orejas.addChild(orejas_r1);
			setRotationAngle(orejas_r1, 0.0F, -0.6981F, -0.0873F);
			orejas_r1.setTextureOffset(0, 28).addBox(-1.0F, -2.0F, 0.0F, 7.0F, 4.0F, 0.0F, 0.0F, false);
			orejas2 = new ModelRenderer(this);
			orejas2.setRotationPoint(-6.5F, -4.0F, 0.0F);
			head.addChild(orejas2);
			orejas2_r1 = new ModelRenderer(this);
			orejas2_r1.setRotationPoint(2.5F, 1.0F, -2.0F);
			orejas2.addChild(orejas2_r1);
			setRotationAngle(orejas2_r1, 0.0F, 0.6981F, 0.0873F);
			orejas2_r1.setTextureOffset(0, 28).addBox(-6.0F, -2.0F, 0.0F, 7.0F, 4.0F, 0.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			pixie.addChild(body);
			body.setTextureOffset(18, 51).addBox(-2.68F, -11.16F, 1.32F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(31, 98).addBox(-1.18F, -13.16F, 3.32F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -7.9728F, 1.3048F);
			body.addChild(bone);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(0.0F, 0.0F, 1.5F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, -0.4363F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(8, 76).addBox(-2.6064F, -1.8032F, -2.7048F, 5.0F, 3.0F, 2.0F, 0.0F, false);
			wings2 = new ModelRenderer(this);
			wings2.setRotationPoint(-2.0F, -7.0F, 7.0F);
			body.addChild(wings2);
			setRotationAngle(wings2, 0.6109F, -0.8727F, 0.0F);
			wings2_r1 = new ModelRenderer(this);
			wings2_r1.setRotationPoint(-0.1433F, 5.6724F, -1.5919F);
			wings2.addChild(wings2_r1);
			setRotationAngle(wings2_r1, 0.9599F, -0.0873F, 0.0F);
			wings2_r1.setTextureOffset(61, 72).addBox(0.6262F, -2.3763F, -4.6624F, 0.0F, 20.0F, 30.0F, 0.0F, true);
			wings3 = new ModelRenderer(this);
			wings3.setRotationPoint(2.0F, -7.0F, 7.0F);
			body.addChild(wings3);
			setRotationAngle(wings3, 0.6109F, 0.8727F, 0.0F);
			wings3_r1 = new ModelRenderer(this);
			wings3_r1.setRotationPoint(0.1433F, 5.6724F, -1.5919F);
			wings3.addChild(wings3_r1);
			setRotationAngle(wings3_r1, 0.9599F, 0.0873F, 0.0F);
			wings3_r1.setTextureOffset(61, 72).addBox(-0.6262F, -2.3763F, -4.6624F, 0.0F, 20.0F, 30.0F, 0.0F, false);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(-2.6F, -10.4F, 5.0F);
			body.addChild(arm2);
			setRotationAngle(arm2, 0.0F, 0.0F, 0.1745F);
			arm2.setTextureOffset(48, 52).addBox(-2.46F, -0.54F, -2.34F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			arm5 = new ModelRenderer(this);
			arm5.setRotationPoint(-2.0F, 5.0F, 0.0F);
			arm2.addChild(arm5);
			setRotationAngle(arm5, -0.2618F, 0.0F, 0.0F);
			arm5.setTextureOffset(50, 67).addBox(-0.435F, -0.6336F, -2.284F, 2.0F, 6.0F, 3.0F, 0.0F, false);
			arm3 = new ModelRenderer(this);
			arm3.setRotationPoint(2.6F, -10.4F, 4.0F);
			body.addChild(arm3);
			setRotationAngle(arm3, 0.0F, 0.0F, -0.1745F);
			arm3.setTextureOffset(48, 52).addBox(0.12F, -0.54F, -1.34F, 2.0F, 5.0F, 3.0F, 0.0F, true);
			arm4 = new ModelRenderer(this);
			arm4.setRotationPoint(2.0F, 5.0F, 1.0F);
			arm3.addChild(arm4);
			setRotationAngle(arm4, -0.2618F, 0.0F, 0.0F);
			arm4.setTextureOffset(50, 67).addBox(-1.8745F, -0.6336F, -2.284F, 2.0F, 6.0F, 3.0F, 0.0F, true);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, -2.0F, 4.0F);
			body.addChild(body2);
			body2.setTextureOffset(15, 35).addBox(-3.44F, -1.9006F, -2.58F, 6.0F, 2.0F, 5.0F, 0.0F, true);
			body2.setTextureOffset(81, 45).addBox(-5.0006F, -3.1854F, -3.7115F, 9.0F, 13.0F, 8.0F, -1.0F, false);
			body3 = new ModelRenderer(this);
			body3.setRotationPoint(0.0F, -2.0F, 4.0F);
			body.addChild(body3);
			legs3 = new ModelRenderer(this);
			legs3.setRotationPoint(-2.5F, 0.8894F, -0.5F);
			body3.addChild(legs3);
			setRotationAngle(legs3, -0.0873F, 0.0F, 0.0F);
			legss2 = new ModelRenderer(this);
			legss2.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs3.addChild(legss2);
			legss2_r1 = new ModelRenderer(this);
			legss2_r1.setRotationPoint(2.1985F, 3.7125F, 1.312F);
			legss2.addChild(legss2_r1);
			setRotationAngle(legss2_r1, 0.0873F, 0.0F, 0.0F);
			legss2_r1.setTextureOffset(85, 33).addBox(-2.8226F, -3.8167F, -2.0807F, 2.0F, 6.0F, 3.0F, 0.0F, true);
			legs4 = new ModelRenderer(this);
			legs4.setRotationPoint(0.0F, 5.0F, 0.0F);
			legs3.addChild(legs4);
			setRotationAngle(legs4, 0.1745F, 0.0F, 0.0F);
			legs4.setTextureOffset(83, 11).addBox(-0.6548F, 0.2864F, -0.6325F, 2.0F, 6.0F, 3.0F, 0.0F, true);
			body4 = new ModelRenderer(this);
			body4.setRotationPoint(0.0F, -2.0F, 4.0F);
			body.addChild(body4);
			legs2 = new ModelRenderer(this);
			legs2.setRotationPoint(2.5F, 0.8894F, -0.5F);
			body4.addChild(legs2);
			setRotationAngle(legs2, -0.0873F, 0.0F, 0.0F);
			legss3 = new ModelRenderer(this);
			legss3.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs2.addChild(legss3);
			legss3_r1 = new ModelRenderer(this);
			legss3_r1.setRotationPoint(-2.1985F, 3.7125F, 1.312F);
			legss3.addChild(legss3_r1);
			setRotationAngle(legss3_r1, 0.0873F, 0.0F, 0.0F);
			legss3_r1.setTextureOffset(85, 33).addBox(0.1926F, -3.8167F, -2.0807F, 2.0F, 6.0F, 3.0F, 0.0F, false);
			legs5 = new ModelRenderer(this);
			legs5.setRotationPoint(0.0F, 5.0F, 0.0F);
			legs2.addChild(legs5);
			setRotationAngle(legs5, 0.1745F, 0.0F, 0.0F);
			legs5.setTextureOffset(83, 11).addBox(-2.0152F, 0.2864F, -0.6325F, 2.0F, 6.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bodypixie.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.wings3.rotateAngleX = f2 / 20.f;
			this.wings3.rotateAngleZ = f2 / 20.f;
			this.wings2.rotateAngleZ = f3 / 20.f;
		    this.wings2.rotateAngleX = f3 / 20.f;

			this.arm5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.arm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.arm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.arm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
