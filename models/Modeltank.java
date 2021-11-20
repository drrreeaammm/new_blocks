// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltank extends EntityModel<Entity> {
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg2_sub_0;
	private final ModelRenderer leg2_sub_1;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer leg4_sub_0;
	private final ModelRenderer leg4_sub_1;
	private final ModelRenderer head;

	public Modeltank() {
		textureWidth = 256;
		textureHeight = 256;

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 8.0F, -8.0F);
		jaw.setTextureOffset(84, 40).addBox(0.0F, -6.0F, -2.0F, 0.0F, 4.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 1.0F, 3.5F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		rotation.setTextureOffset(0, 0).addBox(-14.0F, -24.0F, -17.0F, 27.0F, 41.0F, 11.0F, 0.0F, false);
		rotation.setTextureOffset(0, 93).addBox(-17.0F, -25.0F, -23.0F, 12.0F, 43.0F, 11.0F, 0.0F, false);
		rotation.setTextureOffset(0, 56).addBox(-12.0F, -16.0F, -9.0F, 23.0F, 27.0F, 10.0F, 0.0F, false);
		rotation.setTextureOffset(84, 0).addBox(-10.0F, -11.0F, 1.0F, 19.0F, 19.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(131, 136).addBox(-2.0F, -3.0F, 8.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
		rotation.setTextureOffset(65, 0).addBox(4.0F, -14.0F, 3.0F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		rotation.setTextureOffset(56, 56).addBox(5.0F, -13.0F, 8.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		rotation.setTextureOffset(0, 0).addBox(5.0F, -15.0F, 16.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		rotation.setTextureOffset(66, 56).addBox(4.0F, -25.0F, -23.0F, 12.0F, 43.0F, 11.0F, 0.0F, false);
		rotation.setTextureOffset(93, 145).addBox(15.0F, -19.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(75, 145).addBox(-18.0F, -19.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(145, 71).addBox(15.0F, -11.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(144, 56).addBox(-18.0F, -11.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(142, 41).addBox(15.0F, -2.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(64, 138).addBox(-18.0F, -2.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(46, 137).addBox(15.0F, 6.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		rotation.setTextureOffset(46, 93).addBox(-18.0F, 6.0F, -21.0F, 2.0F, 7.0F, 7.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(18.0F, 30.0F, 2.5F);
		rotation.addChild(bone4);
		setRotationAngle(bone4, 0.6109F, 0.0F, 0.0F);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 14.0F, 9.5F);
		rotation.addChild(bone3);
		setRotationAngle(bone3, 0.6545F, 0.0F, 0.0F);
		bone3.setTextureOffset(112, 78).addBox(-17.0F, -50.694F, -1.8148F, 12.0F, 7.0F, 8.0F, 0.0F, false);
		bone3.setTextureOffset(46, 125).addBox(-18.0F, -49.694F, -0.8148F, 13.0F, 6.0F, 6.0F, 0.0F, false);
		bone3.setTextureOffset(112, 63).addBox(-17.0F, -16.5798F, -27.9915F, 12.0F, 7.0F, 8.0F, 0.0F, false);
		bone3.setTextureOffset(118, 124).addBox(-18.0F, -16.5798F, -26.9915F, 13.0F, 6.0F, 6.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(21.0F, 14.0F, 9.5F);
		rotation.addChild(bone5);
		setRotationAngle(bone5, 0.6545F, 0.0F, 0.0F);
		bone5.setTextureOffset(110, 48).addBox(-17.0F, -50.694F, -1.8148F, 12.0F, 7.0F, 8.0F, 0.0F, false);
		bone5.setTextureOffset(86, 118).addBox(-17.0F, -49.694F, -0.8148F, 13.0F, 6.0F, 6.0F, 0.0F, false);
		bone5.setTextureOffset(46, 110).addBox(-17.0F, -16.5798F, -27.9915F, 12.0F, 7.0F, 8.0F, 0.0F, false);
		bone5.setTextureOffset(112, 93).addBox(-17.0F, -16.5798F, -26.9915F, 13.0F, 6.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 8.0F, 20.5F);
		rotation.addChild(bone);
		setRotationAngle(bone, 0.8727F, 0.0F, 0.0F);
		bone.setTextureOffset(84, 26).addBox(-12.0F, -39.4153F, 0.6209F, 23.0F, 9.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 2.0F, -21.5F);
		rotation.addChild(bone2);
		setRotationAngle(bone2, -1.9199F, 0.0F, 0.0F);
		bone2.setTextureOffset(107, 105).addBox(-10.0F, -23.0544F, -22.3745F, 19.0F, 8.0F, 5.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(8.0F, -13.0F, 21.0F);
		leg1.setTextureOffset(136, 9).addBox(-18.0F, 30.0F, -11.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-8.0F, -13.0F, 21.0F);

		leg2_sub_0 = new ModelRenderer(this);
		leg2_sub_0.setRotationPoint(8.0F, 37.0F, -21.0F);
		leg2.addChild(leg2_sub_0);

		leg2_sub_1 = new ModelRenderer(this);
		leg2_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg2_sub_0.addChild(leg2_sub_1);
		leg2_sub_1.setTextureOffset(136, 0).addBox(1.0F, -7.0F, 10.0F, 8.0F, 1.0F, 8.0F, 0.0F, true);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(8.0F, -13.0F, -3.5F);
		leg3.setTextureOffset(135, 18).addBox(-18.0F, 30.0F, -15.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-8.0F, -13.0F, -3.5F);

		leg4_sub_0 = new ModelRenderer(this);
		leg4_sub_0.setRotationPoint(8.0F, 34.0F, 3.5F);
		leg4.addChild(leg4_sub_0);

		leg4_sub_1 = new ModelRenderer(this);
		leg4_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg4_sub_0.addChild(leg4_sub_1);
		leg4_sub_1.setTextureOffset(132, 32).addBox(1.0F, -4.0F, -18.5F, 8.0F, 1.0F, 8.0F, 0.0F, true);

		head = new ModelRenderer(this);
		head.setRotationPoint(-2.0F, -6.0F, -8.0F);
		head.setTextureOffset(105, 136).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 7.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(105, 136).addBox(-2.0F, -2.0F, -32.0F, 4.0F, 4.0F, 28.0F, 0.0F, false);
		head.setTextureOffset(105, 136).addBox(-3.0F, -3.0F, -31.0F, 6.0F, 6.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		jaw.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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
	}
}