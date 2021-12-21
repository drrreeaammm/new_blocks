// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelalexjones extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelalexjones() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(55, 68).addBox(-7.0F, -15.0F, -2.0F, 5.0F, 15.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(55, 68).addBox(2.0F, -15.0F, -2.0F, 5.0F, 15.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(46, 78).addBox(-8.0F, -27.0F, -4.0F, 16.0F, 20.0F, 9.0F, 0.0F, false);
		bb_main.setTextureOffset(53, 20).addBox(-6.0F, -39.0F, -4.0F, 12.0F, 12.0F, 9.0F, 0.0F, false);
		bb_main.setTextureOffset(62, 44).addBox(-3.0F, -31.0F, -5.0F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(62, 66).addBox(-14.0F, -25.0F, -1.0F, 6.0F, 16.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(62, 66).addBox(8.0F, -25.0F, -1.0F, 6.0F, 16.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 73).addBox(-6.0F, -39.0F, 5.0F, 12.0F, 12.0F, 0.0F, 0.0F, false);
		bb_main.setTextureOffset(52, 73).addBox(-6.25F, -39.0F, -4.0F, 3.0F, 12.0F, 9.0F, -0.04F, false);
		bb_main.setTextureOffset(52, 73).addBox(3.25F, -39.0F, -4.0F, 3.0F, 12.0F, 9.0F, -0.04F, false);
		bb_main.setTextureOffset(46, 78).addBox(-8.0F, -27.0F, 4.25F, 16.0F, 20.0F, 1.0F, 0.0F, false);
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