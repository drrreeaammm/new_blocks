// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltest_warden extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_ear_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modeltest_warden() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -9.2F, -2.4F);
		setRotationAngle(head, 0.2269F, 0.0F, 0.0F);

		left_ear_r1 = new ModelRenderer(this);
		left_ear_r1.setRotationPoint(0.0F, 34.0F, 0.0F);
		head.addChild(left_ear_r1);
		setRotationAngle(left_ear_r1, 0.0436F, 0.0F, 0.0F);
		left_ear_r1.setTextureOffset(106, 46).addBox(8.0F, -53.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
		left_ear_r1.setTextureOffset(106, 36).addBox(-18.0F, -53.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
		left_ear_r1.setTextureOffset(0, 0).addBox(-8.0F, -50.0F, -5.0F, 16.0F, 16.0F, 10.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.25F, -3.0F);
		setRotationAngle(body, 0.3054F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 34.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0436F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 26).addBox(-9.0F, -34.0F, -5.0F, 18.0F, 21.0F, 11.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-10.0F, -2.75F, -3.5F);
		setRotationAngle(right_arm, -0.5236F, 0.2094F, 0.0097F);
		right_arm.setTextureOffset(52, 0).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(10.0F, -2.75F, -3.5F);
		setRotationAngle(left_arm, -0.5236F, -0.2094F, 0.0097F);
		left_arm.setTextureOffset(84, 0).addBox(-2.0F, -4.0F, -4.0F, 8.0F, 28.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(5.75F, 11.0F, 0.0F);
		left_leg.setTextureOffset(82, 36).addBox(-3.0F, 0.0F, -2.5F, 6.0F, 13.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-5.75F, 11.0F, 0.75F);
		right_leg.setTextureOffset(58, 36).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
	}
}