// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrat extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelrat() {
		textureWidth = 16;
		textureHeight = 16;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 4).addBox(-2.0F, -2.0F, -2.6F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 14).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, 0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -1.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 14).addBox(-2.0F, -3.0F, -1.6F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 12).addBox(4.0F, -1.0F, -0.2F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(8, 4).addBox(3.0F, -1.0F, -1.6F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}