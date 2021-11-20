// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelglare extends EntityModel<Entity> {
	private final ModelRenderer main;
	private final ModelRenderer body;
	private final ModelRenderer inner_body;
	private final ModelRenderer head;
	private final ModelRenderer face;

	public Modelglare() {
		textureWidth = 128;
		textureHeight = 128;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(body);
		body.setTextureOffset(36, 36).addBox(-6.0F, -8.0F, -6.0F, 12.0F, 6.0F, 12.0F, 0.0F, false);

		inner_body = new ModelRenderer(this);
		inner_body.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(inner_body);
		inner_body.setTextureOffset(46, 15).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 8.0F, 10.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -8.0F, 0.0F);
		main.addChild(head);
		head.setTextureOffset(0, 0).addBox(-7.0F, -11.0F, -7.0F, 14.0F, 11.0F, 14.0F, 0.0F, false);

		face = new ModelRenderer(this);
		face.setRotationPoint(0.0F, 8.0F, 0.0F);
		head.addChild(face);
		face.setTextureOffset(0, 25).addBox(-6.0F, -18.9F, -6.0F, 12.0F, 10.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		main.render(matrixStack, buffer, packedLight, packedOverlay);
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