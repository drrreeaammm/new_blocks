// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcrab extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leg3;
	private final ModelRenderer leg3_r1;
	private final ModelRenderer leg4;
	private final ModelRenderer leg4_r1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg2_r1;
	private final ModelRenderer leg6;
	private final ModelRenderer leg6_r1;
	private final ModelRenderer leg1;
	private final ModelRenderer leg1_r1;
	private final ModelRenderer leg5;
	private final ModelRenderer leg5_r1;
	private final ModelRenderer arm1;
	private final ModelRenderer pincer_r1;
	private final ModelRenderer arm_r1;
	private final ModelRenderer arm2;
	private final ModelRenderer pincer_r2;
	private final ModelRenderer arm_r2;

	public Modelcrab() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 25.25F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.5F, -6.0F, -2.25F, 7.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(10, 22).addBox(-3.0F, -8.25F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(10, 22).addBox(1.0F, -8.25F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leg3);

		leg3_r1 = new ModelRenderer(this);
		leg3_r1.setRotationPoint(3.25F, -3.0F, 1.0F);
		leg3.addChild(leg3_r1);
		setRotationAngle(leg3_r1, 0.0F, 0.0F, -0.2618F);
		leg3_r1.setTextureOffset(0, 22).addBox(-9.6657F, -1.6934F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leg4);

		leg4_r1 = new ModelRenderer(this);
		leg4_r1.setRotationPoint(-3.25F, -3.0F, 1.0F);
		leg4.addChild(leg4_r1);
		setRotationAngle(leg4_r1, 0.0F, 0.0F, 0.2618F);
		leg4_r1.setTextureOffset(0, 22).addBox(5.6657F, -1.6934F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leg2);

		leg2_r1 = new ModelRenderer(this);
		leg2_r1.setRotationPoint(3.25F, -3.0F, -0.25F);
		leg2.addChild(leg2_r1);
		setRotationAngle(leg2_r1, 0.0F, 0.0F, -0.2618F);
		leg2_r1.setTextureOffset(0, 22).addBox(-9.6657F, -1.6934F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leg6);

		leg6_r1 = new ModelRenderer(this);
		leg6_r1.setRotationPoint(-3.25F, -3.0F, -0.25F);
		leg6.addChild(leg6_r1);
		setRotationAngle(leg6_r1, 0.0F, 0.0F, 0.2618F);
		leg6_r1.setTextureOffset(0, 22).addBox(5.6657F, -1.6934F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leg1);

		leg1_r1 = new ModelRenderer(this);
		leg1_r1.setRotationPoint(3.25F, -3.0F, -1.5F);
		leg1.addChild(leg1_r1);
		setRotationAngle(leg1_r1, 0.0F, 0.0F, -0.2618F);
		leg1_r1.setTextureOffset(0, 22).addBox(-9.6657F, -1.6934F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(leg5);

		leg5_r1 = new ModelRenderer(this);
		leg5_r1.setRotationPoint(-3.25F, -3.0F, -1.5F);
		leg5.addChild(leg5_r1);
		setRotationAngle(leg5_r1, 0.0F, 0.0F, 0.2618F);
		leg5_r1.setTextureOffset(0, 22).addBox(5.6657F, -1.6934F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(arm1);

		pincer_r1 = new ModelRenderer(this);
		pincer_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm1.addChild(pincer_r1);
		setRotationAngle(pincer_r1, 0.0F, 0.4363F, 0.0F);
		pincer_r1.setTextureOffset(13, 11).addBox(-5.25F, -6.5F, -10.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		arm_r1 = new ModelRenderer(this);
		arm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm1.addChild(arm_r1);
		setRotationAngle(arm_r1, -0.1745F, 0.5672F, 0.0F);
		arm_r1.setTextureOffset(6, 17).addBox(-3.0F, -5.0F, -7.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(arm2);

		pincer_r2 = new ModelRenderer(this);
		pincer_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm2.addChild(pincer_r2);
		setRotationAngle(pincer_r2, 0.0F, -0.4363F, 0.0F);
		pincer_r2.setTextureOffset(13, 11).addBox(1.25F, -6.5F, -10.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);

		arm_r2 = new ModelRenderer(this);
		arm_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm2.addChild(arm_r2);
		setRotationAngle(arm_r2, -0.1745F, -0.5672F, 0.0F);
		arm_r2.setTextureOffset(0, 16).addBox(2.0F, -5.0F, -7.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg1_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg4_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg5_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg6_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}