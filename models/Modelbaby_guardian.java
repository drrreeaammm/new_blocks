// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbaby_guardian extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_flipped;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer eye;
	private final ModelRenderer tail1;
	private final ModelRenderer body2;
	private final ModelRenderer body3;

	public Modelbaby_guardian() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(30, 0).addBox(-3.28F, 15.76F, -4.96F, 7.0F, 7.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(22, 53).addBox(-3.28F, 14.82F, -3.72F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(16, 40).addBox(-3.28F, 22.5F, -3.72F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(23, 50).addBox(-4.22F, 15.76F, -3.72F, 1.0F, 7.0F, 7.0F, 0.0F, false);

		body_flipped = new ModelRenderer(this);
		body_flipped.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(body_flipped);

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body_flipped.addChild(body_sub_1);
		body_sub_1.setTextureOffset(48, 50).addBox(3.46F, -8.24F, -3.72F, 1.0F, 7.0F, 7.0F, 0.0F, true);

		eye = new ModelRenderer(this);
		eye.setRotationPoint(0.0F, 0.5F, -8.25F);
		eye.setTextureOffset(8, 0).addBox(-0.38F, 18.22F, 3.135F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail1.setTextureOffset(32, 42).addBox(-0.38F, 18.41F, 10.15F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		tail1.setTextureOffset(25, 25).addBox(-0.38F, 15.83F, 14.01F, 1.0F, 6.0F, 6.0F, 0.0F, false);
		tail1.setTextureOffset(1, 42).addBox(-0.82F, 18.22F, 8.43F, 2.0F, 2.0F, 4.0F, 0.0F, false);
		tail1.setTextureOffset(32, 42).addBox(-0.76F, 18.28F, 4.09F, 2.0F, 2.0F, 5.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(2.75F, 23.5F, 0.0F);
		setRotationAngle(body2, 0.0F, 0.0F, -0.3054F);
		body2.setTextureOffset(1, 4).addBox(-7.75F, -8.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(1, 4).addBox(-7.75F, -5.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(1, 4).addBox(-7.75F, -5.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(1, 4).addBox(-7.75F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(1, 4).addBox(-7.75F, -8.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(1, 4).addBox(-7.75F, -8.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(-5.5F, 22.5F, 0.0F);
		setRotationAngle(body3, 0.0F, 0.0F, 0.3054F);
		body3.setTextureOffset(1, 4).addBox(6.25F, -8.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body3.setTextureOffset(1, 4).addBox(6.0F, -5.0F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body3.setTextureOffset(1, 4).addBox(6.0F, -5.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body3.setTextureOffset(1, 4).addBox(6.0F, -5.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body3.setTextureOffset(1, 4).addBox(6.25F, -8.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		body3.setTextureOffset(1, 4).addBox(6.25F, -8.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		eye.render(matrixStack, buffer, packedLight, packedOverlay);
		tail1.render(matrixStack, buffer, packedLight, packedOverlay);
		body2.render(matrixStack, buffer, packedLight, packedOverlay);
		body3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.tail1.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}