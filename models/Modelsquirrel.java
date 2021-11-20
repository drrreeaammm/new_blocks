// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsquirrel extends EntityModel<Entity> {
	private final ModelRenderer left_foot;
	private final ModelRenderer right_foot;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer bone;
	private final ModelRenderer tail_sub_1;
	private final ModelRenderer bone2;
	private final ModelRenderer tail_sub_3;
	private final ModelRenderer bone3;
	private final ModelRenderer tail_sub_5;

	public Modelsquirrel() {
		textureWidth = 64;
		textureHeight = 32;

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(-3.0F, 16.0F, 6.2F);
		left_foot.setTextureOffset(0, 24).addBox(-1.0F, 7.0F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, true);
		left_foot.setTextureOffset(16, 15).addBox(-1.0F, 3.0F, -1.7F, 2.0F, 4.0F, 5.0F, 0.0F, true);

		right_foot = new ModelRenderer(this);
		right_foot.setRotationPoint(3.0F, 16.0F, 6.2F);
		right_foot.setTextureOffset(30, 17).addBox(-1.0F, 3.0F, -1.7F, 2.0F, 4.0F, 5.0F, 0.0F, true);
		right_foot.setTextureOffset(0, 24).addBox(-1.0F, 7.0F, -3.7F, 2.0F, 1.0F, 7.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, 0.0F, -10.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -1.0F);
		left_arm.setTextureOffset(8, 15).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, 17.0F, -1.0F);
		right_arm.setTextureOffset(0, 15).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.0F, -1.0F);
		head.setTextureOffset(27, 0).addBox(-2.5F, -2.0F, -5.0F, 5.0F, 4.0F, 5.0F, 0.0F, true);
		head.setTextureOffset(52, 0).addBox(1.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(58, 0).addBox(-3.0F, -4.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 0).addBox(-1.5F, -0.5F, -6.5F, 3.0F, 2.0F, 2.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 16.25F, 9.0F);
		tail.setTextureOffset(18, 25).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 4.0F, 3.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -0.5F, 2.5F);
		tail.addChild(bone);
		setRotationAngle(bone, -0.6109F, 0.0F, 0.0F);

		tail_sub_1 = new ModelRenderer(this);
		tail_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(tail_sub_1);
		tail_sub_1.setTextureOffset(48, 20).addBox(-2.5F, -6.1117F, -0.3528F, 5.0F, 9.0F, 3.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -0.5F, 2.5F);
		tail.addChild(bone2);
		setRotationAngle(bone2, 0.6109F, 0.0F, 0.0F);

		tail_sub_3 = new ModelRenderer(this);
		tail_sub_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(tail_sub_3);
		tail_sub_3.setTextureOffset(48, 4).addBox(-2.0F, -4.6117F, 2.6028F, 4.0F, 5.0F, 4.0F, 0.0F, true);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -10.25F, 5.25F);
		tail.addChild(bone3);
		setRotationAngle(bone3, -0.3491F, 0.0F, 0.0F);

		tail_sub_5 = new ModelRenderer(this);
		tail_sub_5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(tail_sub_5);
		tail_sub_5.setTextureOffset(32, 9).addBox(-1.5F, 0.3794F, -1.566F, 3.0F, 5.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_foot.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_foot.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}