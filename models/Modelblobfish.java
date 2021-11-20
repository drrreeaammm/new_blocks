// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelblobfish extends EntityModel<Entity> {
	private final ModelRenderer body;

	public Modelblobfish() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 6).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(16, 2).addBox(2.5F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(14, 14).addBox(-3.5F, -5.0F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(20, 11).addBox(-2.0F, -5.0F, -3.5F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 18).addBox(-2.0F, -5.0F, 2.5F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 17).addBox(-1.5F, -1.25F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(22, 4).addBox(-1.5F, -3.25F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 2).addBox(-2.0F, -2.25F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, -2.25F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 24).addBox(-3.0F, -5.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 24).addBox(2.0F, -5.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 24).addBox(2.0F, -5.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(16, 23).addBox(-3.0F, -5.0F, -3.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-2.5F, -6.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(20, 19).addBox(-3.25F, -6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(6, 20).addBox(2.25F, -6.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(22, 2).addBox(-2.0F, -6.0F, 2.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(-2.0F, -7.0F, -2.25F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(15, 0).addBox(-2.0F, -6.0F, -3.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.25F, -4.75F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(0.25F, -4.75F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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