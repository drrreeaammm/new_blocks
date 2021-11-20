// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelblob extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer bodytwo;
	private final ModelRenderer bodytwo2;
	private final ModelRenderer head;

	public Modelblob() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(56, 108).addBox(-9.0F, -2.0F, -9.0F, 18.0F, 2.0F, 18.0F, 0.0F, false);

		bodytwo = new ModelRenderer(this);
		bodytwo.setRotationPoint(0.0F, 24.0F, 0.0F);
		bodytwo.setTextureOffset(94, 111).addBox(-10.0F, -1.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		bodytwo.setTextureOffset(84, 45).addBox(-11.0F, -1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		bodytwo.setTextureOffset(90, 81).addBox(-12.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		bodytwo2 = new ModelRenderer(this);
		bodytwo2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bodytwo2.setTextureOffset(87, 98).addBox(9.0F, -1.0F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
		bodytwo2.setTextureOffset(52, 106).addBox(10.0F, -1.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		bodytwo2.setTextureOffset(0, 108).addBox(11.0F, -1.0F, -6.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);
		bodytwo2.setTextureOffset(0, 97).addBox(-7.0F, -3.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bodytwo2.setTextureOffset(0, 64).addBox(-6.0F, -4.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bodytwo2.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.setTextureOffset(0, 42).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 4.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		bodytwo.render(matrixStack, buffer, packedLight, packedOverlay);
		bodytwo2.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}