// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeldrone extends EntityModel<Entity> {
	private final ModelRenderer drone;
	private final ModelRenderer dronepart1;
	private final ModelRenderer part6_r1;
	private final ModelRenderer part1_r1;
	private final ModelRenderer dronepart2;
	private final ModelRenderer part7_r1;
	private final ModelRenderer part2_r1;
	private final ModelRenderer dronepart3;
	private final ModelRenderer part8_r1;
	private final ModelRenderer part3_r1;
	private final ModelRenderer dronepart4;
	private final ModelRenderer part9_r1;
	private final ModelRenderer part4_r1;
	private final ModelRenderer legs;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;

	public Modeldrone() {
		textureWidth = 64;
		textureHeight = 64;

		drone = new ModelRenderer(this);
		drone.setRotationPoint(0.0F, 24.75F, 0.0F);
		drone.setTextureOffset(0, 51).addBox(-5.5F, -5.0F, -5.5F, 11.0F, 2.0F, 11.0F, 0.0F, false);

		dronepart1 = new ModelRenderer(this);
		dronepart1.setRotationPoint(0.0F, 0.0F, 0.0F);
		drone.addChild(dronepart1);

		part6_r1 = new ModelRenderer(this);
		part6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart1.addChild(part6_r1);
		setRotationAngle(part6_r1, 1.5708F, 0.9599F, 0.0873F);
		part6_r1.setTextureOffset(37, 10).addBox(0.75F, -10.5F, 7.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		part6_r1.setTextureOffset(37, 10).addBox(0.75F, -13.5F, 7.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		part6_r1.setTextureOffset(37, 10).addBox(0.75F, -11.5F, 7.25F, 1.0F, 1.0F, -1.0F, 0.1F, false);
		part6_r1.setTextureOffset(37, 10).addBox(0.75F, -11.5F, 4.0F, 1.0F, 1.0F, 3.0F, -0.2F, false);
		part6_r1.setTextureOffset(37, 10).addBox(0.25F, -12.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		part1_r1 = new ModelRenderer(this);
		part1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart1.addChild(part1_r1);
		setRotationAngle(part1_r1, 1.5708F, 0.9599F, 0.0F);
		part1_r1.setTextureOffset(37, 10).addBox(0.75F, -10.5F, 3.75F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		dronepart2 = new ModelRenderer(this);
		dronepart2.setRotationPoint(0.0F, 0.0F, 0.0F);
		drone.addChild(dronepart2);

		part7_r1 = new ModelRenderer(this);
		part7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart2.addChild(part7_r1);
		setRotationAngle(part7_r1, 1.5708F, -0.9599F, -0.0873F);
		part7_r1.setTextureOffset(37, 10).addBox(-1.75F, -10.5F, 7.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		part7_r1.setTextureOffset(37, 10).addBox(-1.75F, -13.5F, 7.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		part7_r1.setTextureOffset(37, 10).addBox(-1.75F, -11.5F, 7.25F, 1.0F, 1.0F, -1.0F, 0.1F, true);
		part7_r1.setTextureOffset(37, 10).addBox(-1.75F, -11.5F, 4.0F, 1.0F, 1.0F, 3.0F, -0.2F, true);
		part7_r1.setTextureOffset(37, 10).addBox(-2.25F, -12.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		part2_r1 = new ModelRenderer(this);
		part2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart2.addChild(part2_r1);
		setRotationAngle(part2_r1, 1.5708F, -0.9599F, 0.0F);
		part2_r1.setTextureOffset(37, 10).addBox(-1.75F, -10.5F, 3.75F, 1.0F, 4.0F, 1.0F, 0.0F, true);

		dronepart3 = new ModelRenderer(this);
		dronepart3.setRotationPoint(0.0F, 0.0F, 0.0F);
		drone.addChild(dronepart3);

		part8_r1 = new ModelRenderer(this);
		part8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart3.addChild(part8_r1);
		setRotationAngle(part8_r1, -1.5708F, 0.9599F, -0.0873F);
		part8_r1.setTextureOffset(37, 10).addBox(-1.75F, -10.5F, -7.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		part8_r1.setTextureOffset(37, 10).addBox(-1.75F, -13.5F, -7.0F, 1.0F, 2.0F, 0.0F, 0.0F, true);
		part8_r1.setTextureOffset(37, 10).addBox(-1.75F, -11.5F, -6.25F, 1.0F, 1.0F, -1.0F, 0.1F, true);
		part8_r1.setTextureOffset(37, 10).addBox(-1.75F, -11.5F, -7.0F, 1.0F, 1.0F, 3.0F, -0.2F, true);
		part8_r1.setTextureOffset(37, 10).addBox(-2.25F, -12.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		part3_r1 = new ModelRenderer(this);
		part3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart3.addChild(part3_r1);
		setRotationAngle(part3_r1, -1.5708F, 0.9599F, 0.0F);
		part3_r1.setTextureOffset(37, 10).addBox(-1.75F, -10.5F, -4.75F, 1.0F, 4.0F, 1.0F, 0.0F, true);

		dronepart4 = new ModelRenderer(this);
		dronepart4.setRotationPoint(0.0F, 0.0F, 0.0F);
		drone.addChild(dronepart4);

		part9_r1 = new ModelRenderer(this);
		part9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart4.addChild(part9_r1);
		setRotationAngle(part9_r1, -1.5708F, -0.9599F, 0.0873F);
		part9_r1.setTextureOffset(37, 10).addBox(0.75F, -10.5F, -7.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		part9_r1.setTextureOffset(37, 10).addBox(0.75F, -13.5F, -7.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		part9_r1.setTextureOffset(37, 10).addBox(0.75F, -11.5F, -6.25F, 1.0F, 1.0F, -1.0F, 0.1F, false);
		part9_r1.setTextureOffset(37, 10).addBox(0.75F, -11.5F, -7.0F, 1.0F, 1.0F, 3.0F, -0.2F, false);
		part9_r1.setTextureOffset(37, 10).addBox(0.25F, -12.0F, -5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		part4_r1 = new ModelRenderer(this);
		part4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		dronepart4.addChild(part4_r1);
		setRotationAngle(part4_r1, -1.5708F, -0.9599F, 0.0F);
		part4_r1.setTextureOffset(37, 10).addBox(0.75F, -10.5F, -4.75F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		legs = new ModelRenderer(this);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		drone.addChild(legs);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		legs.addChild(leg1);
		leg1.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg1.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg1.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		leg1.setTextureOffset(0, 0).addBox(-5.0F, -3.5F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(9.0F, 0.0F, 0.0F);
		legs.addChild(leg2);
		leg2.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg2.setTextureOffset(0, 0).addBox(-5.0F, -3.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		leg2.setTextureOffset(0, 0).addBox(-5.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		leg2.setTextureOffset(0, 0).addBox(-5.0F, -3.5F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		drone.render(matrixStack, buffer, packedLight, packedOverlay);
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