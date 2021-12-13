// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldark_magic_exploding_pillar extends EntityModel<Entity> {
	private final ModelRenderer base;

	public Modeldark_magic_exploding_pillar() {
		textureWidth = 64;
		textureHeight = 128;

		base = new ModelRenderer(this);
		base.setRotationPoint(5.0F, 12.0F, -5.0F);
		base.setTextureOffset(0, 64).addBox(-12.0F, -38.0F, -2.0F, 14.0F, 50.0F, 14.0F, 0.0F, false);
		base.setTextureOffset(0, 0).addBox(-10.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		base.render(matrixStack, buffer, packedLight, packedOverlay);
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