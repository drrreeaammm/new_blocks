// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgiraffe extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_rotation;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer chest_left;
	private final ModelRenderer chest_left_rotation;
	private final ModelRenderer chest_right;
	private final ModelRenderer chest_right_rotation;

	public Modelgiraffe() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 7.0F, -6.0F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -23.0F, -10.0F, 4.0F, 4.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 14).addBox(-4.0F, -27.0F, -6.0F, 8.0F, 29.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(17, 0).addBox(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(17, 0).addBox(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 5.0F, 2.0F);

		body_rotation = new ModelRenderer(this);
		body_rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_rotation);
		setRotationAngle(body_rotation, 1.5708F, 0.0F, 0.0F);
		body_rotation.setTextureOffset(29, 0).addBox(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(3.5F, 10.0F, 6.0F);
		leg1.setTextureOffset(29, 29).addBox(-9.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-3.5F, 10.0F, 6.0F);
		leg2.setTextureOffset(29, 29).addBox(5.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(3.5F, 10.0F, -5.0F);
		leg3.setTextureOffset(29, 29).addBox(-9.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-3.5F, 10.0F, -5.0F);
		leg4.setTextureOffset(29, 29).addBox(5.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		chest_left = new ModelRenderer(this);
		chest_left.setRotationPoint(-8.5F, 3.0F, 3.0F);

		chest_left_rotation = new ModelRenderer(this);
		chest_left_rotation.setRotationPoint(15.5F, 4.0F, 1.5F);
		chest_left.addChild(chest_left_rotation);
		setRotationAngle(chest_left_rotation, 0.0F, 1.5708F, 0.0F);

		chest_right = new ModelRenderer(this);
		chest_right.setRotationPoint(10.5F, 3.0F, -2.0F);

		chest_right_rotation = new ModelRenderer(this);
		chest_right_rotation.setRotationPoint(-17.5F, 4.0F, 1.5F);
		chest_right.addChild(chest_right_rotation);
		setRotationAngle(chest_right_rotation, 0.0F, 1.5708F, 0.0F);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		chest_left.render(matrixStack, buffer, packedLight, packedOverlay);
		chest_right.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}