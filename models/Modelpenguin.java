// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpenguin extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_wing;

	public Modelpenguin() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -4.0F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -13.0F, -1.0F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(50, 0).addBox(-2.0F, -10.0F, -4.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 16.0F, 0.0F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
		rotation.setTextureOffset(38, 22).addBox(-2.0F, -5.0F, -2.0F, 4.0F, 1.0F, 9.0F, 0.0F, false);
		rotation.setTextureOffset(0, 9).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 5.0F, 11.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 19.0F, 1.0F);
		right_leg.setTextureOffset(0, 27).addBox(-4.5F, 0.0F, -7.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-1.0F, 19.0F, 1.0F);
		left_leg.setTextureOffset(0, 27).addBox(1.5F, 0.0F, -7.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(4.0F, 13.0F, 0.0F);
		right_wing.setTextureOffset(0, 0).addBox(-8.0F, -4.0F, -3.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(11.0F, 13.0F, -3.0F);
		setRotationAngle(left_wing, -3.1416F, 0.0F, 3.1416F);
		left_wing.setTextureOffset(0, 0).addBox(7.0F, -4.0F, -3.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}