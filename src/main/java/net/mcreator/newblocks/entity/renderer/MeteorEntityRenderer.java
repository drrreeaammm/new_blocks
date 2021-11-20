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

import net.mcreator.newblocks.entity.MeteorEntityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MeteorEntityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MeteorEntityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmeteor(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/meteor.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelmeteor extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer side;
		private final ModelRenderer side2;
		private final ModelRenderer side5;
		private final ModelRenderer side3;
		private final ModelRenderer cube_r1;
		private final ModelRenderer side4;
		private final ModelRenderer cube_r2;
		public Modelmeteor() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-8.5F, -19.5F, -7.5F, 17.0F, 13.0F, 15.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, -6.5F, -6.5F, 15.0F, 1.0F, 13.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, -20.5F, -6.5F, 15.0F, 1.0F, 13.0F, 0.0F, false);
			side = new ModelRenderer(this);
			side.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(side);
			side.setTextureOffset(0, 0).addBox(10.5F, -19.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, false);
			side.setTextureOffset(0, 0).addBox(9.5F, -19.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, false);
			side.setTextureOffset(0, 0).addBox(8.5F, -19.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, false);
			side2 = new ModelRenderer(this);
			side2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(side2);
			side2.setTextureOffset(0, 0).addBox(-11.5F, -19.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, true);
			side2.setTextureOffset(0, 0).addBox(-10.5F, -19.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, true);
			side2.setTextureOffset(0, 0).addBox(-9.5F, -19.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, true);
			side5 = new ModelRenderer(this);
			side5.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(side5);
			side5.setTextureOffset(0, 0).addBox(-11.5F, -7.5F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, true);
			side5.setTextureOffset(0, 0).addBox(-10.5F, -7.5F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, true);
			side5.setTextureOffset(0, 0).addBox(-9.5F, -7.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, true);
			side3 = new ModelRenderer(this);
			side3.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(side3);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -7.0F, 0.0F);
			side3.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
			cube_r1.setTextureOffset(0, 0).addBox(-8.5F, -12.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, true);
			cube_r1.setTextureOffset(0, 0).addBox(-9.5F, -12.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, true);
			cube_r1.setTextureOffset(0, 0).addBox(-10.5F, -12.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, true);
			side4 = new ModelRenderer(this);
			side4.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(side4);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, -7.0F, 0.0F);
			side4.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
			cube_r2.setTextureOffset(0, 0).addBox(-8.5F, -12.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, true);
			cube_r2.setTextureOffset(0, 0).addBox(-9.5F, -12.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, true);
			cube_r2.setTextureOffset(0, 0).addBox(-10.5F, -12.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, true);
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
		}
	}
}
