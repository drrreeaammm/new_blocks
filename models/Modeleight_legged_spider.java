// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeleight_legged_spider extends EntityModel<Entity> {
	private final ModelRenderer left_leg_1;
	private final ModelRenderer left_leg_1_r1;
	private final ModelRenderer left_leg_1_r2;
	private final ModelRenderer left_leg_2;
	private final ModelRenderer left_leg_2_r1;
	private final ModelRenderer left_leg_2_r2;
	private final ModelRenderer left_leg_3;
	private final ModelRenderer left_leg_3_r1;
	private final ModelRenderer left_leg_3_r2;
	private final ModelRenderer left_leg_4;
	private final ModelRenderer left_leg_4_r1;
	private final ModelRenderer left_leg_4_r2;
	private final ModelRenderer right_leg_4;
	private final ModelRenderer right_leg_4_r1;
	private final ModelRenderer right_leg_4_r2;
	private final ModelRenderer right_leg_2;
	private final ModelRenderer right_leg_2_r1;
	private final ModelRenderer right_leg_2_r2;
	private final ModelRenderer right_leg_3;
	private final ModelRenderer right_leg_3_r1;
	private final ModelRenderer right_leg_3_r2;
	private final ModelRenderer right_leg_1;
	private final ModelRenderer right_leg_1_r1;
	private final ModelRenderer right_leg_1_r2;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer head;
	private final ModelRenderer cube_r4;
	private final ModelRenderer front_leg;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer front_leg2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public Modeleight_legged_spider() {
		textureWidth = 32;
		textureHeight = 52;

		left_leg_1 = new ModelRenderer(this);
		left_leg_1.setRotationPoint(-19.0F, -3.0F, -8.0F);

		left_leg_1_r1 = new ModelRenderer(this);
		left_leg_1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_leg_1.addChild(left_leg_1_r1);
		setRotationAngle(left_leg_1_r1, 0.0F, 0.0F, -0.2618F);
		left_leg_1_r1.setTextureOffset(28, 0).addBox(30.1145F, 21.9976F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_1_r2 = new ModelRenderer(this);
		left_leg_1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_leg_1.addChild(left_leg_1_r2);
		setRotationAngle(left_leg_1_r2, 0.0F, 0.0F, -0.3927F);
		left_leg_1_r2.setTextureOffset(28, 0).addBox(26.9713F, 9.2157F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_2 = new ModelRenderer(this);
		left_leg_2.setRotationPoint(0.0F, 24.0F, 0.0F);

		left_leg_2_r1 = new ModelRenderer(this);
		left_leg_2_r1.setRotationPoint(-19.4059F, -27.2323F, 0.5F);
		left_leg_2.addChild(left_leg_2_r1);
		setRotationAngle(left_leg_2_r1, 0.0F, 0.0F, -0.2618F);
		left_leg_2_r1.setTextureOffset(28, 0).addBox(30.4465F, 22.327F, -0.5F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_2_r2 = new ModelRenderer(this);
		left_leg_2_r2.setRotationPoint(-19.399F, -27.1837F, 0.5F);
		left_leg_2.addChild(left_leg_2_r2);
		setRotationAngle(left_leg_2_r2, 0.0F, 0.0F, -0.3927F);
		left_leg_2_r2.setTextureOffset(28, 0).addBox(27.2696F, 9.5381F, -0.5F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_3 = new ModelRenderer(this);
		left_leg_3.setRotationPoint(0.0F, 24.0F, 9.0F);

		left_leg_3_r1 = new ModelRenderer(this);
		left_leg_3_r1.setRotationPoint(-18.0F, -22.0F, 1.0F);
		left_leg_3.addChild(left_leg_3_r1);
		setRotationAngle(left_leg_3_r1, 0.0F, 0.0F, -0.2618F);
		left_leg_3_r1.setTextureOffset(28, 0).addBox(30.4426F, 16.9091F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_3_r2 = new ModelRenderer(this);
		left_leg_3_r2.setRotationPoint(-18.0F, -22.0F, 1.0F);
		left_leg_3.addChild(left_leg_3_r2);
		setRotationAngle(left_leg_3_r2, 0.0F, 0.0F, -0.3927F);
		left_leg_3_r2.setTextureOffset(28, 0).addBox(27.9608F, 4.2137F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_4 = new ModelRenderer(this);
		left_leg_4.setRotationPoint(0.0F, 24.0F, 17.0F);

		left_leg_4_r1 = new ModelRenderer(this);
		left_leg_4_r1.setRotationPoint(-18.0F, -18.0F, 1.0F);
		left_leg_4.addChild(left_leg_4_r1);
		setRotationAngle(left_leg_4_r1, 0.0F, 0.0F, -0.2618F);
		left_leg_4_r1.setTextureOffset(28, 0).addBox(31.4779F, 13.0454F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		left_leg_4_r2 = new ModelRenderer(this);
		left_leg_4_r2.setRotationPoint(-18.0F, -18.0F, 1.0F);
		left_leg_4.addChild(left_leg_4_r2);
		setRotationAngle(left_leg_4_r2, 0.0F, 0.0F, -0.3927F);
		left_leg_4_r2.setTextureOffset(28, 0).addBox(29.4915F, 0.5181F, -1.0F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_4 = new ModelRenderer(this);
		right_leg_4.setRotationPoint(-5.0F, 24.0F, 17.5F);
		setRotationAngle(right_leg_4, -3.1416F, -0.0436F, 3.1416F);

		right_leg_4_r1 = new ModelRenderer(this);
		right_leg_4_r1.setRotationPoint(-17.0F, -24.0F, -0.75F);
		right_leg_4.addChild(right_leg_4_r1);
		setRotationAngle(right_leg_4_r1, 0.0F, 0.0F, -0.2618F);
		right_leg_4_r1.setTextureOffset(28, 0).addBox(27.9591F, 18.5821F, 0.75F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_4_r2 = new ModelRenderer(this);
		right_leg_4_r2.setRotationPoint(-17.0F, -24.0F, -0.75F);
		right_leg_4.addChild(right_leg_4_r2);
		setRotationAngle(right_leg_4_r2, 0.0F, 0.0F, -0.3927F);
		right_leg_4_r2.setTextureOffset(28, 0).addBox(25.2715F, 5.6787F, 0.75F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_2 = new ModelRenderer(this);
		right_leg_2.setRotationPoint(-7.0F, 24.0F, 0.5F);
		setRotationAngle(right_leg_2, -3.1416F, -0.0436F, 3.1416F);

		right_leg_2_r1 = new ModelRenderer(this);
		right_leg_2_r1.setRotationPoint(-17.0F, -26.75F, -0.75F);
		right_leg_2.addChild(right_leg_2_r1);
		setRotationAngle(right_leg_2_r1, 0.0F, 0.0F, -0.2618F);
		right_leg_2_r1.setTextureOffset(28, 0).addBox(29.2473F, 21.2384F, 0.75F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_2_r2 = new ModelRenderer(this);
		right_leg_2_r2.setRotationPoint(-17.0F, -26.75F, -0.75F);
		right_leg_2.addChild(right_leg_2_r2);
		setRotationAngle(right_leg_2_r2, 0.0F, 0.0F, -0.3927F);
		right_leg_2_r2.setTextureOffset(28, 0).addBox(26.2192F, 8.2194F, 0.75F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_3 = new ModelRenderer(this);
		right_leg_3.setRotationPoint(-6.0F, 24.0F, 9.5F);
		setRotationAngle(right_leg_3, -3.1416F, -0.0436F, 3.1416F);

		right_leg_3_r1 = new ModelRenderer(this);
		right_leg_3_r1.setRotationPoint(-17.0F, -24.0F, -0.25F);
		right_leg_3.addChild(right_leg_3_r1);
		setRotationAngle(right_leg_3_r1, 0.0F, 0.0F, -0.2618F);
		right_leg_3_r1.setTextureOffset(28, 0).addBox(28.9591F, 18.5821F, 0.25F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_3_r2 = new ModelRenderer(this);
		right_leg_3_r2.setRotationPoint(-17.0F, -24.0F, -0.25F);
		right_leg_3.addChild(right_leg_3_r2);
		setRotationAngle(right_leg_3_r2, 0.0F, 0.0F, -0.3927F);
		right_leg_3_r2.setTextureOffset(28, 0).addBox(26.2715F, 5.6787F, 0.25F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_1 = new ModelRenderer(this);
		right_leg_1.setRotationPoint(-7.5F, 24.0F, -8.5F);
		setRotationAngle(right_leg_1, -3.1416F, -0.0436F, 3.1416F);

		right_leg_1_r1 = new ModelRenderer(this);
		right_leg_1_r1.setRotationPoint(-18.0F, -28.0F, -0.75F);
		right_leg_1.addChild(right_leg_1_r1);
		setRotationAngle(right_leg_1_r1, 0.0F, 0.0F, -0.2618F);
		right_leg_1_r1.setTextureOffset(28, 0).addBox(30.3897F, 22.7047F, 0.75F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		right_leg_1_r2 = new ModelRenderer(this);
		right_leg_1_r2.setRotationPoint(-18.0F, -28.0F, -0.75F);
		right_leg_1.addChild(right_leg_1_r2);
		setRotationAngle(right_leg_1_r2, 0.0F, 0.0F, -0.3927F);
		right_leg_1_r2.setTextureOffset(28, 0).addBox(27.1647F, 9.7569F, 0.75F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-6.25F, -37.0F, -10.0F, 4.0F, 3.0F, 14.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-19.0F, -35.0F, -18.0F, 28.0F, 14.0F, 27.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-21.0F, -33.0F, -17.0F, 33.0F, 7.0F, 28.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-20.25F, -34.75F, -18.0F, 31.0F, 12.0F, 30.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 17.0F, 0.0F);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.25F, -26.532F, -14.6747F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 32).addBox(-5.5F, -3.049F, -10.2848F, 11.0F, 9.0F, 11.0F, 0.0F, false);

		front_leg = new ModelRenderer(this);
		front_leg.setRotationPoint(0.0F, 24.0F, 0.0F);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_leg.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2861F, -0.4968F, -0.553F);
		cube_r5.setTextureOffset(0, 0).addBox(-27.0F, -37.0F, 4.0F, 29.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_leg.addChild(cube_r6);
		setRotationAngle(cube_r6, 2.3442F, -1.2635F, -2.3682F);
		cube_r6.setTextureOffset(0, 0).addBox(-19.5F, -24.0F, 38.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);

		front_leg2 = new ModelRenderer(this);
		front_leg2.setRotationPoint(65.0F, 24.0F, 0.0F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_leg2.addChild(cube_r7);
		setRotationAngle(cube_r7, 2.2574F, -0.6282F, -2.587F);
		cube_r7.setTextureOffset(0, 0).addBox(23.0F, -31.75F, 29.0F, 29.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_leg2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7083F, -1.2316F, -0.6795F);
		cube_r8.setTextureOffset(0, 0).addBox(-40.0F, -25.0F, 33.0F, 15.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		left_leg_1.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg_2.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg_3.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg_4.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_4.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_2.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_3.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg_1.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		front_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.left_leg_1_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg_4_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg_1_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg_4_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg_3_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_leg_3_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg_1_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_leg_3_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_leg_1_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg_4_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_leg_2_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg_3_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg_2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_leg_4_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg_2_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_leg_2_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}