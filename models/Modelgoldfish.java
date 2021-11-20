// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgoldfish extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer right_fin;
	private final ModelRenderer left_fin;
	private final ModelRenderer head;
	private final ModelRenderer nose;
	private final ModelRenderer fin_left;
	private final ModelRenderer fin_right;
	private final ModelRenderer fin_back;
	private final ModelRenderer tail;

	public Modelgoldfish() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 22.0F, 0.0F);
		body.setTextureOffset(1, 14).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 6.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(-1.0F, 1.0F, 0.0F);
		body.addChild(right_fin);
		setRotationAngle(right_fin, 0.0F, 0.0F, -0.7854F);
		right_fin.setTextureOffset(24, 1).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(1.0F, 1.0F, 0.0F);
		body.addChild(left_fin);
		setRotationAngle(left_fin, 0.0F, 0.0F, 0.7854F);
		left_fin.setTextureOffset(24, 4).addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 22.0F, 0.0F);
		head.setTextureOffset(11, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 3.0F, 3.0F, 0.0F, false);

		nose = new ModelRenderer(this);
		nose.setRotationPoint(0.0F, 22.0F, -3.0F);
		nose.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		fin_left = new ModelRenderer(this);
		fin_left.setRotationPoint(0.0F, 24.0F, 0.0F);

		fin_right = new ModelRenderer(this);
		fin_right.setRotationPoint(0.0F, 24.0F, 0.0F);

		fin_back = new ModelRenderer(this);
		fin_back.setRotationPoint(0.0F, 20.0F, 0.0F);
		fin_back.setTextureOffset(20, -6).addBox(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 6.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 22.0F, 7.0F);
		tail.setTextureOffset(22, 3).addBox(0.0F, -2.0F, -1.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_left.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_right.render(matrixStack, buffer, packedLight, packedOverlay);
		fin_back.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.left_fin.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_fin.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}