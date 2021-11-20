// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgrizzly_bear extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rotation;
	private final ModelRenderer body_sub_1;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public Modelgrizzly_bear() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 10.0F, -16.0F);
		head.setTextureOffset(0, 0).addBox(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 44).addBox(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(26, 0).addBox(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 0).addBox(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, 9.0F, 12.0F);

		rotation = new ModelRenderer(this);
		rotation.setRotationPoint(-2.0F, 0.0F, 0.0F);
		body.addChild(rotation);
		setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);

		body_sub_1 = new ModelRenderer(this);
		body_sub_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rotation.addChild(body_sub_1);
		body_sub_1.setTextureOffset(0, 19).addBox(-7.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F, false);
		body_sub_1.setTextureOffset(39, 0).addBox(-6.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F, false);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(-4.5F, 14.0F, 6.0F);
		leg1.setTextureOffset(50, 22).addBox(7.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(4.5F, 14.0F, 6.0F);
		leg2.setTextureOffset(50, 22).addBox(-11.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F, false);

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(-3.5F, 14.0F, -8.0F);
		leg3.setTextureOffset(50, 40).addBox(5.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F, false);

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(3.5F, 14.0F, -8.0F);
		leg4.setTextureOffset(50, 40).addBox(-9.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F, false);
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
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}