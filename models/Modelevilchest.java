// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelevilchest extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer base_rotation;
	private final ModelRenderer knob;
	private final ModelRenderer knob_rotation;
	private final ModelRenderer lid;
	private final ModelRenderer lid_rotation;

	public Modelevilchest() {
		textureWidth = 64;
		textureHeight = 64;

		base = new ModelRenderer(this);
		base.setRotationPoint(8.0F, 10.0F, -8.0F);

		base_rotation = new ModelRenderer(this);
		base_rotation.setRotationPoint(-8.0F, 7.0F, 8.0F);
		base.addChild(base_rotation);
		setRotationAngle(base_rotation, 3.1416F, 0.0F, 0.0F);
		base_rotation.setTextureOffset(0, 19).addBox(-7.0F, -7.0F, -7.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);

		knob = new ModelRenderer(this);
		knob.setRotationPoint(8.0F, 18.0F, -8.0F);

		knob_rotation = new ModelRenderer(this);
		knob_rotation.setRotationPoint(-8.0F, -1.0F, 8.0F);
		knob.addChild(knob_rotation);
		setRotationAngle(knob_rotation, 3.1416F, 0.0F, 0.0F);
		knob_rotation.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 7.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		lid = new ModelRenderer(this);
		lid.setRotationPoint(8.0F, 19.0F, -7.0F);

		lid_rotation = new ModelRenderer(this);
		lid_rotation.setRotationPoint(-8.0F, -2.0F, 7.0F);
		lid.addChild(lid_rotation);
		setRotationAngle(lid_rotation, 3.1416F, 0.0F, 0.0F);
		lid_rotation.setTextureOffset(0, 0).addBox(-7.0F, 2.0F, -7.0F, 14.0F, 5.0F, 14.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		base.render(matrixStack, buffer, packedLight, packedOverlay);
		knob.render(matrixStack, buffer, packedLight, packedOverlay);
		lid.render(matrixStack, buffer, packedLight, packedOverlay);
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