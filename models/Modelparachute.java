// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelparachute extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public Modelparachute() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(30, 18).addBox(0.0F, -10.0F, -0.5F, 0.0F, 10.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(27, 15).addBox(0.0F, -21.0F, -1.5F, 0.0F, 11.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(59, 21).addBox(0.0F, -29.0F, -0.5F, 0.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 5).addBox(-2.5F, -17.0F, -2.25F, 6.0F, 6.0F, 5.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 32).addBox(-6.5F, -29.75F, -6.5F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		bb_main.setTextureOffset(39, 32).addBox(-6.0F, -30.5F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 17).addBox(-7.0F, -29.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 4).addBox(-7.75F, -28.0F, -8.0F, 16.0F, 1.0F, 16.0F, 0.0F, false);
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