// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbomb extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelbomb() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 14).addBox(-15.0F, -9.0F, 1.0F, 13.0F, 1.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(0, 14).addBox(-15.0F, -21.0F, 1.0F, 13.0F, 1.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-16.0F, -20.0F, 0.0F, 15.0F, 11.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 2).addBox(-8.0F, -27.0F, 7.5F, 0.0F, 6.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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