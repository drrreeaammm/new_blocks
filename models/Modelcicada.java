// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcicada extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer fin_right;
	private final ModelRenderer fin_left;
	private final ModelRenderer eye_right;
	private final ModelRenderer eye_left;

	public Modelcicada() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 27).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 23.0F, 1.5F);
		tail.setTextureOffset(-3, 0).addBox(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

		fin_right = new ModelRenderer(this);
		fin_right.setRotationPoint(1.5F, 23.0F, -1.5F);
		fin_right.setTextureOffset(25, 0).addBox(-4.0F, 1.0F, 0.01F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		fin_left = new ModelRenderer(this);
		fin_left.setRotationPoint(-1.5F, 23.0F, -1.5F);
		fin_left.setTextureOffset(25, 0).addBox(3.0F, 1.0F, 0.01F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		eye_right = new ModelRenderer(this);
		eye_right.setRotationPoint(0.0F, 21.0F, 0.0F);
		eye_right.setTextureOffset(28, 6).addBox(0.5F, 1.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		eye_left = new ModelRenderer(this);
		eye_left.setRotationPoint(0.0F, 21.0F, 0.0F);
		eye_left.setTextureOffset(24, 6).addBox(-1.5F, 1.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_right.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_left.render(matrixStack, buffer, packedLight, packedOverlay);
		eye_right.render(matrixStack, buffer, packedLight, packedOverlay);
		eye_left.render(matrixStack, buffer, packedLight, packedOverlay);
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