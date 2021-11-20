// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelpoison_plant extends EntityModel<Entity> {
	private final ModelRenderer body;

	public Modelpoison_plant() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-7.0F, 19.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(0, 17).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(8, 18).addBox(-6.0F, -7.0F, -7.0F, 12.0F, 8.0F, 11.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
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
}