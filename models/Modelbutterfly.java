// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbutterfly extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer left_wing;
	private final ModelRenderer right_wing;
	private final ModelRenderer middle_legs;
	private final ModelRenderer back_legs;
	private final ModelRenderer left_antenna;
	private final ModelRenderer stinger;
	private final ModelRenderer right_antenna;
	private final ModelRenderer torso;

	public Modelbutterfly() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(-1.5F, 23.5F, 0.0F);
		left_wing.setTextureOffset(0, 18).addBox(3.0F, 0.0F, -3.0F, 9.0F, 0.0F, 6.0F, 0.0F, true);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(1.5F, 23.5F, 0.0F);
		right_wing.setTextureOffset(0, 18).addBox(-12.0F, 0.0F, -3.0F, 9.0F, 0.0F, 6.0F, 0.0F, false);

		middle_legs = new ModelRenderer(this);
		middle_legs.setRotationPoint(-1.5F, 22.0F, 0.0F);

		back_legs = new ModelRenderer(this);
		back_legs.setRotationPoint(-1.5F, 22.0F, 2.0F);

		left_antenna = new ModelRenderer(this);
		left_antenna.setRotationPoint(0.0F, 17.0F, -5.0F);

		stinger = new ModelRenderer(this);
		stinger.setRotationPoint(0.0F, 19.0F, 0.0F);

		right_antenna = new ModelRenderer(this);
		right_antenna.setRotationPoint(0.0F, 17.0F, -5.0F);

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 23.5F, 0.0F);
		torso.setTextureOffset(0, 0).addBox(-3.5F, 0.0F, -5.0F, 7.0F, 0.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		middle_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		back_legs.render(matrixStack, buffer, packedLight, packedOverlay);
		left_antenna.render(matrixStack, buffer, packedLight, packedOverlay);
		stinger.render(matrixStack, buffer, packedLight, packedOverlay);
		right_antenna.render(matrixStack, buffer, packedLight, packedOverlay);
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}