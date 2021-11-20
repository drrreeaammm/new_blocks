// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelevil_rock extends EntityModel<Entity> {
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public Modelevil_rock() {
		textureWidth = 64;
		textureHeight = 64;

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		left_leg.setTextureOffset(44, 42).addBox(3.0F, -13.0F, 0.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_leg.setTextureOffset(32, 29).addBox(-7.0F, -13.0F, 0.0F, 4.0F, 13.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-7.0F, -30.0F, 0.0F, 14.0F, 17.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -24.25F, -1.25F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.0436F);
		cube_r1.setTextureOffset(22, 5).addBox(-2.0578F, -1.7731F, -0.75F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(4.0F, -20.25F, -0.5F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2863F, -0.2826F, -0.1252F);
		cube_r2.setTextureOffset(23, 5).addBox(-1.0995F, -0.5581F, -0.3351F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.75F, -18.0F, -1.25F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3054F);
		cube_r3.setTextureOffset(23, 7).addBox(-1.0571F, -1.2614F, -0.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.5F, -20.0F, -7.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.2182F);
		cube_r4.setTextureOffset(27, 5).addBox(1.7221F, 0.5519F, 6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.75F, -18.25F, -1.0F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.2182F);
		cube_r5.setTextureOffset(23, 5).addBox(-1.4126F, -1.2107F, 0.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(32, 15).addBox(-4.0F, -38.0F, -1.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(24, 6).addBox(-3.0F, -42.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 6).addBox(1.0F, -42.0F, 0.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 7).addBox(-4.0F, -43.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 7).addBox(3.0F, -43.0F, 0.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_arm.setTextureOffset(16, 21).addBox(-11.0F, -29.0F, 0.0F, 4.0F, 22.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(23, 5).addBox(-11.0F, -30.0F, 0.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-10.75F, -31.75F, 1.75F);
		right_arm.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.6109F);
		cube_r6.setTextureOffset(23, 5).addBox(-0.4052F, -1.326F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-9.5F, -30.25F, 2.0F);
		right_arm.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3054F);
		cube_r7.setTextureOffset(24, 7).addBox(-1.036F, -1.2934F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		left_arm.setTextureOffset(0, 21).addBox(7.0F, -29.0F, 0.0F, 4.0F, 22.0F, 4.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(10.0F, -31.5F, 1.75F);
		left_arm.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
		cube_r8.setTextureOffset(23, 6).addBox(-0.6233F, 0.0205F, -0.75F, 1.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(9.0F, -29.25F, 2.25F);
		left_arm.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.1309F);
		cube_r9.setTextureOffset(5, 27).addBox(-1.1051F, -1.0755F, -1.75F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(11.5F, -29.25F, 1.75F);
		left_arm.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.2618F);
		cube_r10.setTextureOffset(4, 27).addBox(-1.5377F, -0.7703F, -1.25F, 2.0F, 4.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.cube_r10.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.cube_r6.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.cube_r7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.cube_r8.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.cube_r9.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}