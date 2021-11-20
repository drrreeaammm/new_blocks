// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmental_du_unstable_en_condition_le_frick extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer left_ear;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer jacket;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_pants;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_pants;
	private final ModelRenderer bb_main;

	public Modelmental_du_unstable_en_condition_le_frick() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-3.8F, 1.84F, -3.36F, 8.0F, 7.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(31, 1).addBox(-1.32F, 5.84F, -4.2F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 9).addBox(1.52F, 6.84F, -5.2F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(2, 0).addBox(-2.68F, 6.84F, -4.2F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, 24.0F, 0.0F);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(-5.0F, -6.0F, 0.0F);
		left_ear.setTextureOffset(51, 6).addBox(9.04F, 10.0F, -1.68F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(5.0F, -6.0F, 0.0F);
		right_ear.setTextureOffset(39, 6).addBox(-10.2F, 10.0F, -1.68F, 1.0F, 4.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-3.64F, 8.92F, -1.68F, 7.0F, 10.0F, 3.0F, 0.0F, false);

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 0.0F, 0.0F);
		jacket.setTextureOffset(16, 32).addBox(-3.68F, 8.88F, -1.64F, 7.0F, 10.0F, 3.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(32, 48).addBox(8.72F, 6.92F, -1.68F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setRotationPoint(-5.0F, 2.0F, 0.0F);
		left_sleeve.setTextureOffset(20, 8).addBox(8.68F, 6.88F, -1.64F, 3.0F, 12.0F, 3.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(42, 21).addBox(-10.36F, 6.92F, -1.68F, 2.0F, 7.0F, 3.0F, 0.0F, false);

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setRotationPoint(5.0F, 2.0F, 0.0F);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		left_leg.setTextureOffset(16, 48).addBox(2.36F, 6.0F, -1.68F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		left_pants = new ModelRenderer(this);
		left_pants.setRotationPoint(-2.0F, 12.0F, 0.0F);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
		right_leg.setTextureOffset(0, 16).addBox(-5.0F, 6.0F, -1.68F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		right_pants = new ModelRenderer(this);
		right_pants.setRotationPoint(2.0F, 12.0F, 0.0F);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(15, 20).addBox(-3.75F, -10.0F, 1.0F, 7.0F, 4.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		left_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		right_ear.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		jacket.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_sleeve.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_sleeve.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_pants.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_pants.render(matrixStack, buffer, packedLight, packedOverlay);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_ear.rotateAngleX = f2 / 20.f;
		this.left_ear.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.headwear.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.headwear.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_sleeve.rotateAngleZ = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_pants.rotateAngleX = f3 / (180F / (float) Math.PI);
		this.left_pants.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}