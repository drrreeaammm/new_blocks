// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelscary_spider extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer neck;
	private final ModelRenderer body;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg5;
	private final ModelRenderer leg5_r1;
	private final ModelRenderer leg6;
	private final ModelRenderer leg6_r1;
	private final ModelRenderer leg7;
	private final ModelRenderer leg7_r1;
	private final ModelRenderer leg8;
	private final ModelRenderer leg8_r1;

	public Modelscary_spider() {
		textureWidth = 100;
		textureHeight = 100;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -3.0F);
		head.setTextureOffset(32, 4).addBox(-4.0F, -4.0F, -12.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 15.0F, 0.0F);
		neck.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -7.0F, 6.0F, 6.0F, 10.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		body.setTextureOffset(0, 20).addBox(-5.0F, -6.0F, -6.0F, 10.0F, 10.0F, 18.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(4.0F, 15.0F, 4.0F);
		setRotationAngle(leg1, 0.0F, 0.0F, -0.2182F);
		leg1.setTextureOffset(18, 0).addBox(-23.0F, -1.0F, 2.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-4.0F, 15.0F, 4.0F);
		setRotationAngle(leg2, 0.0F, 0.0F, 0.2182F);
		leg2.setTextureOffset(18, 0).addBox(7.0F, -1.0F, 2.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(4.0F, 15.0F, 1.0F);
		setRotationAngle(leg3, 0.0F, 0.0F, -0.2182F);
		leg3.setTextureOffset(18, 0).addBox(-23.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-4.0F, 15.0F, 1.0F);
		setRotationAngle(leg4, 0.0F, 0.0F, 0.2182F);
		leg4.setTextureOffset(18, 0).addBox(7.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg5 = new ModelRenderer(this);
		leg5.setRotationPoint(4.0F, 15.0F, -2.0F);

		leg5_r1 = new ModelRenderer(this);
		leg5_r1.setRotationPoint(-4.0F, 9.0F, 2.0F);
		leg5.addChild(leg5_r1);
		setRotationAngle(leg5_r1, 0.0F, 0.0F, -0.2618F);
		leg5_r1.setTextureOffset(18, 0).addBox(-16.0F, -10.0F, -3.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg6 = new ModelRenderer(this);
		leg6.setRotationPoint(-4.0F, 15.0F, -2.0F);

		leg6_r1 = new ModelRenderer(this);
		leg6_r1.setRotationPoint(4.0F, 9.0F, 2.0F);
		leg6.addChild(leg6_r1);
		setRotationAngle(leg6_r1, 0.0F, 0.0F, 0.2618F);
		leg6_r1.setTextureOffset(18, 0).addBox(0.0F, -10.0F, -3.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg7 = new ModelRenderer(this);
		leg7.setRotationPoint(4.0F, 15.0F, -5.0F);

		leg7_r1 = new ModelRenderer(this);
		leg7_r1.setRotationPoint(-4.0F, 9.0F, 5.0F);
		leg7.addChild(leg7_r1);
		setRotationAngle(leg7_r1, 0.0F, 0.0F, -0.2618F);
		leg7_r1.setTextureOffset(18, 0).addBox(-16.0F, -10.0F, -6.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		leg8 = new ModelRenderer(this);
		leg8.setRotationPoint(-4.0F, 15.0F, -5.0F);

		leg8_r1 = new ModelRenderer(this);
		leg8_r1.setRotationPoint(4.0F, 9.0F, 5.0F);
		leg8.addChild(leg8_r1);
		setRotationAngle(leg8_r1, 0.0F, 0.0F, 0.2618F);
		leg8_r1.setTextureOffset(18, 0).addBox(0.0F, -10.0F, -6.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);
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
		leg5.render(matrixStack, buffer, packedLight, packedOverlay);
		leg6.render(matrixStack, buffer, packedLight, packedOverlay);
		leg7.render(matrixStack, buffer, packedLight, packedOverlay);
		leg8.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg8.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg6.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg7.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}