// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelplane extends EntityModel<Entity> {
	private final ModelRenderer plane;
	private final ModelRenderer seat3;
	private final ModelRenderer headrest3;
	private final ModelRenderer steering;
	private final ModelRenderer gears;
	private final ModelRenderer pedal1;
	private final ModelRenderer pedal2;
	private final ModelRenderer planeshell;
	private final ModelRenderer landing;
	private final ModelRenderer landing3;
	private final ModelRenderer landing4;
	private final ModelRenderer landing2;
	private final ModelRenderer prop;
	private final ModelRenderer windsrceen;
	private final ModelRenderer windsrceen2;
	private final ModelRenderer window3;
	private final ModelRenderer upright;
	private final ModelRenderer window6;
	private final ModelRenderer upright2;

	public Modelplane() {
		textureWidth = 1024;
		textureHeight = 1024;

		plane = new ModelRenderer(this);
		plane.setRotationPoint(0.0F, 17.0F, -1.0F);

		seat3 = new ModelRenderer(this);
		seat3.setRotationPoint(0.0F, -13.0F, 3.0F);
		plane.addChild(seat3);
		setRotationAngle(seat3, -0.1745F, 0.0F, 0.0F);
		seat3.setTextureOffset(302, 649).addBox(-6.0F, -11.0F, 0.0F, 11.0F, 11.0F, 2.0F, 0.0F, false);
		seat3.setTextureOffset(162, 628).addBox(-6.0F, 0.0F, -8.0F, 11.0F, 2.0F, 10.0F, 0.0F, false);

		headrest3 = new ModelRenderer(this);
		headrest3.setRotationPoint(0.0F, -11.0F, 0.0F);
		seat3.addChild(headrest3);
		headrest3.setTextureOffset(60, 681).addBox(1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		headrest3.setTextureOffset(60, 679).addBox(-3.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		headrest3.setTextureOffset(30, 664).addBox(-4.0F, -5.0F, 0.0F, 7.0F, 4.0F, 2.0F, 0.0F, false);

		steering = new ModelRenderer(this);
		steering.setRotationPoint(10.0F, -17.0F, -12.0F);
		plane.addChild(steering);
		setRotationAngle(steering, 0.3491F, 0.0F, 0.0F);
		steering.setTextureOffset(0, 664).addBox(-11.0F, -1.0F, -3.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		steering.setTextureOffset(46, 679).addBox(-14.0F, -3.0F, 5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		steering.setTextureOffset(42, 679).addBox(-8.0F, -3.0F, 5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		steering.setTextureOffset(178, 676).addBox(-13.0F, -2.0F, 5.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);

		gears = new ModelRenderer(this);
		gears.setRotationPoint(0.0F, -11.0F, -7.0F);
		plane.addChild(gears);
		setRotationAngle(gears, -0.2618F, 0.0F, 0.0F);
		gears.setTextureOffset(32, 679).addBox(7.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		gears.setTextureOffset(24, 683).addBox(5.0F, -6.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		pedal1 = new ModelRenderer(this);
		pedal1.setRotationPoint(11.0F, -10.0F, -10.0F);
		plane.addChild(pedal1);
		setRotationAngle(pedal1, 0.2618F, 0.0F, 0.0F);
		pedal1.setTextureOffset(4, 679).addBox(-12.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		pedal2 = new ModelRenderer(this);
		pedal2.setRotationPoint(11.0F, -10.0F, -10.0F);
		plane.addChild(pedal2);
		setRotationAngle(pedal2, 0.2618F, 0.0F, 0.0F);
		pedal2.setTextureOffset(18, 679).addBox(-16.0F, -4.0F, -1.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		planeshell = new ModelRenderer(this);
		planeshell.setRotationPoint(0.0F, 16.0F, -67.0F);
		plane.addChild(planeshell);
		planeshell.setTextureOffset(88, 677).addBox(-5.0F, -37.0F, 35.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(276, 628).addBox(-11.0F, -36.0F, 54.0F, 20.0F, 10.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(206, 477).addBox(-12.0F, -36.0F, 47.0F, 1.0F, 10.0F, 28.0F, 0.0F, false);
		planeshell.setTextureOffset(82, 427).addBox(-12.0F, -26.0F, 47.0F, 22.0F, 1.0F, 28.0F, 0.0F, false);
		planeshell.setTextureOffset(40, 628).addBox(-12.0F, -36.0F, 46.0F, 22.0F, 11.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(170, 649).addBox(-5.0F, -27.0F, 63.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);
		planeshell.setTextureOffset(160, 674).addBox(6.0F, -27.0F, 58.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		planeshell.setTextureOffset(282, 549).addBox(11.0F, -34.0F, 49.0F, 1.0F, 6.0F, 24.0F, 0.0F, false);
		planeshell.setTextureOffset(192, 515).addBox(-13.0F, -35.0F, 48.0F, 1.0F, 8.0F, 26.0F, 0.0F, false);
		planeshell.setTextureOffset(352, 628).addBox(-11.0F, -35.0F, 45.0F, 20.0F, 9.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 649).addBox(-10.0F, -34.0F, 44.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(72, 649).addBox(-9.0F, -32.0F, 117.0F, 16.0F, 6.0F, 2.0F, 0.0F, false);
		planeshell.setTextureOffset(332, 549).addBox(-14.0F, -34.0F, 49.0F, 1.0F, 6.0F, 24.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 290).addBox(-68.0F, -32.0F, 50.0F, 54.0F, 3.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 410).addBox(-67.0F, -34.0F, 52.0F, 53.0F, 1.0F, 10.0F, 0.0F, false);
		planeshell.setTextureOffset(274, 265).addBox(-9.0F, -26.0F, 75.0F, 16.0F, 2.0F, 42.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 335).addBox(-68.0F, -33.0F, 51.0F, 54.0F, 1.0F, 14.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 399).addBox(-67.0F, -29.0F, 52.0F, 53.0F, 1.0F, 10.0F, 0.0F, false);
		planeshell.setTextureOffset(182, 427).addBox(-11.0F, -25.0F, 47.0F, 20.0F, 1.0F, 28.0F, 0.0F, false);
		planeshell.setTextureOffset(124, 664).addBox(-11.0F, -36.0F, 75.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(152, 265).addBox(-9.0F, -42.0F, 77.0F, 16.0F, 10.0F, 45.0F, 0.0F, false);
		planeshell.setTextureOffset(264, 477).addBox(9.0F, -36.0F, 47.0F, 1.0F, 10.0F, 28.0F, 0.0F, false);
		planeshell.setTextureOffset(300, 605).addBox(-11.0F, -36.0F, 47.0F, 20.0F, 1.0F, 7.0F, 0.0F, false);
		planeshell.setTextureOffset(138, 515).addBox(10.0F, -35.0F, 48.0F, 1.0F, 8.0F, 26.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 320).addBox(12.0F, -33.0F, 51.0F, 54.0F, 1.0F, 14.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 377).addBox(12.0F, -34.0F, 52.0F, 53.0F, 1.0F, 10.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 265).addBox(12.0F, -32.0F, 50.0F, 54.0F, 3.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 388).addBox(12.0F, -29.0F, 52.0F, 53.0F, 1.0F, 10.0F, 0.0F, false);
		planeshell.setTextureOffset(108, 649).addBox(-5.0F, -27.0F, 81.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);
		planeshell.setTextureOffset(130, 664).addBox(7.0F, -36.0F, 75.0F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(70, 515).addBox(-8.0F, -47.0F, 110.0F, 14.0F, 7.0F, 20.0F, 0.0F, false);
		planeshell.setTextureOffset(170, 549).addBox(7.0F, -48.0F, 51.0F, 1.0F, 8.0F, 25.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 496).addBox(-34.0F, -46.0F, 112.0F, 26.0F, 2.0F, 17.0F, 0.0F, false);
		planeshell.setTextureOffset(240, 628).addBox(-37.0F, -46.0F, 112.0F, 3.0F, 2.0F, 15.0F, 0.0F, false);
		planeshell.setTextureOffset(330, 582).addBox(-32.0F, -47.5F, 114.0F, 23.0F, 3.0F, 6.0F, 0.0F, false);
		planeshell.setTextureOffset(218, 605).addBox(-3.0F, -53.0F, 113.0F, 4.0F, 7.0F, 16.0F, 0.0F, false);
		planeshell.setTextureOffset(318, 628).addBox(-3.0F, -58.0F, 117.0F, 4.0F, 5.0F, 13.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 477).addBox(6.0F, -46.0F, 112.0F, 26.0F, 2.0F, 17.0F, 0.0F, false);
		planeshell.setTextureOffset(204, 628).addBox(32.0F, -46.0F, 112.0F, 3.0F, 2.0F, 15.0F, 0.0F, false);
		planeshell.setTextureOffset(142, 649).addBox(-3.0F, -63.0F, 121.0F, 4.0F, 5.0F, 10.0F, 0.0F, false);
		planeshell.setTextureOffset(330, 591).addBox(7.0F, -47.5F, 114.0F, 23.0F, 3.0F, 6.0F, 0.0F, false);
		planeshell.setTextureOffset(18, 664).addBox(1.0F, -57.0F, 123.0F, 1.0F, 10.0F, 5.0F, 0.0F, false);
		planeshell.setTextureOffset(354, 649).addBox(-4.0F, -57.0F, 123.0F, 1.0F, 10.0F, 5.0F, 0.0F, false);
		planeshell.setTextureOffset(240, 653).addBox(-6.0F, -40.0F, 122.0F, 10.0F, 5.0F, 5.0F, 0.0F, false);
		planeshell.setTextureOffset(88, 605).addBox(66.0F, -32.0F, 51.0F, 3.0F, 3.0F, 19.0F, 0.0F, false);
		planeshell.setTextureOffset(44, 605).addBox(-71.0F, -32.0F, 51.0F, 3.0F, 3.0F, 19.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 628).addBox(-9.0F, -34.0F, 25.0F, 1.0F, 2.0F, 19.0F, 0.0F, false);
		planeshell.setTextureOffset(86, 477).addBox(7.0F, -32.0F, 25.0F, 1.0F, 8.0F, 29.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 0).addBox(-9.0F, -24.0F, 24.0F, 16.0F, 2.0F, 93.0F, 0.0F, false);
		planeshell.setTextureOffset(202, 95).addBox(-5.0F, -20.0F, 29.0F, 8.0F, 1.0F, 85.0F, 0.0F, false);
		planeshell.setTextureOffset(190, 669).addBox(-3.0F, -31.0F, 19.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(50, 682).addBox(-2.0F, -32.0F, 19.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(50, 684).addBox(-2.0F, -30.0F, 19.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(106, 666).addBox(2.0F, -37.0F, 36.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		planeshell.setTextureOffset(106, 672).addBox(-5.0F, -37.0F, 36.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		planeshell.setTextureOffset(106, 664).addBox(-5.0F, -37.0F, 41.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 605).addBox(-8.0F, -35.0F, 24.0F, 1.0F, 1.0F, 21.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 582).addBox(-7.0F, -36.0F, 24.0F, 2.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(276, 649).addBox(-7.0F, -35.0F, 23.0F, 12.0F, 13.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(144, 664).addBox(5.0F, -34.0F, 24.0F, 2.0F, 10.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 95).addBox(-7.0F, -21.0F, 26.0F, 12.0F, 1.0F, 89.0F, 0.0F, false);
		planeshell.setTextureOffset(218, 0).addBox(-8.0F, -22.0F, 24.0F, 14.0F, 1.0F, 92.0F, 0.0F, false);
		planeshell.setTextureOffset(146, 477).addBox(-10.0F, -32.0F, 25.0F, 1.0F, 8.0F, 29.0F, 0.0F, false);
		planeshell.setTextureOffset(354, 605).addBox(6.0F, -34.0F, 25.0F, 1.0F, 2.0F, 19.0F, 0.0F, false);
		planeshell.setTextureOffset(132, 605).addBox(5.0F, -35.0F, 24.0F, 1.0F, 1.0F, 21.0F, 0.0F, false);
		planeshell.setTextureOffset(48, 582).addBox(3.0F, -36.0F, 24.0F, 2.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(150, 664).addBox(-9.0F, -34.0F, 24.0F, 2.0F, 10.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(222, 549).addBox(-5.0F, -36.0F, 24.0F, 8.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(328, 649).addBox(-5.0F, -34.0F, 22.0F, 8.0F, 11.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(50, 664).addBox(-4.0F, -33.0F, 21.0F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(190, 664).addBox(-3.0F, -32.0F, 20.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(116, 549).addBox(-11.0F, -31.0F, 28.0F, 1.0F, 5.0F, 26.0F, 0.0F, false);
		planeshell.setTextureOffset(358, 515).addBox(8.0F, -31.0F, 28.0F, 1.0F, 5.0F, 26.0F, 0.0F, false);
		planeshell.setTextureOffset(52, 549).addBox(-7.0F, -51.0F, 53.0F, 12.0F, 1.0F, 20.0F, 0.0F, false);
		planeshell.setTextureOffset(192, 582).addBox(5.0F, -50.0F, 52.0F, 1.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(136, 320).addBox(7.0F, -40.0F, 76.0F, 1.0F, 16.0F, 41.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 427).addBox(8.0F, -36.0F, 76.0F, 1.0F, 10.0F, 40.0F, 0.0F, false);
		planeshell.setTextureOffset(246, 515).addBox(7.5F, -40.0F, 50.0F, 2.0F, 4.0F, 26.0F, 0.0F, false);
		planeshell.setTextureOffset(328, 661).addBox(-7.0F, -50.0F, 52.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		planeshell.setTextureOffset(146, 582).addBox(-8.0F, -50.0F, 52.0F, 1.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(284, 582).addBox(6.0F, -49.0F, 53.0F, 1.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(238, 582).addBox(-9.0F, -49.0F, 53.0F, 1.0F, 1.0F, 22.0F, 0.0F, false);
		planeshell.setTextureOffset(220, 320).addBox(-10.0F, -40.0F, 76.0F, 1.0F, 16.0F, 41.0F, 0.0F, false);
		planeshell.setTextureOffset(126, 377).addBox(-11.0F, -36.0F, 76.0F, 1.0F, 10.0F, 40.0F, 0.0F, false);
		planeshell.setTextureOffset(302, 515).addBox(-11.5F, -40.0F, 50.0F, 2.0F, 4.0F, 26.0F, 0.0F, false);
		planeshell.setTextureOffset(174, 185).addBox(-16.0F, -10.0F, 32.0F, 7.0F, 1.0F, 73.0F, 0.0F, false);
		planeshell.setTextureOffset(388, 95).addBox(-17.0F, -12.0F, 30.0F, 9.0F, 2.0F, 78.0F, 0.0F, false);
		planeshell.setTextureOffset(278, 427).addBox(-15.0F, -9.0F, 33.0F, 5.0F, 1.0F, 33.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 185).addBox(6.0F, -12.0F, 30.0F, 9.0F, 2.0F, 78.0F, 0.0F, false);
		planeshell.setTextureOffset(334, 185).addBox(7.0F, -10.0F, 32.0F, 7.0F, 1.0F, 73.0F, 0.0F, false);
		planeshell.setTextureOffset(354, 427).addBox(8.0F, -9.0F, 33.0F, 5.0F, 1.0F, 33.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 549).addBox(-10.0F, -48.0F, 51.0F, 1.0F, 8.0F, 25.0F, 0.0F, false);
		planeshell.setTextureOffset(0, 515).addBox(-6.0F, -43.0F, 85.0F, 10.0F, 1.0F, 25.0F, 0.0F, false);
		planeshell.setTextureOffset(96, 582).addBox(-4.0F, -44.0F, 91.0F, 6.0F, 1.0F, 19.0F, 0.0F, false);

		landing = new ModelRenderer(this);
		landing.setRotationPoint(8.0F, -12.0F, 46.0F);
		planeshell.addChild(landing);
		setRotationAngle(landing, -0.1745F, 0.0F, -0.2618F);
		landing.setTextureOffset(136, 664).addBox(-1.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		landing3 = new ModelRenderer(this);
		landing3.setRotationPoint(8.0F, -12.0F, 86.0F);
		planeshell.addChild(landing3);
		setRotationAngle(landing3, 0.1745F, 0.0F, -0.2618F);
		landing3.setTextureOffset(156, 664).addBox(-1.0F, -11.0F, 0.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		landing4 = new ModelRenderer(this);
		landing4.setRotationPoint(-11.0F, -12.0F, 86.0F);
		planeshell.addChild(landing4);
		setRotationAngle(landing4, 0.1745F, 0.0F, 0.2618F);
		landing4.setTextureOffset(178, 664).addBox(0.0F, -11.0F, 0.0F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		landing2 = new ModelRenderer(this);
		landing2.setRotationPoint(-10.0F, -12.0F, 46.0F);
		planeshell.addChild(landing2);
		setRotationAngle(landing2, -0.1745F, 0.0F, 0.2618F);
		landing2.setTextureOffset(140, 664).addBox(0.0F, -12.0F, -1.0F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		prop = new ModelRenderer(this);
		prop.setRotationPoint(-1.5F, -14.5F, -47.0F);
		plane.addChild(prop);
		prop.setTextureOffset(30, 673).addBox(2.5F, -2.5F, -2.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(10, 679).addBox(0.5F, -1.5F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		prop.setTextureOffset(56, 681).addBox(-2.5F, -2.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(50, 679).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		prop.setTextureOffset(160, 664).addBox(-2.5F, -11.5F, -2.0F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(36, 679).addBox(-1.5F, -2.5F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		prop.setTextureOffset(56, 683).addBox(1.5F, -2.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(64, 679).addBox(1.5F, 1.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(56, 679).addBox(-2.5F, 1.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(204, 664).addBox(-2.5F, 0.5F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		prop.setTextureOffset(172, 664).addBox(0.5F, 2.5F, -2.0F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		prop.setTextureOffset(24, 679).addBox(0.5F, 0.5F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		prop.setTextureOffset(30, 670).addBox(-11.5F, 0.5F, -2.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);

		windsrceen = new ModelRenderer(this);
		windsrceen.setRotationPoint(0.0F, -20.0F, -18.0F);
		plane.addChild(windsrceen);
		setRotationAngle(windsrceen, -0.2618F, 0.0F, 0.0F);
		windsrceen.setTextureOffset(38, 649).addBox(-9.0F, -11.0F, 0.0F, 16.0F, 11.0F, 1.0F, 0.0F, false);
		windsrceen.setTextureOffset(88, 664).addBox(7.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		windsrceen.setTextureOffset(64, 664).addBox(-11.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		windsrceen.setTextureOffset(204, 658).addBox(-9.0F, -14.0F, -1.0F, 16.0F, 3.0F, 2.0F, 0.0F, false);

		windsrceen2 = new ModelRenderer(this);
		windsrceen2.setRotationPoint(0.0F, -20.0F, 10.0F);
		plane.addChild(windsrceen2);
		setRotationAngle(windsrceen2, 0.2618F, 0.0F, 0.0F);
		windsrceen2.setTextureOffset(394, 628).addBox(-9.0F, -13.0F, 0.0F, 16.0F, 11.0F, 1.0F, 0.0F, false);
		windsrceen2.setTextureOffset(80, 664).addBox(7.0F, -13.0F, 0.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		windsrceen2.setTextureOffset(72, 664).addBox(-11.0F, -13.0F, 0.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		windsrceen2.setTextureOffset(240, 649).addBox(-9.0F, -15.0F, 0.0F, 16.0F, 2.0F, 2.0F, 0.0F, false);

		window3 = new ModelRenderer(this);
		window3.setRotationPoint(0.0F, 0.0F, 0.0F);
		plane.addChild(window3);
		window3.setTextureOffset(124, 628).addBox(7.5F, -32.0F, -13.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		window3.setTextureOffset(258, 605).addBox(7.5F, -25.0F, -15.0F, 1.0F, 1.0F, 20.0F, 0.0F, false);
		window3.setTextureOffset(200, 672).addBox(7.5F, -31.0F, 5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		upright = new ModelRenderer(this);
		upright.setRotationPoint(8.0F, -25.0F, -14.0F);
		window3.addChild(upright);
		setRotationAngle(upright, -0.2618F, 0.0F, 0.0F);
		upright.setTextureOffset(190, 671).addBox(-0.5F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		window6 = new ModelRenderer(this);
		window6.setRotationPoint(-19.0F, 0.0F, 0.0F);
		plane.addChild(window6);
		window6.setTextureOffset(86, 628).addBox(8.5F, -32.0F, -13.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		window6.setTextureOffset(176, 605).addBox(8.5F, -25.0F, -15.0F, 1.0F, 1.0F, 20.0F, 0.0F, false);
		window6.setTextureOffset(0, 679).addBox(8.5F, -31.0F, 5.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		upright2 = new ModelRenderer(this);
		upright2.setRotationPoint(8.0F, -25.0F, -14.0F);
		window6.addChild(upright2);
		setRotationAngle(upright2, -0.2618F, 0.0F, 0.0F);
		upright2.setTextureOffset(200, 664).addBox(0.5F, -7.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		plane.render(matrixStack, buffer, packedLight, packedOverlay);
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