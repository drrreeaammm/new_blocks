// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelmeteor extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer side;
	private final ModelRenderer side2;
	private final ModelRenderer side5;
	private final ModelRenderer side3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer side4;
	private final ModelRenderer cube_r2;

	public Modelmeteor() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-8.5F, -19.5F, -7.5F, 17.0F, 13.0F, 15.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-7.5F, -6.5F, -6.5F, 15.0F, 1.0F, 13.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-7.5F, -20.5F, -6.5F, 15.0F, 1.0F, 13.0F, 0.0F, false);

		side = new ModelRenderer(this);
		side.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(side);
		side.setTextureOffset(0, 0).addBox(10.5F, -19.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, false);
		side.setTextureOffset(0, 0).addBox(9.5F, -19.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, false);
		side.setTextureOffset(0, 0).addBox(8.5F, -19.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, false);

		side2 = new ModelRenderer(this);
		side2.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(side2);
		side2.setTextureOffset(0, 0).addBox(-11.5F, -19.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, true);
		side2.setTextureOffset(0, 0).addBox(-10.5F, -19.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, true);
		side2.setTextureOffset(0, 0).addBox(-9.5F, -19.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, true);

		side5 = new ModelRenderer(this);
		side5.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(side5);
		side5.setTextureOffset(0, 0).addBox(-11.5F, -7.5F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, true);
		side5.setTextureOffset(0, 0).addBox(-10.5F, -7.5F, -6.5F, 1.0F, 1.0F, 13.0F, 0.0F, true);
		side5.setTextureOffset(0, 0).addBox(-9.5F, -7.5F, -7.5F, 1.0F, 1.0F, 15.0F, 0.0F, true);

		side3 = new ModelRenderer(this);
		side3.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(side3);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -7.0F, 0.0F);
		side3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-8.5F, -12.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, true);
		cube_r1.setTextureOffset(0, 0).addBox(-9.5F, -12.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, true);
		cube_r1.setTextureOffset(0, 0).addBox(-10.5F, -12.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, true);

		side4 = new ModelRenderer(this);
		side4.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(side4);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -7.0F, 0.0F);
		side4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.setTextureOffset(0, 0).addBox(-8.5F, -12.5F, -7.5F, 1.0F, 13.0F, 15.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 0).addBox(-9.5F, -12.5F, -6.5F, 1.0F, 13.0F, 13.0F, 0.0F, true);
		cube_r2.setTextureOffset(0, 0).addBox(-10.5F, -12.5F, -5.5F, 1.0F, 13.0F, 11.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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