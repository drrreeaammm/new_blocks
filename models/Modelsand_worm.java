// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsand_worm extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer head;

	public Modelsand_worm() {
		textureWidth = 128;
		textureHeight = 168;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-10.5F, -21.5F, 8.0F, 21.0F, 21.0F, 17.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-10.0F, -20.5F, 25.0F, 20.0F, 20.0F, 17.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-9.5F, -19.5F, 42.0F, 19.0F, 19.0F, 17.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.75F, -18.5F, 59.0F, 18.0F, 18.0F, 17.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.2618F, 0.0F);
		body_r1.setTextureOffset(0, 0).addBox(-27.25F, -14.5F, 82.25F, 16.0F, 14.0F, 15.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 0).addBox(-28.25F, -16.5F, 71.25F, 18.0F, 16.0F, 15.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(-1.0F, 10.75F, 8.25F);
		head.setTextureOffset(0, 101).addBox(-11.0F, -9.75F, -17.25F, 24.0F, 23.0F, 17.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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
	}
}