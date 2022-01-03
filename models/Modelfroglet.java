// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfroglet extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelfroglet() {
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(body, -0.1745F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-1.5F, -2.75F, -4.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 11).addBox(-1.5F, -2.75F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 23.0F, 1.5F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, -1.0F, -0.5F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, 0.0873F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(0, -1).addBox(0.0F, -0.4583F, 0.0882F, 0.0F, 2.0F, 7.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.75F, 24.0F, -0.5F);
		setRotationAngle(left_leg, 0.0F, -0.0436F, 0.0F);
		left_leg.setTextureOffset(4, 8).addBox(-1.3971F, -0.1F, -0.8691F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 14).addBox(-0.3971F, -1.1F, 0.1309F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-0.75F, 24.0F, -0.5F);
		setRotationAngle(right_leg, 0.0F, -0.0436F, 0.0F);
		right_leg.setTextureOffset(4, 8).addBox(-1.3971F, -0.1F, -0.8691F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(12, 14).addBox(-0.3971F, -1.1F, 0.1309F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}