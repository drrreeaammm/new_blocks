// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelvelociraptor extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer mouth_r1;
	private final ModelRenderer nose_r1;
	private final ModelRenderer head_r1;
	private final ModelRenderer neck_r1;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer arm_left;
	private final ModelRenderer arm_left_r1;
	private final ModelRenderer arm_left_r2;
	private final ModelRenderer arm_right;
	private final ModelRenderer arm_right_r1;
	private final ModelRenderer arm_right_r2;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left_r1;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_left_r2;

	public Modelvelociraptor() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		mouth_r1 = new ModelRenderer(this);
		mouth_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(mouth_r1);
		setRotationAngle(mouth_r1, 0.2618F, 0.0F, 0.0F);
		mouth_r1.setTextureOffset(0, 12).addBox(-1.0F, -17.25F, -17.5F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		nose_r1 = new ModelRenderer(this);
		nose_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(nose_r1);
		setRotationAngle(nose_r1, 0.0873F, 0.0F, 0.0F);
		nose_r1.setTextureOffset(24, 0).addBox(-1.0F, -17.75F, -20.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
		nose_r1.setTextureOffset(48, 12).addBox(-1.0F, -13.0F, 8.25F, 5.0F, 4.0F, 3.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(head_r1);
		setRotationAngle(head_r1, 0.0436F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 0).addBox(-1.5F, -18.0F, -15.5F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.2618F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(10, 22).addBox(-0.5F, -13.0F, -15.5F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.2182F, 0.0F, 0.0F);
		body_r1.setTextureOffset(52, 58).addBox(1.25F, -9.5F, 19.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		body_r1.setTextureOffset(48, 33).addBox(0.25F, -10.0F, 14.5F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.1309F, 0.0F, 0.0F);
		body_r2.setTextureOffset(50, 27).addBox(-0.4F, -12.0F, 11.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, -0.5F, 0.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.1309F, 0.0F, 0.0F);
		body_r3.setTextureOffset(22, 44).addBox(-1.5F, -15.0F, -8.5F, 6.0F, 5.0F, 15.0F, 0.0F, false);

		arm_left = new ModelRenderer(this);
		arm_left.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(arm_left);

		arm_left_r1 = new ModelRenderer(this);
		arm_left_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		arm_left.addChild(arm_left_r1);
		setRotationAngle(arm_left_r1, -0.7854F, 0.0F, 0.0F);
		arm_left_r1.setTextureOffset(60, 0).addBox(2.75F, 2.0F, -10.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		arm_left_r1.setTextureOffset(60, 0).addBox(4.75F, 2.0F, -10.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		arm_left_r1.setTextureOffset(0, 0).addBox(3.75F, -2.0F, -10.75F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		arm_left_r2 = new ModelRenderer(this);
		arm_left_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
		arm_left.addChild(arm_left_r2);
		setRotationAngle(arm_left_r2, -0.0873F, 0.0F, 0.0F);
		arm_left_r2.setTextureOffset(0, 0).addBox(3.75F, -11.5F, -7.75F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		arm_right = new ModelRenderer(this);
		arm_right.setRotationPoint(3.0F, 0.0F, 0.0F);
		body.addChild(arm_right);

		arm_right_r1 = new ModelRenderer(this);
		arm_right_r1.setRotationPoint(0.0F, -0.5F, 0.0F);
		arm_right.addChild(arm_right_r1);
		setRotationAngle(arm_right_r1, -0.7854F, 0.0F, 0.0F);
		arm_right_r1.setTextureOffset(60, 0).addBox(-3.75F, 2.0F, -10.75F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		arm_right_r1.setTextureOffset(60, 0).addBox(-5.75F, 2.0F, -10.75F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		arm_right_r1.setTextureOffset(0, 0).addBox(-4.75F, -2.0F, -10.75F, 1.0F, 4.0F, 1.0F, 0.0F, true);

		arm_right_r2 = new ModelRenderer(this);
		arm_right_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
		arm_right.addChild(arm_right_r2);
		setRotationAngle(arm_right_r2, -0.0873F, 0.0F, 0.0F);
		arm_right_r2.setTextureOffset(0, 0).addBox(-4.75F, -11.5F, -7.75F, 1.0F, 4.0F, 2.0F, 0.0F, true);

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg_left.setTextureOffset(44, 57).addBox(3.75F, -12.0F, 3.25F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		leg_left.setTextureOffset(0, 57).addBox(3.75F, -5.25F, 3.5F, 1.0F, 5.0F, 2.0F, 0.0F, false);
		leg_left.setTextureOffset(9, 61).addBox(3.75F, -1.25F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		leg_left.setTextureOffset(60, 0).addBox(2.75F, -1.25F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg_left.setTextureOffset(60, 0).addBox(4.75F, -1.25F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leg_left_r1 = new ModelRenderer(this);
		leg_left_r1.setRotationPoint(-1.25F, -11.5F, 5.5F);
		leg_left.addChild(leg_left_r1);
		setRotationAngle(leg_left_r1, 0.0436F, 0.0F, 0.0F);
		leg_left_r1.setTextureOffset(0, 57).addBox(5.0F, 1.25F, -2.25F, 1.0F, 5.0F, 2.0F, 0.0F, false);

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(3.0F, 24.0F, 0.0F);
		leg_right.setTextureOffset(38, 57).addBox(-4.75F, -12.0F, 3.25F, 1.0F, 2.0F, 4.0F, 0.0F, true);
		leg_right.setTextureOffset(0, 57).addBox(-4.75F, -5.25F, 3.5F, 1.0F, 5.0F, 2.0F, 0.0F, true);
		leg_right.setTextureOffset(11, 61).addBox(-4.75F, -1.25F, 1.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		leg_right.setTextureOffset(60, 0).addBox(-3.75F, -1.25F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		leg_right.setTextureOffset(60, 0).addBox(-5.75F, -1.25F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		leg_left_r2 = new ModelRenderer(this);
		leg_left_r2.setRotationPoint(1.25F, -11.5F, 5.5F);
		leg_right.addChild(leg_left_r2);
		setRotationAngle(leg_left_r2, 0.0436F, 0.0F, 0.0F);
		leg_left_r2.setTextureOffset(0, 57).addBox(-6.0F, 1.25F, -2.25F, 1.0F, 5.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_left.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_right.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg_left_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg_left_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}