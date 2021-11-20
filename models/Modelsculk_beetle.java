// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsculk_beetle extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer right_leg_back;
	private final ModelRenderer left_leg_back;
	private final ModelRenderer right_leg_front;
	private final ModelRenderer left_leg_front;

	public Modelsculk_beetle() {
		textureWidth = 42;
		textureHeight = 42;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(body, 0.3054F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-0.25F, -4.75F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.3927F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 25).addBox(-3.25F, -1.8616F, -6.6823F, 7.0F, 4.0F, 13.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 26.25F, -2.0F);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -7.0F, -6.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.1134F, 0.0F, 0.0F);
		head_r1.setTextureOffset(12, 19).addBox(-2.5F, -1.7242F, -2.7461F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		right_leg_back = new ModelRenderer(this);
		right_leg_back.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_leg_back.setTextureOffset(14, 38).addBox(-3.25F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_leg_back = new ModelRenderer(this);
		left_leg_back.setRotationPoint(5.0F, 24.0F, 0.0F);
		left_leg_back.setTextureOffset(14, 38).addBox(-3.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		right_leg_front = new ModelRenderer(this);
		right_leg_front.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_leg_front.setTextureOffset(14, 38).addBox(-3.25F, -3.0F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_leg_front = new ModelRenderer(this);
		left_leg_front.setRotationPoint(0.0F, 24.0F, 0.0F);
		left_leg_front.setTextureOffset(14, 38).addBox(2.0F, -3.0F, -7.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_back.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg_back.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_front.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg_front.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg_front.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_leg_back.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head_r1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head_r1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg_back.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_leg_front.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}