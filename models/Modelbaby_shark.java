// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbaby_shark extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer finside_r1;
	private final ModelRenderer finside_r2;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head_r1;
	private final ModelRenderer fin_r1;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer tail_r2;

	public Modelbaby_shark() {
		textureWidth = 84;
		textureHeight = 84;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(28, 58).addBox(-2.08F, -3.31F, -6.2F, 4.0F, 3.0F, 13.0F, 0.0F, false);
		body.setTextureOffset(32, 63).addBox(-2.14F, -4.1F, -5.89F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		finside_r1 = new ModelRenderer(this);
		finside_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(finside_r1);
		setRotationAngle(finside_r1, 0.0F, 0.0F, 0.3054F);
		finside_r1.setTextureOffset(29, 79).addBox(-0.04F, -2.86F, -2.17F, 5.0F, 1.0F, 2.0F, 0.0F, true);

		finside_r2 = new ModelRenderer(this);
		finside_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(finside_r2);
		setRotationAngle(finside_r2, 0.0F, 0.0F, -0.3054F);
		finside_r2.setTextureOffset(29, 79).addBox(-5.0F, -2.86F, -2.17F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(29, 53).addBox(-2.14F, -3.55F, -8.37F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
		head_r1.setTextureOffset(68, 25).addBox(-2.14F, -4.42F, -8.68F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		fin_r1 = new ModelRenderer(this);
		fin_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(fin_r1);
		setRotationAngle(fin_r1, -0.48F, 0.0F, 0.0F);
		fin_r1.setTextureOffset(28, 72).addBox(-0.69F, -5.86F, -3.41F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.setTextureOffset(56, 71).addBox(-0.915F, -3.24F, 6.82F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.5236F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(74, 74).addBox(-0.845F, 2.425F, 9.3F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		tail_r2 = new ModelRenderer(this);
		tail_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		tail.addChild(tail_r2);
		setRotationAngle(tail_r2, -0.4363F, 0.0F, 0.0F);
		tail_r2.setTextureOffset(74, 74).addBox(-0.845F, -10.2F, 6.82F, 1.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
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