// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfire_dragon extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer spine;
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer tail4;
	private final ModelRenderer tail5;
	private final ModelRenderer tail6;
	private final ModelRenderer tail7;
	private final ModelRenderer tail8;
	private final ModelRenderer tail9;
	private final ModelRenderer tail10;
	private final ModelRenderer tail11;
	private final ModelRenderer tail12;
	private final ModelRenderer neck1;
	private final ModelRenderer neck2;
	private final ModelRenderer neck3;
	private final ModelRenderer neck4;
	private final ModelRenderer neck5;
	private final ModelRenderer head2;
	private final ModelRenderer mirror;
	private final ModelRenderer jaw2;
	private final ModelRenderer left_wing;
	private final ModelRenderer left_wing_tip;
	private final ModelRenderer right_wing;
	private final ModelRenderer right_wing_tip;
	private final ModelRenderer right_front_leg;
	private final ModelRenderer left_front_leg;
	private final ModelRenderer left_back_leg;
	private final ModelRenderer left_back_leg2;

	public Modelfire_dragon() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);

		spine = new ModelRenderer(this);
		spine.setRotationPoint(0.0F, 24.0F, 0.0F);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -3.0F, 8.0F);
		setRotationAngle(body, -0.0436F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-12.0F, -31.4886F, -16.5234F, 24.0F, 24.0F, 64.0F, 0.0F, false);
		body.setTextureOffset(220, 53).addBox(-1.0F, -21.9886F, -10.5234F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(220, 53).addBox(-1.0F, -21.9886F, 9.4766F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(220, 53).addBox(-1.0F, -21.9886F, 29.4766F, 2.0F, 6.0F, 12.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 2.5F, 26.0F);
		body.addChild(tail1);
		setRotationAngle(tail1, -0.0873F, 0.0F, 0.0F);
		tail1.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail1.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail1.addChild(tail2);
		tail2.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail2.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail2.addChild(tail3);
		tail3.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail3.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail3.addChild(tail4);
		tail4.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail4.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail4.addChild(tail5);
		tail5.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail5.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail6 = new ModelRenderer(this);
		tail6.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail5.addChild(tail6);
		tail6.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail6.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail7 = new ModelRenderer(this);
		tail7.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail6.addChild(tail7);
		tail7.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		tail7.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		tail8 = new ModelRenderer(this);
		tail8.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail7.addChild(tail8);
		tail8.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail8.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail9 = new ModelRenderer(this);
		tail9.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail8.addChild(tail9);
		tail9.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail9.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail10 = new ModelRenderer(this);
		tail10.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail9.addChild(tail10);
		tail10.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail10.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail11 = new ModelRenderer(this);
		tail11.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail10.addChild(tail11);
		tail11.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail11.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail12 = new ModelRenderer(this);
		tail12.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail11.addChild(tail12);
		tail12.setTextureOffset(192, 104).addBox(-5.25F, -27.8907F, -1.8717F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail12.setTextureOffset(48, 0).addBox(-1.25F, -31.8907F, 0.1283F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		neck1 = new ModelRenderer(this);
		neck1.setRotationPoint(0.0F, 15.0F, -16.0F);
		body.addChild(neck1);

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, -17.0F, 38.25F);
		neck1.addChild(neck2);
		setRotationAngle(neck2, 0.1309F, 0.0F, 0.0F);

		neck3 = new ModelRenderer(this);
		neck3.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck2.addChild(neck3);

		neck4 = new ModelRenderer(this);
		neck4.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck3.addChild(neck4);

		neck5 = new ModelRenderer(this);
		neck5.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck4.addChild(neck5);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -1.0F, -10.0F);
		neck5.addChild(head2);
		head2.setTextureOffset(176, 44).addBox(-6.25F, -23.9819F, -30.8288F, 12.0F, 5.0F, 16.0F, 0.0F, false);
		head2.setTextureOffset(112, 30).addBox(-8.25F, -30.9819F, -16.8288F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(2.75F, -34.9819F, -10.8288F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		head2.setTextureOffset(112, 0).addBox(2.75F, -25.9819F, -28.8288F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		mirror = new ModelRenderer(this);
		mirror.setRotationPoint(0.0F, 6.0F, 58.0F);
		head2.addChild(mirror);
		mirror.setTextureOffset(0, 0).addBox(-5.25F, -40.9819F, -68.8288F, 2.0F, 4.0F, 6.0F, 0.0F, true);
		mirror.setTextureOffset(112, 0).addBox(-5.25F, -31.9819F, -86.8288F, 2.0F, 2.0F, 4.0F, 0.0F, true);

		jaw2 = new ModelRenderer(this);
		jaw2.setRotationPoint(0.0F, 4.0F, -14.0F);
		head2.addChild(jaw2);
		jaw2.setTextureOffset(176, 65).addBox(-6.25F, -22.9819F, -16.8288F, 12.0F, 4.0F, 16.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-12.0F, -25.0F, 8.0F);
		left_wing.setTextureOffset(112, 88).addBox(24.0F, -3.5F, -4.75F, 56.0F, 8.0F, 8.0F, 0.0F, true);
		left_wing.setTextureOffset(-56, 88).addBox(24.0F, 0.5F, 1.25F, 56.0F, 0.0F, 56.0F, 0.0F, true);

		left_wing_tip = new ModelRenderer(this);
		left_wing_tip.setRotationPoint(-12.0F, -25.0F, 8.0F);
		left_wing_tip.setTextureOffset(112, 136).addBox(80.0F, -1.5F, -2.75F, 56.0F, 4.0F, 4.0F, 0.0F, true);
		left_wing_tip.setTextureOffset(-56, 144).addBox(80.0F, 0.5F, 1.25F, 56.0F, 0.0F, 56.0F, 0.0F, true);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(12.0F, -25.0F, 8.0F);
		right_wing.setTextureOffset(-56, 88).addBox(-80.0F, 0.5F, 1.25F, 56.0F, 0.0F, 56.0F, 0.0F, false);
		right_wing.setTextureOffset(112, 88).addBox(-80.0F, -3.5F, -4.75F, 56.0F, 8.0F, 8.0F, 0.0F, false);

		right_wing_tip = new ModelRenderer(this);
		right_wing_tip.setRotationPoint(12.0F, -25.0F, 8.0F);
		right_wing_tip.setTextureOffset(-56, 144).addBox(-136.0F, 0.5F, 1.25F, 56.0F, 0.0F, 56.0F, 0.0F, false);
		right_wing_tip.setTextureOffset(112, 136).addBox(-136.0F, -1.5F, -2.75F, 56.0F, 4.0F, 4.0F, 0.0F, false);

		right_front_leg = new ModelRenderer(this);
		right_front_leg.setRotationPoint(9.0F, -12.0F, 4.0F);
		setRotationAngle(right_front_leg, 0.0873F, 0.0F, 0.0F);
		right_front_leg.setTextureOffset(64, 60).addBox(-20.0F, -5.3334F, -3.6362F, 7.0F, 20.0F, 8.0F, 0.0F, false);
		right_front_leg.setTextureOffset(64, 60).addBox(-19.5F, 14.1666F, -3.1362F, 6.0F, 14.0F, 7.0F, 0.0F, false);
		right_front_leg.setTextureOffset(64, 60).addBox(-20.5F, 28.1666F, -13.8862F, 8.0F, 8.0F, 18.0F, 0.0F, false);

		left_front_leg = new ModelRenderer(this);
		left_front_leg.setRotationPoint(-9.0F, -12.0F, 4.0F);
		setRotationAngle(left_front_leg, 0.0873F, 0.0F, 0.0F);
		left_front_leg.setTextureOffset(64, 60).addBox(13.0F, -5.3334F, -3.6362F, 7.0F, 20.0F, 8.0F, 0.0F, false);
		left_front_leg.setTextureOffset(64, 60).addBox(13.5F, 14.1666F, -3.1362F, 6.0F, 14.0F, 7.0F, 0.0F, false);
		left_front_leg.setTextureOffset(64, 60).addBox(12.5F, 28.1666F, -13.8862F, 8.0F, 8.0F, 18.0F, 0.0F, false);

		left_back_leg = new ModelRenderer(this);
		left_back_leg.setRotationPoint(-9.0F, -12.0F, 45.0F);
		setRotationAngle(left_back_leg, 0.0873F, 0.0F, 0.0F);
		left_back_leg.setTextureOffset(65, 55).addBox(12.6F, -6.1601F, -3.927F, 8.0F, 22.0F, 9.0F, 0.0F, false);
		left_back_leg.setTextureOffset(64, 60).addBox(13.56F, 15.4199F, -3.387F, 6.0F, 15.0F, 8.0F, 0.0F, false);
		left_back_leg.setTextureOffset(32, 18).addBox(12.14F, 30.0599F, -13.997F, 9.0F, 9.0F, 19.0F, 0.0F, false);

		left_back_leg2 = new ModelRenderer(this);
		left_back_leg2.setRotationPoint(9.0F, -12.0F, 45.0F);
		setRotationAngle(left_back_leg2, 0.0873F, 0.0F, 0.0F);
		left_back_leg2.setTextureOffset(65, 55).addBox(-20.4F, -6.1601F, -3.927F, 8.0F, 22.0F, 9.0F, 0.0F, false);
		left_back_leg2.setTextureOffset(64, 60).addBox(-19.44F, 15.4199F, -3.387F, 6.0F, 15.0F, 8.0F, 0.0F, false);
		left_back_leg2.setTextureOffset(32, 18).addBox(-20.86F, 30.0599F, -13.997F, 9.0F, 9.0F, 19.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		spine.render(matrixStack, buffer, packedLight, packedOverlay);
		jaw.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing_tip.render(matrixStack, buffer, packedLight, packedOverlay);
		right_front_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_front_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_back_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_back_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_front_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.left_front_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_wing_tip.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_wing_tip.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.left_back_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_back_leg2.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}