// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelchlorine extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer head;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_right;

	public Modelchlorine() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.0F, 2.0F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(body_sub_1);
		body_sub_1.setTextureOffset(28, 8).addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, -6.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-3.0F, 18.0F, 7.0F);
		leg1.setTextureOffset(0, 16).addBox(4.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(3.0F, 18.0F, 7.0F);
		leg2.setTextureOffset(0, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.0F, 18.0F, -5.0F);
		leg3.setTextureOffset(0, 16).addBox(4.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.0F, 18.0F, -5.0F);
		leg4.setTextureOffset(0, 16).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(4.5F, 11.25F, 0.5F);
		wing_left.setTextureOffset(36, 0).addBox(0.5F, 1.75F, -3.5F, 7.0F, 1.0F, 7.0F, 2.0F, false);

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(-4.5F, 11.25F, 0.5F);
		wing_right.setTextureOffset(36, 0).addBox(-7.5F, 1.75F, -3.5F, 7.0F, 1.0F, 7.0F, 2.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		wing_left.render(matrixStack, buffer, packedLight, packedOverlay);
		wing_right.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.wing_left.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.wing_right.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}