// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelaetas_servire extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer tail_r2;
	private final ModelRenderer tail_r3;
	private final ModelRenderer tail_r4;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer leg_right_front;
	private final ModelRenderer leg_right_front2_r1;
	private final ModelRenderer leg_right_front_r1;
	private final ModelRenderer leg_left_front;
	private final ModelRenderer leg_left_front2_r1;
	private final ModelRenderer leg_left_back;
	private final ModelRenderer leg_left_back2_r1;
	private final ModelRenderer leg_right_back;
	private final ModelRenderer leg_right_back2_r1;

	public Modelaetas_servire() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, -0.25F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 2.8798F, 0.0F, -3.1416F);
		body_r1.setTextureOffset(0, 22).addBox(-1.5F, -4.75F, -3.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(tail);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, -0.25F, 0.0F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 1.0472F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(44, 25).addBox(-1.5F, -0.25F, 6.75F, 3.0F, 3.0F, 4.0F, 0.0F, false);

		tail_r2 = new ModelRenderer(this);
		tail_r2.setRotationPoint(0.0F, -0.25F, 0.0F);
		tail.addChild(tail_r2);
		setRotationAngle(tail_r2, 0.9599F, 0.0F, 0.0F);
		tail_r2.setTextureOffset(28, 25).addBox(-0.5F, -0.25F, 10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		tail_r3 = new ModelRenderer(this);
		tail_r3.setRotationPoint(0.0F, -0.25F, 0.0F);
		tail.addChild(tail_r3);
		setRotationAngle(tail_r3, 0.48F, 0.0F, 0.0F);
		tail_r3.setTextureOffset(38, 29).addBox(-0.5F, -2.75F, 5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		tail_r4 = new ModelRenderer(this);
		tail_r4.setRotationPoint(0.0F, -0.25F, 0.0F);
		tail.addChild(tail_r4);
		setRotationAngle(tail_r4, 0.2182F, 0.0F, 0.0F);
		tail_r4.setTextureOffset(30, 29).addBox(-0.5F, -4.0F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 24.0F, 0.0F);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, -0.25F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -0.0873F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(0, 16).addBox(-1.5F, -4.0F, -11.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		neck_r1.setTextureOffset(20, 26).addBox(-1.0F, -3.0F, -8.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		leg_right_front = new ModelRenderer(this);
		leg_right_front.setRotationPoint(0.0F, 24.0F, 0.0F);

		leg_right_front2_r1 = new ModelRenderer(this);
		leg_right_front2_r1.setRotationPoint(1.25F, -2.0F, -2.75F);
		leg_right_front.addChild(leg_right_front2_r1);
		setRotationAngle(leg_right_front2_r1, 0.0873F, 0.0F, 0.0F);
		leg_right_front2_r1.setTextureOffset(0, 0).addBox(-3.25F, 0.983F, -1.413F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		leg_right_front_r1 = new ModelRenderer(this);
		leg_right_front_r1.setRotationPoint(1.25F, -2.0F, -2.5F);
		leg_right_front.addChild(leg_right_front_r1);
		setRotationAngle(leg_right_front_r1, 0.0873F, 0.0F, 0.0F);
		leg_right_front_r1.setTextureOffset(0, 0).addBox(-3.25F, -0.0388F, -0.662F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		leg_left_front = new ModelRenderer(this);
		leg_left_front.setRotationPoint(0.0F, 24.0F, 0.0F);

		leg_left_front2_r1 = new ModelRenderer(this);
		leg_left_front2_r1.setRotationPoint(-1.25F, -2.0F, -2.75F);
		leg_left_front.addChild(leg_left_front2_r1);
		setRotationAngle(leg_left_front2_r1, 0.0873F, 0.0F, 0.0F);
		leg_left_front2_r1.setTextureOffset(0, 0).addBox(2.25F, 0.983F, -1.413F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		leg_left_front2_r1.setTextureOffset(0, 0).addBox(2.25F, -0.017F, -0.413F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		leg_left_back = new ModelRenderer(this);
		leg_left_back.setRotationPoint(0.0F, 24.0F, 4.0F);

		leg_left_back2_r1 = new ModelRenderer(this);
		leg_left_back2_r1.setRotationPoint(-1.25F, -3.0F, -2.75F);
		leg_left_back.addChild(leg_left_back2_r1);
		setRotationAngle(leg_left_back2_r1, 0.0873F, 0.0F, 0.0F);
		leg_left_back2_r1.setTextureOffset(0, 0).addBox(2.25F, 1.9792F, -1.5001F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		leg_left_back2_r1.setTextureOffset(0, 0).addBox(2.25F, -0.0208F, -0.5001F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		leg_right_back = new ModelRenderer(this);
		leg_right_back.setRotationPoint(-3.0F, 24.0F, 4.0F);

		leg_right_back2_r1 = new ModelRenderer(this);
		leg_right_back2_r1.setRotationPoint(4.75F, -3.0F, -2.75F);
		leg_right_back.addChild(leg_right_back2_r1);
		setRotationAngle(leg_right_back2_r1, 0.0873F, 0.0F, 0.0F);
		leg_right_back2_r1.setTextureOffset(0, 0).addBox(-3.75F, 1.9792F, -1.5001F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		leg_right_back2_r1.setTextureOffset(0, 0).addBox(-3.75F, -0.0208F, -0.5001F, 1.0F, 3.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		neck.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_right_front.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_left_front.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_left_back.render(matrixStack, buffer, packedLight, packedOverlay);
		leg_right_back.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg_right_front_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tail_r4.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.tail_r3.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg_left_back.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg_right_front.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg_right_back.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg_left_front2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg_right_front2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg_left_front.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg_left_back2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.tail_r2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.tail_r1.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg_right_back2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}