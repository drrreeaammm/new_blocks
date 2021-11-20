// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfire_fangs extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer upper_jaw;
	private final ModelRenderer upper_jaw_rotation;
	private final ModelRenderer lower_jaw;
	private final ModelRenderer lower_jaw_rotation;

	public Modelfire_fangs() {
		textureWidth = 64;
		textureHeight = 32;

		base = new ModelRenderer(this);
		base.setRotationPoint(5.0F, 12.0F, -5.0F);
		base.setTextureOffset(0, 0).addBox(-10.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F, 0.0F, false);

		upper_jaw = new ModelRenderer(this);
		upper_jaw.setRotationPoint(2.5F, -2.0F, -4.0F);

		upper_jaw_rotation = new ModelRenderer(this);
		upper_jaw_rotation.setRotationPoint(-3.0F, 7.0F, 4.0F);
		upper_jaw.addChild(upper_jaw_rotation);
		setRotationAngle(upper_jaw_rotation, 3.1416F, 3.1416F, 0.0F);
		upper_jaw_rotation.setTextureOffset(40, 0).addBox(-2.0F, -7.0F, -4.0F, 4.0F, 14.0F, 8.0F, 0.0F, false);

		lower_jaw = new ModelRenderer(this);
		lower_jaw.setRotationPoint(1.5F, -2.0F, -4.0F);

		lower_jaw_rotation = new ModelRenderer(this);
		lower_jaw_rotation.setRotationPoint(-1.0F, 7.0F, 4.0F);
		lower_jaw.addChild(lower_jaw_rotation);
		setRotationAngle(lower_jaw_rotation, 3.1416F, 0.0F, 0.0F);
		lower_jaw_rotation.setTextureOffset(40, 0).addBox(-2.0F, -7.0F, -4.0F, 4.0F, 14.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		base.render(matrixStack, buffer, packedLight, packedOverlay);
		upper_jaw.render(matrixStack, buffer, packedLight, packedOverlay);
		lower_jaw.render(matrixStack, buffer, packedLight, packedOverlay);
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