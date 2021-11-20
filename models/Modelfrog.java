// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfrog extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer mouth;
	private final ModelRenderer tongue;
	private final ModelRenderer sac;
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer front_right_leg_sub_0;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_right_leg_sub_0;

	public Modelfrog() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 12).addBox(-3.5F, -4.0F, -4.5F, 7.0F, 3.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(23, 18).addBox(-3.5F, -3.01F, -4.5F, 7.0F, 0.0F, 9.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 20.0F, 2.5F);
		mouth.setTextureOffset(0, 0).addBox(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F, 0.0F, false);
		mouth.setTextureOffset(23, 18).addBox(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F, 0.0F, false);
		mouth.setTextureOffset(23, 13).addBox(0.5F, -4.0F, -6.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		mouth.setTextureOffset(35, 13).addBox(-3.5F, -4.0F, -6.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		tongue = new ModelRenderer(this);
		tongue.setRotationPoint(0.0F, 24.0F, 0.0F);
		tongue.setTextureOffset(-8, 24).addBox(-2.0F, -3.25F, -3.5F, 4.0F, 0.0F, 8.0F, 0.0F, false);

		sac = new ModelRenderer(this);
		sac.setRotationPoint(0.0F, 24.0F, 0.0F);
		sac.setTextureOffset(8, 24).addBox(-3.5F, -3.25F, -4.5F, 7.0F, 2.0F, 3.0F, -0.1F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(-3.5F, 21.0F, -2.5F);
		front_left_leg.setTextureOffset(32, 7).addBox(6.5F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		front_left_leg.setTextureOffset(-4, 0).addBox(4.5F, 3.0F, -3.5F, 4.0F, 0.0F, 4.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);

		front_right_leg_sub_0 = new ModelRenderer(this);
		front_right_leg_sub_0.setRotationPoint(3.5F, -3.0F, -2.5F);
		front_right_leg.addChild(front_right_leg_sub_0);
		front_right_leg_sub_0.setTextureOffset(42, 7).addBox(-8.5F, 0.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, true);
		front_right_leg_sub_0.setTextureOffset(-4, 4).addBox(-8.5F, 3.0F, -3.5F, 4.0F, 0.0F, 4.0F, 0.0F, true);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-3.0F, 21.0F, 3.5F);
		back_left_leg.setTextureOffset(23, 0).addBox(5.5F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		back_left_leg.setTextureOffset(-4, 12).addBox(7.5F, 3.0F, -3.0F, 3.0F, 0.0F, 4.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);

		back_right_leg_sub_0 = new ModelRenderer(this);
		back_right_leg_sub_0.setRotationPoint(3.0F, -3.0F, 3.5F);
		back_right_leg.addChild(back_right_leg_sub_0);
		back_right_leg_sub_0.setTextureOffset(37, 0).addBox(-8.5F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		back_right_leg_sub_0.setTextureOffset(-4, 16).addBox(-10.5F, 3.0F, -3.0F, 3.0F, 0.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		mouth.render(matrixStack, buffer, packedLight, packedOverlay);
		tongue.render(matrixStack, buffer, packedLight, packedOverlay);
		sac.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.front_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.front_right_leg_sub_0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_right_leg_sub_0.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.front_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}