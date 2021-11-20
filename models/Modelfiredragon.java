// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfiredragon extends EntityModel<Entity> {
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
	private final ModelRenderer front_left_leg;
	private final ModelRenderer front_left_shin;
	private final ModelRenderer front_left_foot;
	private final ModelRenderer back_left_leg;
	private final ModelRenderer back_left_shin;
	private final ModelRenderer back_left_foot;
	private final ModelRenderer front_right_leg;
	private final ModelRenderer front_right_shin;
	private final ModelRenderer front_right_foot;
	private final ModelRenderer back_right_leg;
	private final ModelRenderer back_right_shin;
	private final ModelRenderer back_right_foot;

	public Modelfiredragon() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);

		spine = new ModelRenderer(this);
		spine.setRotationPoint(0.0F, 24.0F, 0.0F);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 8.0F);
		body.setTextureOffset(0, 0).addBox(-12.0F, 0.0F, -16.0F, 24.0F, 24.0F, 64.0F, 0.0F, false);
		body.setTextureOffset(220, 53).addBox(-1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(220, 53).addBox(-1.0F, -6.0F, 10.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(220, 53).addBox(-1.0F, -6.0F, 30.0F, 2.0F, 6.0F, 12.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, 6.0F, 48.0F);
		body.addChild(tail1);
		tail1.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail1.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail1.addChild(tail2);
		tail2.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail2.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail2.addChild(tail3);
		tail3.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail3.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail4 = new ModelRenderer(this);
		tail4.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail3.addChild(tail4);
		tail4.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail4.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail5 = new ModelRenderer(this);
		tail5.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail4.addChild(tail5);
		tail5.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail5.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail6 = new ModelRenderer(this);
		tail6.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail5.addChild(tail6);
		tail6.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail6.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail7 = new ModelRenderer(this);
		tail7.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail6.addChild(tail7);
		tail7.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		tail7.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		tail8 = new ModelRenderer(this);
		tail8.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail7.addChild(tail8);
		tail8.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail8.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail9 = new ModelRenderer(this);
		tail9.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail8.addChild(tail9);
		tail9.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail9.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail10 = new ModelRenderer(this);
		tail10.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail9.addChild(tail10);
		tail10.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail10.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail11 = new ModelRenderer(this);
		tail11.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail10.addChild(tail11);
		tail11.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail11.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		tail12 = new ModelRenderer(this);
		tail12.setRotationPoint(0.0F, 0.0F, 10.0F);
		tail11.addChild(tail12);
		tail12.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, 0.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		tail12.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, 2.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		neck1 = new ModelRenderer(this);
		neck1.setRotationPoint(0.0F, 15.0F, -16.0F);
		body.addChild(neck1);
		neck1.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		neck1.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck1.addChild(neck2);
		neck2.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		neck2.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		neck3 = new ModelRenderer(this);
		neck3.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck2.addChild(neck3);
		neck3.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		neck3.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		neck4 = new ModelRenderer(this);
		neck4.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck3.addChild(neck4);
		neck4.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		neck4.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);

		neck5 = new ModelRenderer(this);
		neck5.setRotationPoint(0.0F, 0.0F, -10.0F);
		neck4.addChild(neck5);
		neck5.setTextureOffset(48, 0).addBox(-1.0F, -9.0F, -8.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		neck5.setTextureOffset(192, 104).addBox(-5.0F, -5.0F, -10.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -1.0F, -10.0F);
		neck5.addChild(head2);
		head2.setTextureOffset(176, 44).addBox(-6.0F, -1.0F, -30.0F, 12.0F, 5.0F, 16.0F, 0.0F, false);
		head2.setTextureOffset(112, 30).addBox(-8.0F, -8.0F, -16.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
		head2.setTextureOffset(0, 0).addBox(3.0F, -12.0F, -10.0F, 2.0F, 4.0F, 6.0F, 0.0F, false);
		head2.setTextureOffset(112, 0).addBox(3.0F, -3.0F, -28.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		mirror = new ModelRenderer(this);
		mirror.setRotationPoint(0.0F, 6.0F, 58.0F);
		head2.addChild(mirror);
		mirror.setTextureOffset(0, 0).addBox(-5.0F, -18.0F, -68.0F, 2.0F, 4.0F, 6.0F, 0.0F, true);
		mirror.setTextureOffset(112, 0).addBox(-5.0F, -9.0F, -86.0F, 2.0F, 2.0F, 4.0F, 0.0F, true);

		jaw2 = new ModelRenderer(this);
		jaw2.setRotationPoint(0.0F, 4.0F, -14.0F);
		head2.addChild(jaw2);
		jaw2.setTextureOffset(176, 65).addBox(-6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-12.0F, 5.0F, 2.0F);
		left_wing.setTextureOffset(112, 88).addBox(24.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, 0.0F, true);
		left_wing.setTextureOffset(-56, 88).addBox(24.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, true);

		left_wing_tip = new ModelRenderer(this);
		left_wing_tip.setRotationPoint(-68.0F, 5.0F, 2.0F);
		left_wing_tip.setTextureOffset(112, 136).addBox(136.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, 0.0F, true);
		left_wing_tip.setTextureOffset(-56, 144).addBox(136.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, true);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(12.0F, 5.0F, 2.0F);
		right_wing.setTextureOffset(-56, 88).addBox(-80.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);
		right_wing.setTextureOffset(112, 88).addBox(-80.0F, -4.0F, -4.0F, 56.0F, 8.0F, 8.0F, 0.0F, false);

		right_wing_tip = new ModelRenderer(this);
		right_wing_tip.setRotationPoint(68.0F, 5.0F, 2.0F);
		right_wing_tip.setTextureOffset(-56, 144).addBox(-192.0F, 0.0F, 2.0F, 56.0F, 0.0F, 56.0F, 0.0F, false);
		right_wing_tip.setTextureOffset(112, 136).addBox(-192.0F, -2.0F, -2.0F, 56.0F, 4.0F, 4.0F, 0.0F, false);

		front_left_leg = new ModelRenderer(this);
		front_left_leg.setRotationPoint(-12.0F, 20.0F, 2.0F);
		front_left_leg.setTextureOffset(112, 104).addBox(20.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		front_left_shin = new ModelRenderer(this);
		front_left_shin.setRotationPoint(-12.0F, 41.0F, 2.0F);
		front_left_shin.setTextureOffset(226, 138).addBox(21.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);

		front_left_foot = new ModelRenderer(this);
		front_left_foot.setRotationPoint(-11.0F, 64.0F, 2.0F);
		front_left_foot.setTextureOffset(144, 104).addBox(19.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, 0.0F, false);

		back_left_leg = new ModelRenderer(this);
		back_left_leg.setRotationPoint(-16.0F, 16.0F, 42.0F);
		back_left_leg.setTextureOffset(0, 0).addBox(24.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);

		back_left_shin = new ModelRenderer(this);
		back_left_shin.setRotationPoint(-16.0F, 46.0F, 36.0F);
		back_left_shin.setTextureOffset(196, 0).addBox(26.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, 0.0F, false);

		back_left_foot = new ModelRenderer(this);
		back_left_foot.setRotationPoint(-16.0F, 76.0F, 44.0F);
		back_left_foot.setTextureOffset(112, 0).addBox(23.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, 0.0F, false);

		front_right_leg = new ModelRenderer(this);
		front_right_leg.setRotationPoint(12.0F, 20.0F, 2.0F);
		front_right_leg.setTextureOffset(112, 104).addBox(-28.0F, -4.0F, -4.0F, 8.0F, 24.0F, 8.0F, 0.0F, false);

		front_right_shin = new ModelRenderer(this);
		front_right_shin.setRotationPoint(12.0F, 41.0F, 2.0F);
		front_right_shin.setTextureOffset(226, 138).addBox(-27.0F, -1.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);

		front_right_foot = new ModelRenderer(this);
		front_right_foot.setRotationPoint(12.0F, 64.0F, 2.0F);
		front_right_foot.setTextureOffset(144, 104).addBox(-28.0F, 0.0F, -12.0F, 8.0F, 4.0F, 16.0F, 0.0F, false);

		back_right_leg = new ModelRenderer(this);
		back_right_leg.setRotationPoint(16.0F, 16.0F, 42.0F);
		back_right_leg.setTextureOffset(0, 0).addBox(-40.0F, -4.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);

		back_right_shin = new ModelRenderer(this);
		back_right_shin.setRotationPoint(16.0F, 46.0F, 36.0F);
		back_right_shin.setTextureOffset(196, 0).addBox(-38.0F, -2.0F, 0.0F, 12.0F, 32.0F, 12.0F, 0.0F, false);

		back_right_foot = new ModelRenderer(this);
		back_right_foot.setRotationPoint(16.0F, 76.0F, 44.0F);
		back_right_foot.setTextureOffset(112, 0).addBox(-41.0F, 0.0F, -20.0F, 18.0F, 6.0F, 24.0F, 0.0F, false);
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
		front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_shin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right_foot.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.tail11.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail11.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail12.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail12.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail10.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail10.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.jaw.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.jaw.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.spine.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.spine.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail2.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail2.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail3.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail3.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail4.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail4.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail5.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail5.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail6.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail6.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail7.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail7.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail8.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail8.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.tail9.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.tail9.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}