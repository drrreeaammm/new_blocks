// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhamster extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer tail;
	private final ModelRenderer tail_two;
	private final ModelRenderer leg;
	private final ModelRenderer ear;

	public Modelhamster() {
		textureWidth = 16;
		textureHeight = 16;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 17.0F, 0.0F);
		head.setTextureOffset(0, 6).addBox(-2.0F, 3.0F, -4.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail.setTextureOffset(1, 12).addBox(0.0F, -3.0F, 2.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		tail_two = new ModelRenderer(this);
		tail_two.setRotationPoint(0.0F, 24.0F, 0.0F);
		tail_two.setTextureOffset(1, 12).addBox(0.0F, -4.0F, 4.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.0F, 24.0F, 0.0F);
		leg.setTextureOffset(5, 1).addBox(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(6, 4).addBox(-2.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(5, 1).addBox(0.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leg.setTextureOffset(4, 4).addBox(-2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		ear = new ModelRenderer(this);
		ear.setRotationPoint(0.0F, 24.0F, 0.0F);
		ear.setTextureOffset(3, 10).addBox(-3.0F, -6.0F, -4.0F, 5.0F, 2.0F, 0.0F, 0.0F, false);
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
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		tail_two.render(matrixStack, buffer, packedLight, packedOverlay);
		leg.render(matrixStack, buffer, packedLight, packedOverlay);
		ear.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}