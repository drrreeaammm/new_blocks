// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelant extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leg;
	private final ModelRenderer head;

	public Modelant() {
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, 0.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(0, 0).addBox(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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