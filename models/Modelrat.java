// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrat extends EntityModel<Entity> {
	private final ModelRenderer body3;
	private final ModelRenderer body_s;
	private final ModelRenderer front_right;
	private final ModelRenderer back_left;
	private final ModelRenderer front_left2;
	private final ModelRenderer br_leg;
	private final ModelRenderer tail;
	private final ModelRenderer head;
	private final ModelRenderer left_ear2_r1;
	private final ModelRenderer body3_sub_2_r1;

	public Modelrat() {
		textureWidth = 32;
		textureHeight = 32;

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(0.0F, 20.0F, 1.0F);

		body_s = new ModelRenderer(this);
		body_s.setRotationPoint(0.0F, 0.0F, 0.0F);
		body3.addChild(body_s);
		body_s.setTextureOffset(0, 6).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 5.0F, 8.0F, 0.0F, false);

		front_right = new ModelRenderer(this);
		front_right.setRotationPoint(-1.75F, 22.0F, -2.0F);
		front_right.setTextureOffset(1, 28).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		back_left = new ModelRenderer(this);
		back_left.setRotationPoint(1.75F, 22.0F, 2.75F);
		back_left.setTextureOffset(1, 28).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		front_left2 = new ModelRenderer(this);
		front_left2.setRotationPoint(1.75F, 22.0F, -2.0F);
		front_left2.setTextureOffset(1, 28).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		br_leg = new ModelRenderer(this);
		br_leg.setRotationPoint(-1.75F, 22.0F, 2.5F);
		br_leg.setTextureOffset(1, 28).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.0F, 3.25F);
		setRotationAngle(tail, -0.1309F, 0.0F, 0.0F);
		tail.setTextureOffset(0, 19).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 7.0F, 0.05F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 21.0F, -3.75F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.setTextureOffset(14, 0).addBox(-1.5F, -0.5F, -5.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -1.5F, -3.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		left_ear2_r1 = new ModelRenderer(this);
		left_ear2_r1.setRotationPoint(0.0F, 3.0F, 4.0F);
		head.addChild(left_ear2_r1);
		setRotationAngle(left_ear2_r1, 0.0F, 0.0873F, 0.0F);
		left_ear2_r1.setTextureOffset(24, 0).addBox(-3.25F, -5.75F, -4.75F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		body3_sub_2_r1 = new ModelRenderer(this);
		body3_sub_2_r1.setRotationPoint(0.0F, 3.0F, 4.0F);
		head.addChild(body3_sub_2_r1);
		setRotationAngle(body3_sub_2_r1, 0.0F, -0.0873F, 0.0F);
		body3_sub_2_r1.setTextureOffset(24, 0).addBox(1.25F, -5.75F, -4.75F, 2.0F, 2.0F, 0.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body3.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left2.render(matrixStack, buffer, packedLight, packedOverlay);
		br_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.br_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.front_left2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.tail.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.front_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}