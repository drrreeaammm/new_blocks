// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelhatched_warden extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_ear_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelhatched_warden() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -10.0F, 0.0F);
		setRotationAngle(head, 0.1745F, 0.0F, 0.0F);

		left_ear_r1 = new ModelRenderer(this);
		left_ear_r1.setRotationPoint(0.0F, 40.0F, -1.25F);
		head.addChild(left_ear_r1);
		setRotationAngle(left_ear_r1, 0.0401F, 0.0F, 0.0F);
		left_ear_r1.setTextureOffset(106, 46).addBox(6.0F, -46.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
		left_ear_r1.setTextureOffset(106, 36).addBox(-16.0F, -46.0F, 0.0F, 10.0F, 10.0F, 0.0F, 0.0F, false);
		left_ear_r1.setTextureOffset(0, 0).addBox(-8.0F, -46.0F, -5.0F, 16.0F, 16.0F, 10.0F, -2.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -10.0F, 0.0F);
		setRotationAngle(body, 0.1309F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 13.25F, -1.5F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0436F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 26).addBox(-9.0F, -7.0219F, -6.0032F, 18.0F, 21.0F, 11.0F, -2.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-8.0F, -1.25F, -0.5F);
		setRotationAngle(right_arm, -0.1309F, 0.0F, 0.0F);
		right_arm.setTextureOffset(52, 0).addBox(-5.0F, 0.0F, -4.0F, 7.0F, 18.0F, 8.0F, -1.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(11.0F, -6.0F, 0.0F);
		setRotationAngle(left_arm, -0.1309F, 0.0F, 0.0F);
		left_arm.setTextureOffset(84, 0).addBox(-5.0F, 4.75F, -4.5F, 7.0F, 18.0F, 8.0F, -1.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(5.75F, 11.0F, 0.0F);
		left_leg.setTextureOffset(84, 41).addBox(-3.0F, 4.0F, -1.5F, 4.0F, 9.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-5.75F, 11.0F, 0.75F);
		right_leg.setTextureOffset(84, 41).addBox(-1.0F, 4.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}