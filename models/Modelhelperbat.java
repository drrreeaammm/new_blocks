// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhelperbat extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_ear;
	private final ModelRenderer body;
	private final ModelRenderer right_wing;
	private final ModelRenderer left_wing;
	private final ModelRenderer outer_right_wing;
	private final ModelRenderer outer_left_wing;

	public Modelhelperbat() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 1.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-4.0F, -6.0F, -2.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(0.0F, 23.0F, 0.0F);
		head.addChild(right_ear);
		right_ear.setTextureOffset(24, 0).addBox(1.0F, -29.0F, -2.0F, 3.0F, 4.0F, 1.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-3.0F, 4.0F, -3.0F, 6.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 34).addBox(-5.0F, 16.0F, 0.0F, 10.0F, 16.0F, 1.0F, 0.0F, false);

		right_wing = new ModelRenderer(this);
		right_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_wing.setTextureOffset(42, 0).addBox(-12.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F, 0.0F, false);

		left_wing = new ModelRenderer(this);
		left_wing.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_wing.setTextureOffset(42, 0).addBox(2.0F, 1.0F, 1.5F, 10.0F, 16.0F, 1.0F, 0.0F, true);

		outer_right_wing = new ModelRenderer(this);
		outer_right_wing.setRotationPoint(12.0F, 1.0F, 1.5F);
		outer_right_wing.setTextureOffset(24, 16).addBox(-32.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F, 0.0F, false);

		outer_left_wing = new ModelRenderer(this);
		outer_left_wing.setRotationPoint(-12.0F, 1.0F, 1.5F);
		outer_left_wing.setTextureOffset(24, 16).addBox(24.0F, 1.0F, 0.0F, 8.0F, 12.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		outer_right_wing.render(matrixStack, buffer, packedLight, packedOverlay);
		outer_left_wing.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_wing.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_wing.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.outer_left_wing.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.outer_right_wing.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}