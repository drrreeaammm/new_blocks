// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcyclops extends EntityModel<Entity> {
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;

	public Modelcyclops() {
		textureWidth = 164;
		textureHeight = 232;

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(14.5F, -7.0F, -0.75F);
		right_leg.setTextureOffset(0, 88).addBox(-33.5F, -3.0F, -3.25F, 10.0F, 34.0F, 10.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 116).addBox(-33.5F, 25.0F, -13.25F, 10.0F, 6.0F, 10.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-14.5F, -7.0F, 0.75F);
		left_leg.setTextureOffset(0, 88).addBox(23.5F, -3.0F, -4.75F, 10.0F, 34.0F, 10.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 116).addBox(23.5F, 25.0F, -14.75F, 10.0F, 6.0F, 10.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -64.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-19.0F, -2.0F, -6.0F, 38.0F, 56.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(0, 158).addBox(-19.0F, -3.0F, -11.0F, 38.0F, 58.0F, 23.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -64.0F, 0.0F);
		head.setTextureOffset(56, 93).addBox(-11.0F, -24.0F, -8.0F, 21.0F, 22.0F, 17.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(19.25F, -65.0F, -1.25F);
		right_arm.setTextureOffset(108, 0).addBox(-53.25F, 2.0F, -4.25F, 15.0F, 57.0F, 13.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-19.25F, -65.0F, 1.25F);
		left_arm.setTextureOffset(108, 0).addBox(38.25F, 2.0F, -6.75F, 15.0F, 57.0F, 13.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}