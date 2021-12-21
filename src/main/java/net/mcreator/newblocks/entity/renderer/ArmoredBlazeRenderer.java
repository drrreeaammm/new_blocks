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

import net.mcreator.newblocks.entity.ArmoredBlazeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ArmoredBlazeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ArmoredBlazeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelarmoredblaze(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/terminator-blaze-on-planetminecraft-com.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelarmoredblaze extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer stick1;
		private final ModelRenderer stick2;
		private final ModelRenderer stick3;
		private final ModelRenderer stick4;
		private final ModelRenderer stick5;
		private final ModelRenderer stick6;
		private final ModelRenderer stick7;
		private final ModelRenderer stick8;
		private final ModelRenderer stick9;
		private final ModelRenderer stick10;
		private final ModelRenderer stick11;
		private final ModelRenderer stick12;

		public Modelarmoredblaze() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			stick1 = new ModelRenderer(this);
			stick1.setRotationPoint(7.0F, -2.0F, -7.0F);
			stick1.setTextureOffset(0, 16).addBox(-15.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick2 = new ModelRenderer(this);
			stick2.setRotationPoint(-7.0F, -2.0F, -7.0F);
			stick2.setTextureOffset(0, 16).addBox(13.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick3 = new ModelRenderer(this);
			stick3.setRotationPoint(-7.0F, -2.0F, 7.0F);
			stick3.setTextureOffset(0, 16).addBox(13.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick4 = new ModelRenderer(this);
			stick4.setRotationPoint(7.0F, -2.0F, 7.0F);
			stick4.setTextureOffset(0, 16).addBox(-15.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick5 = new ModelRenderer(this);
			stick5.setRotationPoint(5.0F, 2.0F, -5.0F);
			stick5.setTextureOffset(0, 16).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick6 = new ModelRenderer(this);
			stick6.setRotationPoint(-5.0F, 2.0F, -5.0F);
			stick6.setTextureOffset(0, 16).addBox(9.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick7 = new ModelRenderer(this);
			stick7.setRotationPoint(-5.0F, 2.0F, 5.0F);
			stick7.setTextureOffset(0, 16).addBox(9.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick8 = new ModelRenderer(this);
			stick8.setRotationPoint(5.0F, 2.0F, 5.0F);
			stick8.setTextureOffset(0, 16).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick9 = new ModelRenderer(this);
			stick9.setRotationPoint(3.0F, 10.0F, -3.0F);
			stick9.setTextureOffset(0, 16).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick10 = new ModelRenderer(this);
			stick10.setRotationPoint(-3.0F, 10.0F, -3.0F);
			stick10.setTextureOffset(0, 16).addBox(5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick11 = new ModelRenderer(this);
			stick11.setRotationPoint(-3.0F, 10.0F, 3.0F);
			stick11.setTextureOffset(0, 16).addBox(5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			stick12 = new ModelRenderer(this);
			stick12.setRotationPoint(3.0F, 10.0F, 3.0F);
			stick12.setTextureOffset(0, 16).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			stick1.render(matrixStack, buffer, packedLight, packedOverlay);
			stick2.render(matrixStack, buffer, packedLight, packedOverlay);
			stick3.render(matrixStack, buffer, packedLight, packedOverlay);
			stick4.render(matrixStack, buffer, packedLight, packedOverlay);
			stick5.render(matrixStack, buffer, packedLight, packedOverlay);
			stick6.render(matrixStack, buffer, packedLight, packedOverlay);
			stick7.render(matrixStack, buffer, packedLight, packedOverlay);
			stick8.render(matrixStack, buffer, packedLight, packedOverlay);
			stick9.render(matrixStack, buffer, packedLight, packedOverlay);
			stick10.render(matrixStack, buffer, packedLight, packedOverlay);
			stick11.render(matrixStack, buffer, packedLight, packedOverlay);
			stick12.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
