// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelnuke extends EntityModel<Entity> {
	private final ModelRenderer nuke;
	private final ModelRenderer nuke_r1;

	public Modelnuke() {
		textureWidth = 64;
		textureHeight = 64;

		nuke = new ModelRenderer(this);
		nuke.setRotationPoint(0.0F, -18.0F, 0.0F);
		setRotationAngle(nuke, 3.1416F, 0.0F, 0.0F);
		nuke.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, 3.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
		nuke.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, -4.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
		nuke.setTextureOffset(0, 34).addBox(-3.5F, -28.0F, -3.5F, 7.0F, 23.0F, 7.0F, 0.5F, false);
		nuke.setTextureOffset(15, 44).addBox(-0.5F, -39.0F, -0.5F, 1.0F, 11.0F, 1.0F, 0.5F, false);
		nuke.setTextureOffset(8, 46).addBox(-1.5F, -34.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.5F, false);
		nuke.setTextureOffset(3, 54).addBox(-1.5F, -25.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.5F, false);
		nuke.setTextureOffset(5, 49).addBox(-2.5F, -30.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.5F, false);
		nuke.setTextureOffset(0, 0).addBox(-4.5F, -5.0F, 2.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);
		nuke.setTextureOffset(0, 0).addBox(2.5F, -5.0F, 2.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);
		nuke.setTextureOffset(0, 0).addBox(-4.5F, -5.0F, -4.5F, 2.0F, 5.0F, 2.0F, 0.5F, true);
		nuke.setTextureOffset(0, 0).addBox(2.5F, -5.0F, -4.5F, 2.0F, 5.0F, 2.0F, 0.5F, false);

		nuke_r1 = new ModelRenderer(this);
		nuke_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		nuke.addChild(nuke_r1);
		setRotationAngle(nuke_r1, 0.0F, -1.5708F, 0.0F);
		nuke_r1.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, 3.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
		nuke_r1.setTextureOffset(50, 41).addBox(-3.0F, -27.5F, -4.0F, 6.0F, 22.0F, 1.0F, 0.5F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		nuke.render(matrixStack, buffer, packedLight, packedOverlay);
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