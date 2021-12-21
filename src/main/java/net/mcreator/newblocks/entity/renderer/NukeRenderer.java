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

import net.mcreator.newblocks.entity.NukeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NukeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NukeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelnuke(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("new_blocks:textures/nuke.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelnuke extends EntityModel<Entity> {
		private final ModelRenderer nuke;
		private final ModelRenderer nuke_r1;

		public Modelnuke() {
			textureWidth = 64;
			textureHeight = 64;
			nuke = new ModelRenderer(this);
			nuke.setRotationPoint(0.0F, -18.0F, 0.0F);
			setRotationAngle(nuke, 3.1416F, 0.0F, 0.0F);
			nuke.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, 3.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
			nuke.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, -4.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
			nuke.setTextureOffset(0, 34).addBox(-3.5F, -28.0F, -3.5F, 7.0F, 23.0F, 7.0F, 0.5F, false);
			nuke.setTextureOffset(15, 44).addBox(-0.5F, -39.0F, -0.5F, 1.0F, 11.0F, 1.0F, 0.5F, false);
			nuke.setTextureOffset(8, 46).addBox(-1.5F, -34.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.5F, false);
			nuke.setTextureOffset(3, 54).addBox(-1.5F, -25.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.5F, false);
			nuke.setTextureOffset(5, 49).addBox(-2.5F, -30.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.5F, false);
			nuke.setTextureOffset(0, 0).addBox(-4.5F, -5.0F, 2.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);
			nuke.setTextureOffset(0, 0).addBox(2.5F, -5.0F, 2.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);
			nuke.setTextureOffset(0, 0).addBox(-4.5F, -5.0F, -4.5F, 2.0F, 5.0F, 2.0F, 0.5F, true);
			nuke.setTextureOffset(0, 0).addBox(2.5F, -5.0F, -4.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);
			nuke_r1 = new ModelRenderer(this);
			nuke_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			nuke.addChild(nuke_r1);
			setRotationAngle(nuke_r1, 0.0F, -1.5708F, 0.0F);
			nuke_r1.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, 3.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
			nuke_r1.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, -4.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			nuke.render(matrixStack, buffer, packedLight, packedOverlay);
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
