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

import net.mcreator.newblocks.entity.GoldFishEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GoldFishRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GoldFishEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelgold_fish(), 0.3f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/gold_fish.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelgold_fish extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer right_fin;
		private final ModelRenderer left_fin;
		private final ModelRenderer fin_top;
		private final ModelRenderer tail;
		private final ModelRenderer fin_left;
		private final ModelRenderer fin_right;
		public Modelgold_fish() {
			textureWidth = 32;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 22.5F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);
			right_fin = new ModelRenderer(this);
			right_fin.setRotationPoint(-1.0F, 1.5F, 0.0F);
			body.addChild(right_fin);
			setRotationAngle(right_fin, 0.0F, 0.7854F, 0.0F);
			right_fin.setTextureOffset(2, 16).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			left_fin = new ModelRenderer(this);
			left_fin.setRotationPoint(1.0F, 1.5F, 0.0F);
			body.addChild(left_fin);
			setRotationAngle(left_fin, 0.0F, -0.7854F, 0.0F);
			left_fin.setTextureOffset(2, 12).addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);
			fin_top = new ModelRenderer(this);
			fin_top.setRotationPoint(0.0F, 21.0F, -3.0F);
			fin_top.setTextureOffset(10, -6).addBox(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 22.5F, 3.0F);
			tail.setTextureOffset(24, -4).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			fin_left = new ModelRenderer(this);
			fin_left.setRotationPoint(0.0F, 24.0F, 0.0F);
			fin_right = new ModelRenderer(this);
			fin_right.setRotationPoint(0.0F, 24.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_top.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_left.render(matrixStack, buffer, packedLight, packedOverlay);
			fin_right.render(matrixStack, buffer, packedLight, packedOverlay);
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
