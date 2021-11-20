// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcreature_of_the_night_skies extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;
	private final ModelRenderer tail;

	public Modelcreature_of_the_night_skies() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, 19.0F, 0.0F);
		body.setTextureOffset(0, 8).addBox(-2.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.5F, 20.25F, -8.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -2.25F, -5.0F, 7.0F, 3.0F, 5.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-2.5F, 17.0F, -8.0F);
		left_wing.setTextureOffset(23, 12).addBox(5.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
		left_wing.setTextureOffset(16, 24).addBox(11.0F, 0.0F, 0.0F, 15.0F, 1.0F, 9.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(2.5F, 17.0F, -8.0F);
		right_wing.setTextureOffset(23, 12).addBox(-11.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F, 0.0F, true);
		right_wing.setTextureOffset(16, 24).addBox(-26.0F, 0.0F, 0.0F, 15.0F, 1.0F, 9.0F, 0.0F, true);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-0.5F, 17.0F, 1.0F);
		tail.setTextureOffset(3, 20).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		tail.setTextureOffset(4, 29).addBox(0.0F, 0.5F, 6.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_wing.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_wing.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}