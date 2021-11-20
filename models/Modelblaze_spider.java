// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelblaze_spider extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer neck;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer right_arm2;
	private final ModelRenderer right_arm_two;
	private final ModelRenderer right_arm3;
	private final ModelRenderer right_arm;

	public Modelblaze_spider() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 3.0F, 7.0F);
		setRotationAngle(head, 0.1309F, 0.0F, 0.0F);
		head.setTextureOffset(32, 4).addBox(-4.0F, -2.7311F, -15.2185F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 8.0F, 6.25F);
		setRotationAngle(neck, -0.8727F, 0.0F, 0.0F);
		neck.setTextureOffset(0, 0).addBox(-3.0F, 4.906F, -7.6294F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		setRotationAngle(body, -1.2654F, 0.0F, 0.0F);
		body.setTextureOffset(0, 12).addBox(-5.0F, 5.2281F, -8.0169F, 10.0F, 8.0F, 12.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 15.0F, 4.0F);
		setRotationAngle(leg1, 0.0F, 0.0F, -0.2618F);
		leg1.setTextureOffset(18, 0).addBox(-23.5823F, 1.1733F, -6.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 15.0F, 4.0F);
		setRotationAngle(leg2, 0.0F, 0.0F, 0.2618F);
		leg2.setTextureOffset(18, 0).addBox(7.5823F, 1.1733F, -6.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 15.0F, 1.0F);
		setRotationAngle(leg3, 0.0F, 0.0F, -0.2618F);
		leg3.setTextureOffset(18, 0).addBox(-23.5823F, 1.1733F, -0.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 15.0F, 1.0F);
		setRotationAngle(leg4, 0.0F, 0.0F, 0.2618F);
		leg4.setTextureOffset(18, 0).addBox(7.5823F, 1.1733F, -0.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm2 = new ModelRenderer(this);
		right_arm2.setRotationPoint(-13.0F, 29.0F, 16.0F);
		setRotationAngle(right_arm2, 0.0F, -0.6545F, 0.0F);
		right_arm2.setTextureOffset(0, 8).addBox(-7.5657F, -15.75F, -20.9502F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_two = new ModelRenderer(this);
		right_arm_two.setRotationPoint(-12.25F, 0.0F, -3.0F);
		right_arm2.addChild(right_arm_two);
		setRotationAngle(right_arm_two, 0.0F, -1.0472F, 0.0F);
		right_arm_two.setTextureOffset(0, 8).addBox(-17.4358F, -15.75F, -14.0211F, 6.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm3 = new ModelRenderer(this);
		right_arm3.setRotationPoint(13.0F, 29.0F, 16.0F);
		setRotationAngle(right_arm3, 0.0F, 0.6545F, 0.0F);
		right_arm3.setTextureOffset(0, 8).addBox(1.5657F, -15.75F, -20.9502F, 6.0F, 2.0F, 2.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(12.25F, 0.0F, -3.0F);
		right_arm3.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 1.0472F, 0.0F);
		right_arm.setTextureOffset(0, 8).addBox(11.4358F, -15.75F, -14.0211F, 6.0F, 2.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}