// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbaby_dragon extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_right;
	private final ModelRenderer tail;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_left_leg;

	public Modelbaby_dragon() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(204, 210).addBox(-3.5F, -14.0F, -7.5F, 7.0F, 7.0F, 16.0F, 0.0F, false);
		body.setTextureOffset(0, 243).addBox(-3.5F, -13.5F, -15.5F, 7.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(5, 6).addBox(-2.5F, -15.0F, -13.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(5, 6).addBox(1.5F, -15.0F, -13.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(0.0F, 24.0F, 0.0F);
		wing_left.setTextureOffset(105, 163).addBox(3.5F, -13.5F, -5.5F, 14.0F, 1.0F, 8.0F, 0.0F, false);

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(0.0F, 24.0F, 0.0F);
		wing_right.setTextureOffset(105, 163).addBox(-17.5F, -13.5F, -5.5F, 14.0F, 1.0F, 8.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.25F, -1.75F);
		setRotationAngle(tail, -0.0436F, 0.0F, 0.0F);
		tail.setTextureOffset(30, 237).addBox(-2.0F, -13.0F, 5.0F, 4.0F, 4.0F, 16.0F, 0.0F, false);
		tail.setTextureOffset(5, 6).addBox(-0.5F, -15.0F, 10.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(5, 6).addBox(-0.5F, -15.0F, 14.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		tail.setTextureOffset(5, 6).addBox(-0.5F, -15.0F, 17.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		front_right_leg.setTextureOffset(216, 220).addBox(-3.0F, -8.0F, -6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		front_right_leg.setTextureOffset(216, 220).addBox(-3.0F, -3.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		front_left_leg.setTextureOffset(216, 220).addBox(1.0F, -8.0F, -6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		front_left_leg.setTextureOffset(216, 220).addBox(1.0F, -3.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		back_right_leg.setTextureOffset(216, 220).addBox(-3.0F, -8.0F, 6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		back_right_leg.setTextureOffset(216, 220).addBox(-3.0F, -3.0F, 5.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		back_left_leg.setTextureOffset(216, 220).addBox(1.0F, -8.0F, 6.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		back_left_leg.setTextureOffset(216, 220).addBox(1.0F, -3.0F, 5.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		wing_left.render(matrixStack, buffer, packedLight, packedOverlay);
		wing_right.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.wing_left.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.wing_right.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}