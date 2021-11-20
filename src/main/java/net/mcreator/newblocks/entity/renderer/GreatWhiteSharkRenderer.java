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

import net.mcreator.newblocks.entity.GreatWhiteSharkEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GreatWhiteSharkRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GreatWhiteSharkEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgreat_white_shark(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/great_white_shark.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgreat_white_shark extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer finside_r1;
		private final ModelRenderer finside_r2;
		private final ModelRenderer cube_r1;
		private final ModelRenderer head_r1;
		private final ModelRenderer fin_r1;
		private final ModelRenderer tail;
		private final ModelRenderer tail_r1;
		private final ModelRenderer tail_r2;
		public Modelgreat_white_shark() {
			textureWidth = 282;
			textureHeight = 282;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(59, 179).addBox(-14.0F, -22.0F, -40.0F, 28.0F, 20.0F, 84.0F, 0.0F, false);
			body.setTextureOffset(0, 94).addBox(-12.0F, -24.0F, -38.0F, 24.0F, 4.0F, 80.0F, 0.0F, false);
			finside_r1 = new ModelRenderer(this);
			finside_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(finside_r1);
			setRotationAngle(finside_r1, 0.0F, 0.0F, -0.3054F);
			finside_r1.setTextureOffset(150, 0).addBox(-32.0F, -16.0F, -14.0F, 32.0F, 4.0F, 16.0F, 0.0F, false);
			finside_r2 = new ModelRenderer(this);
			finside_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(finside_r2);
			setRotationAngle(finside_r2, 0.0F, 0.0F, 0.3054F);
			finside_r2.setTextureOffset(141, 0).addBox(0.0F, -16.0F, -14.0F, 32.0F, 4.0F, 16.0F, 0.0F, true);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(142, 64).addBox(-12.0F, -22.0F, -54.0F, 24.0F, 12.0F, 20.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(head_r1);
			setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
			head_r1.setTextureOffset(187, 0).addBox(-12.0F, -26.0F, -56.0F, 24.0F, 12.0F, 24.0F, 0.0F, false);
			fin_r1 = new ModelRenderer(this);
			fin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(fin_r1);
			setRotationAngle(fin_r1, -0.48F, 0.0F, 0.0F);
			fin_r1.setTextureOffset(146, 0).addBox(-2.0F, -40.0F, -22.0F, 4.0F, 28.0F, 20.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 24.0F, 0.0F);
			tail.setTextureOffset(0, 94).addBox(-9.0F, -20.0F, 44.0F, 16.0F, 12.0F, 28.0F, 0.0F, false);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, 0.5236F, 0.0F, 0.0F);
			tail_r1.setTextureOffset(143, 0).addBox(-3.0F, 15.0F, 60.0F, 4.0F, 20.0F, 12.0F, 0.0F, false);
			tail_r2 = new ModelRenderer(this);
			tail_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			tail.addChild(tail_r2);
			setRotationAngle(tail_r2, -0.4363F, 0.0F, 0.0F);
			tail_r2.setTextureOffset(151, 0).addBox(-3.0F, -64.0F, 44.0F, 4.0F, 24.0F, 16.0F, 0.0F, false);
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
