// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelninjastar extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelninjastar() {
		textureWidth = 22;
		textureHeight = 22;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-1.5F, -1.75F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 18).addBox(-2.5F, -1.75F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 0).addBox(-3.5F, -1.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 10).addBox(-3.5F, -1.75F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(18, 0).addBox(-4.5F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 18).addBox(1.5F, -1.75F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 0).addBox(2.5F, -1.75F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(18, 0).addBox(3.5F, -1.75F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 20).addBox(-1.5F, -1.75F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 0).addBox(-1.5F, -1.75F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(18, 0).addBox(-1.5F, -1.75F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(14, 20).addBox(-1.5F, -1.75F, 1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 0).addBox(-0.5F, -1.75F, 2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(18, 0).addBox(0.5F, -1.75F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}