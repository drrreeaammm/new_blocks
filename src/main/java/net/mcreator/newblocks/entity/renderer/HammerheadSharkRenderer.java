package net.mcreator.newblocks.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.newblocks.entity.HammerheadSharkEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HammerheadSharkRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HammerheadSharkEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelhammerhead_shark(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/hammerhead_shark.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelhammerhead_shark extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer finside_r1;
		private final ModelRenderer finside_r2;
		private final ModelRenderer cube_r1;
		private final ModelRenderer fin_r1;
		private final ModelRenderer tail;
		private final ModelRenderer tail_r1;
		private final ModelRenderer tail_r2;
		public Modelhammerhead_shark() {
			textureWidth = 84;
			textureHeight = 84;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(28, 58).addBox(-3.43F, -5.51F, -10.2F, 7.0F, 5.0F, 21.0F, 0.0F, false);
			body.setTextureOffset(32, 63).addBox(-2.94F, -6.1F, -9.69F, 6.0F, 1.0F, 20.0F, 0.0F, false);
			body.setTextureOffset(0, 74).addBox(-2.45F, -5.275F, -18.11F, 5.0F, 4.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(40, 22).addBox(-8.82F, -4.785F, -18.62F, 18.0F, 3.0F, 4.0F, 0.0F, false);
			finside_r1 = new ModelRenderer(this);
			finside_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(finside_r1);
			setRotationAngle(finside_r1, 0.0F, 0.0F, 0.3054F);
			finside_r1.setTextureOffset(29, 79).addBox(-0.09F, -4.06F, -1.785F, 8.0F, 1.0F, 4.0F, 0.0F, true);
			finside_r2 = new ModelRenderer(this);
			finside_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(finside_r2);
			setRotationAngle(finside_r2, 0.0F, 0.0F, -0.3054F);
			finside_r2.setTextureOffset(29, 79).addBox(-7.75F, -4.06F, -1.785F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(28, 50).addBox(-2.94F, -5.295F, -17.6F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			fin_r1 = new ModelRenderer(this);
			fin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(fin_r1);
			setRotationAngle(fin_r1, -0.48F, 0.0F, 0.0F);
			fin_r1.setTextureOffset(49, 68).addBox(-0.49F, -11.81F, -5.61F, 1.0F, 9.0F, 5.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 24.0F, 0.0F);
			tail.setTextureOffset(56, 71).addBox(-2.215F, -5.04F, 10.72F, 4.0F, 3.0F, 9.0F, 0.0F, false);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, 0.5236F, 0.0F, 0.0F);
			tail_r1.setTextureOffset(74, 70).addBox(-0.745F, 4.715F, 15.57F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			tail_r2 = new ModelRenderer(this);
			tail_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(tail_r2);
			setRotationAngle(tail_r2, -0.4363F, 0.0F, 0.0F);
			tail_r2.setTextureOffset(72, 71).addBox(-0.745F, -17.2F, 11.49F, 1.0F, 7.0F, 4.0F, 0.0F, false);
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
		}
	}
}
