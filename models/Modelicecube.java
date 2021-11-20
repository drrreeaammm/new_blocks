// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelicecube extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer balls;
	private final ModelRenderer snowballs;
	private final ModelRenderer horizontal;
	private final ModelRenderer horizontal1;
	private final ModelRenderer horizontal2;
	private final ModelRenderer horizontal3;
	private final ModelRenderer horizontal4;
	private final ModelRenderer vertical;
	private final ModelRenderer vertical1;
	private final ModelRenderer vertical2;
	private final ModelRenderer vertical3;
	private final ModelRenderer vertical4;
	private final ModelRenderer snowblock;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;

	public Modelicecube() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);

		balls = new ModelRenderer(this);
		balls.setRotationPoint(0.0F, 8.0F, 0.0F);
		body.addChild(balls);

		snowballs = new ModelRenderer(this);
		snowballs.setRotationPoint(0.0F, 0.0F, 0.0F);
		balls.addChild(snowballs);

		horizontal = new ModelRenderer(this);
		horizontal.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowballs.addChild(horizontal);

		horizontal1 = new ModelRenderer(this);
		horizontal1.setRotationPoint(0.0F, 0.0F, 0.0F);
		horizontal.addChild(horizontal1);

		horizontal2 = new ModelRenderer(this);
		horizontal2.setRotationPoint(0.0F, 0.0F, 0.0F);
		horizontal.addChild(horizontal2);
		setRotationAngle(horizontal2, 0.0F, 1.5708F, 0.0F);

		horizontal3 = new ModelRenderer(this);
		horizontal3.setRotationPoint(0.0F, 0.0F, 0.0F);
		horizontal.addChild(horizontal3);
		setRotationAngle(horizontal3, 0.0F, 3.1416F, 0.0F);

		horizontal4 = new ModelRenderer(this);
		horizontal4.setRotationPoint(0.0F, 0.0F, 0.0F);
		horizontal.addChild(horizontal4);
		setRotationAngle(horizontal4, 0.0F, -1.5708F, 0.0F);

		vertical = new ModelRenderer(this);
		vertical.setRotationPoint(0.0F, 0.0F, 0.0F);
		snowballs.addChild(vertical);

		vertical1 = new ModelRenderer(this);
		vertical1.setRotationPoint(0.0F, 0.0F, 0.0F);
		vertical.addChild(vertical1);

		vertical2 = new ModelRenderer(this);
		vertical2.setRotationPoint(0.0F, 0.0F, 0.0F);
		vertical.addChild(vertical2);
		setRotationAngle(vertical2, -1.5708F, 0.0F, 0.0F);

		vertical3 = new ModelRenderer(this);
		vertical3.setRotationPoint(0.0F, 0.0F, 0.0F);
		vertical.addChild(vertical3);
		setRotationAngle(vertical3, 3.1416F, 0.0F, 0.0F);

		vertical4 = new ModelRenderer(this);
		vertical4.setRotationPoint(0.0F, 0.0F, 0.0F);
		vertical.addChild(vertical4);
		setRotationAngle(vertical4, 1.5708F, 0.0F, 0.0F);

		snowblock = new ModelRenderer(this);
		snowblock.setRotationPoint(0.0F, 8.0F, 0.0F);
		body.addChild(snowblock);
		snowblock.setTextureOffset(0, 64).addBox(-16.0F, -16.0F, -16.0F, 32.0F, 32.0F, 32.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.9F, 12.0F, 0.0F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 12.0F, 0.0F);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.0F, 0.0F, 2.0F);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(0.0F, 0.0F, 2.0F);

	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}