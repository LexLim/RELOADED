// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelglados<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glados"), "main");
	private final ModelPart mainFolder;

	public Modelglados(ModelPart root) {
		this.mainFolder = root.getChild("mainFolder");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mainFolder = partdefinition.addOrReplaceChild("mainFolder", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition mainCable = mainFolder.addOrReplaceChild("mainCable", CubeListBuilder.create(),
				PartPose.offset(0.0F, -165.0F, 36.0F));

		PartDefinition secondaryCable = mainCable.addOrReplaceChild("secondaryCable", CubeListBuilder.create(),
				PartPose.offset(-5.0F, 53.0F, -12.0F));

		PartDefinition mainBody = secondaryCable.addOrReplaceChild("mainBody", CubeListBuilder.create(),
				PartPose.offset(5.0F, 48.6F, 8.9F));

		PartDefinition leftArm = mainBody.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(7.1F, -16.6F, 3.3F));

		PartDefinition left_cable = leftArm.addOrReplaceChild("left_cable", CubeListBuilder.create(),
				PartPose.offsetAndRotation(5.7734F, 36.9175F, -7.0629F, -0.9693F, -0.2685F, -1.3891F));

		PartDefinition cube_r1 = left_cable.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(242, 156).addBox(-2.5F, -15.5F, -5.0F, 7.0F, 21.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.8688F, 12.0342F, -15.7899F, 2.4435F, 0.8358F, 3.1416F));

		PartDefinition cube_r2 = left_cable.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(212, 129).addBox(-32.9569F, -1.2783F, -7.6705F, 16.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.943F, 13.1005F, -8.5832F, -1.7447F, -0.061F, 2.3847F));

		PartDefinition cube_r3 = left_cable.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(213, 90).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.764F, 7.2868F, -9.8272F, 0.0363F, 0.0258F, 1.0394F));

		PartDefinition cube_r4 = left_cable.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(230, 117).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6479F, 9.9453F, -9.6063F, 3.0209F, -0.0268F, 2.7406F));

		PartDefinition cube_r5 = left_cable.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(213, 90).addBox(-0.8287F, -8.2903F, -1.5786F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.943F, 13.1005F, -8.5832F, 0.0818F, 0.3218F, 1.1605F));

		PartDefinition cube_r6 = left_cable.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(212, 117).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.8107F, 13.3017F, -9.0393F, 1.3437F, 0.0857F, 2.7128F));

		PartDefinition cube_r7 = left_cable.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(236, 195).addBox(-7.0F, -12.5F, 0.0F, 10.0F, 25.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.1622F, 15.5644F, -1.8768F, 0.4487F, -1.1818F, 1.0181F));

		PartDefinition cube_r8 = left_cable.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(213, 90).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9758F, 14.3128F, -9.117F, 0.0857F, 0.0418F, 1.6157F));

		PartDefinition cube_r9 = left_cable.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(212, 106).addBox(-6.0F, -3.0F, -2.5F, 12.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7027F, 12.907F, -8.2649F, -0.3188F, -0.1243F, -2.9468F));

		PartDefinition cube_r10 = left_cable.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(213, 90).addBox(-0.25F, -1.75F, -1.5F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.057F, 11.3505F, -6.5832F, -1.9635F, 0.8727F, 0.0F));

		PartDefinition rightArm = mainBody.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(-7.3F, -1.6F, 11.9F));

		PartDefinition right_cable = rightArm.addOrReplaceChild("right_cable",
				CubeListBuilder.create().texOffs(213, 90).addBox(-1.5F, -8.8125F, -1.5F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8F, 32.8125F, -32.3F, -0.9288F, -0.2443F, -1.43F));

		PartDefinition cube_r11 = right_cable.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(212, 129).addBox(-22.2177F, -3.4497F, -1.7841F, 16.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(16.8716F, -24.9674F, 9.6571F, 1.5939F, 0.1081F, -3.0272F));

		PartDefinition cube_r12 = right_cable.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(213, 90).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 12.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0288F, -24.0406F, 10.0133F, -0.131F, 0.6061F, 1.6021F));

		PartDefinition cube_r13 = right_cable.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(230, 117).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.6913F, -24.9058F, 9.5948F, 0.0525F, 0.2128F, -3.1241F));

		PartDefinition cube_r14 = right_cable.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(213, 90).addBox(-1.5F, -4.0F, -1.5F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.7916F, -24.4182F, 8.4459F, -0.3406F, 0.4313F, 1.2162F));

		PartDefinition cube_r15 = right_cable.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(212, 117).addBox(-1.5F, -3.0F, -3.0F, 3.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2113F, -22.4636F, 7.1712F, -0.3929F, 0.4701F, 2.5053F));

		PartDefinition cube_r16 = right_cable.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(236, 177).addBox(0.3105F, -17.8444F, 1.8607F, 10.0F, 18.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.2078F, -12.9839F, 0.2446F, -2.3247F, -0.4143F, -2.8148F));

		PartDefinition cube_r17 = right_cable.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(213, 90).addBox(-2.7271F, -8.9763F, -4.3041F, 3.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9736F, -14.0969F, 5.3928F, -0.4927F, 0.0014F, 0.3687F));

		PartDefinition cube_r18 = right_cable.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(212, 106).addBox(-11.5F, -3.0F, -2.5F, 12.0F, 6.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.3125F, -1.0F, 0.1448F, 0.4586F, 1.7673F));

		PartDefinition torsoJoint = mainBody.addOrReplaceChild("torsoJoint", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.4F, 0.1F));

		PartDefinition mainTorso = torsoJoint.addOrReplaceChild("mainTorso", CubeListBuilder.create(),
				PartPose.offset(0.0F, 5.0F, 1.8F));

		PartDefinition mainNeck = mainTorso.addOrReplaceChild("mainNeck", CubeListBuilder.create(),
				PartPose.offset(0.0F, 9.0F, -28.8F));

		PartDefinition mainHead = mainNeck.addOrReplaceChild("mainHead", CubeListBuilder.create(),
				PartPose.offset(0.0F, 18.0F, -12.0F));

		PartDefinition head = mainHead.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -12.0F, -10.0F, 8.0F, 24.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(24, 36)
						.addBox(-5.0F, -4.3179F, -11.6472F, 10.0F, 7.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offset(0.0F, -2.0F, 2.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(24, 45)
						.addBox(1.0F, 0.25F, -1.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 66)
						.addBox(-0.5F, -2.25F, -1.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(57, 52)
						.addBox(-1.5F, -3.75F, -1.5F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 45)
						.addBox(-2.0F, -5.75F, -0.5F, 5.0F, 9.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 4.0F, -11.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 61).addBox(-5.0F, -6.9161F, 0.1371F, 10.0F, 7.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 13.2967F, -3.2371F, -1.5708F, 0.0F, -3.1416F));

		PartDefinition cube_r21 = head
				.addOrReplaceChild("cube_r21",
						CubeListBuilder.create().texOffs(0, 43).addBox(-5.0F, 0.1012F, -0.1651F, 10.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 9.0F, -9.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(48, 43).addBox(-5.0F, -0.1061F, -0.1396F, 10.0F, 7.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 2.75F, -11.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 52).addBox(-5.0F, -5.4728F, -0.9537F, 10.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -10.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 43).addBox(-5.0F, -11.4151F, -3.3902F, 10.0F, 7.0F, 2.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -10.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 36).addBox(-5.0F, -15.6F, -8.3F, 10.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -10.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(25, 60)
						.addBox(-4.5F, -2.5F, -7.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 60)
						.addBox(-4.5F, -2.5F, 1.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 1.5F, -4.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head_joints = mainNeck.addOrReplaceChild("head_joints", CubeListBuilder.create().texOffs(37, 45)
				.addBox(5.125F, 5.5436F, -3.2494F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 45)
				.addBox(-5.875F, 5.5436F, -3.2494F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
				.addBox(-7.375F, -0.4564F, -4.2494F, 15.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(41, 52)
				.addBox(-2.375F, 5.5436F, -1.2494F, 5.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -2.625F, 2.625F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head_joints.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(50, 79).addBox(-7.0F, -10.0F, 0.1F, 15.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.375F, -0.4564F, -4.2494F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head_joints.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(50, 79).addBox(-7.0F, -10.0F, 0.0F, 15.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.375F, -0.4564F, -4.2494F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head_joints.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(236, 177).addBox(-2.3269F, -7.8127F, 0.667F, 10.0F, 18.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4868F, 10.7297F, -0.9197F, -1.5479F, -0.4262F, 1.2178F));

		PartDefinition torso = mainTorso.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(0, 87)
						.addBox(-4.5F, -42.0F, 0.0F, 9.0F, 9.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(147, 15)
						.addBox(-5.0F, -44.0F, 0.0F, 10.0F, 15.0F, 27.0F, new CubeDeformation(0.5F)).texOffs(72, 15)
						.addBox(-5.0F, -44.0F, 0.0F, 10.0F, 15.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 40.0F, -34.8F));

		PartDefinition cube_r30 = torso.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(104, 119).addBox(-5.0F, -2.0F, -2.5F, 10.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -41.2283F, 34.5482F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r31 = torso.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(118, 114)
						.addBox(1.0F, -5.2F, -7.6F, 0.0F, 8.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(80, 114)
						.addBox(-1.5F, -2.2F, -7.6F, 5.0F, 5.0F, 14.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-1.0F, -36.5F, 32.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r32 = torso.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(57, 161).mirror()
				.addBox(-3.5F, -1.7523F, -0.9166F, 8.0F, 16.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -28.7765F, 32.804F, 2.618F, 0.0F, 0.0F));

		PartDefinition cube_r33 = torso.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(29, 168).mirror()
				.addBox(-5.0F, -0.7023F, -1.4166F, 11.0F, 10.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -25.0265F, 23.554F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r34 = torso.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 161).mirror()
				.addBox(-5.0F, -13.1931F, -0.1445F, 11.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -23.7F, 22.6F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r35 = torso.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(40, 147).mirror()
						.addBox(-6.5F, -0.9051F, -2.1943F, 14.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -28.7F, 23.9F, 1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r36 = torso.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(0, 147).mirror()
						.addBox(-8.0F, -0.1143F, -2.4753F, 17.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -30.7F, 13.6F, 1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r37 = torso.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(0, 133).addBox(-10.0F, 1.0F, -1.6F, 21.0F, 11.0F, 3.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-0.5F, -36.7F, 4.6F, 0.9163F, 0.0F, 0.0F));

		PartDefinition cube_r38 = torso.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(45, 114).addBox(-4.0F, -0.35F, -3.4F, 9.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -32.5107F, 24.9937F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r39 = torso.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(0, 109).addBox(-4.0F, 2.8603F, 0.257F, 9.0F, 12.0F, 13.0F,
						new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(-0.5F, -43.9549F, 12.6787F, -0.48F, 0.0F, 0.0F));

		PartDefinition torso_joins = torsoJoint.addOrReplaceChild("torso_joins", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.7717F, 2.5482F));

		PartDefinition cube_r40 = torso_joins.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(134, 113)
				.addBox(-2.5F, -4.8192F, -1.0736F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(154, 114)
				.addBox(-1.0F, -6.8192F, 3.9264F, 2.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(170, 110)
				.addBox(-1.0F, -7.8192F, -3.0736F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r41 = torso_joins.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(170, 124)
						.addBox(-6.6165F, -4.9769F, 1.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(170, 124)
						.addBox(-6.6165F, -4.9769F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -1.2217F, -1.5708F));

		PartDefinition back = mainBody.addOrReplaceChild("back", CubeListBuilder.create(),
				PartPose.offset(-3.5F, 17.7489F, -1.214F));

		PartDefinition cube_r42 = back.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 200).mirror()
				.addBox(-6.0F, -14.2868F, -0.0952F, 12.0F, 15.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -36.3708F, 14.2021F, 1.7017F, 0.0F, -3.1416F));

		PartDefinition cube_r43 = back.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(0, 178).mirror()
				.addBox(-6.0F, -18.7737F, -2.0866F, 12.0F, 18.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -2.8208F, 16.4021F, -2.8798F, 0.0F, -3.1416F));

		PartDefinition cube_r44 = back.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(74, 207).mirror()
				.addBox(-12.0F, -15.2547F, 3.5452F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 207).mirror()
				.addBox(12.0F, -15.2547F, 3.5452F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(32, 194).mirror()
				.addBox(-6.0F, -15.2547F, 0.5452F, 18.0F, 15.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(32, 194).mirror()
				.addBox(-12.0F, -15.2547F, 0.5452F, 18.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -5.6208F, 15.7021F, -2.8798F, 0.0F, -3.1416F));

		PartDefinition cube_r45 = back.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 178).mirror()
				.addBox(-6.0F, -15.8829F, -3.5995F, 12.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(74, 207).mirror()
				.addBox(-12.0F, -14.8829F, 3.0005F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
				.texOffs(74, 207).mirror()
				.addBox(12.0F, -14.8829F, 3.0005F, 0.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 194).mirror()
				.addBox(-6.0F, -14.8829F, 0.0005F, 18.0F, 15.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(32, 194).mirror()
				.addBox(-12.0F, -14.8829F, 0.0005F, 18.0F, 15.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -20.6208F, 19.1021F, 2.6616F, 0.0F, -3.1416F));

		PartDefinition cube_r46 = back.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(56, 198).mirror()
						.addBox(-4.0F, -7.5F, 1.5F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -1.9589F, 10.2542F, -1.9199F, 0.0F, 3.1416F));

		PartDefinition cube_r47 = back.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(79, 161).mirror()
						.addBox(-4.0F, -8.3F, -1.1F, 8.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -1.9589F, 10.2542F, -1.8326F, 0.0F, 3.1416F));

		PartDefinition cube_r48 = back.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(32, 212).mirror()
						.addBox(-7.0F, 0.2346F, 0.6485F, 14.0F, 10.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false)
						.texOffs(32, 181).mirror()
						.addBox(-7.0F, 0.2346F, -2.3515F, 14.0F, 10.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false),
				PartPose.offsetAndRotation(3.5F, -1.6208F, 5.7021F, 2.2253F, 0.0F, 0.0F));

		PartDefinition cube_r49 = back.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(201, 63).addBox(1.0F, -5.0F, -5.0F, 0.0F, 10.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, -17.8152F, 1.4815F, 3.0543F, 0.0F, 0.0F));

		PartDefinition cube_r50 = back.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(177, 63)
						.addBox(3.0F, -22.5F, 10.5F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(201, 45)
						.addBox(1.0F, -24.5F, 8.5F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(191, 83)
						.addBox(-6.0F, -22.5F, 10.5F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(143, 69)
						.addBox(-7.0F, -24.5F, 8.5F, 10.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(95, 69)
						.addBox(-7.0F, -27.5F, 8.5F, 10.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -0.8489F, 17.564F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r51 = back.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(102, 136).addBox(-2.0F, 0.0F, -5.0F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -12.0498F, 10.0114F, -0.451F, 1.1289F, -0.6655F));

		PartDefinition cube_r52 = back.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(143, 97).addBox(-3.5F, -2.5F, -2.5F, 7.0F, 10.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -13.986F, -6.3822F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r53 = back.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(95, 69).addBox(-5.0F, -7.0F, -6.0F, 10.0F, 3.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -20.8909F, 0.7467F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r54 = back.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(95, 69).addBox(-5.0F, -4.5F, -6.0F, 10.0F, 3.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, -12.4233F, 0.0059F, 0.0873F, 0.0F, -3.1416F));

		PartDefinition cube_r55 = back.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(49, 62).addBox(-5.0F, -18.5F, -3.5F, 6.0F, 17.0F, 34.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5F, -3.8489F, 16.814F, 1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r56 = back.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(170, 124).addBox(-1.5F, -1.5F, -0.501F, 3.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, -1.5708F, -1.1345F, 1.5708F));

		PartDefinition cube_r57 = back.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(62, 124)
						.addBox(-0.5F, -0.5F, -6.499F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(170, 124)
						.addBox(-1.5F, -1.5F, -0.499F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, -1.1345F, 1.5708F));

		PartDefinition cube_r58 = back.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(95, 86).addBox(-2.0F, -3.0F, -3.0F, 5.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 1.2754F, 0.8064F, -1.5708F, 1.4835F, -1.5708F));

		PartDefinition big_left_cable = secondaryCable.addOrReplaceChild("big_left_cable", CubeListBuilder.create(),
				PartPose.offsetAndRotation(2.0F, 48.4938F, 8.8753F, 1.5708F, 1.3963F, 1.3526F));

		PartDefinition cube_r59 = big_left_cable.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(236, 177).addBox(-8.0F, -6.0F, 0.0F, 10.0F, 18.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1041F, -25.6645F, -2.6578F, 1.6217F, -0.2611F, 1.2763F));

		PartDefinition cube_r60 = big_left_cable.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(236, 177).addBox(-6.0F, -15.0F, 0.0F, 10.0F, 18.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.8431F, -22.133F, 1.9795F, 1.7724F, 0.5113F, 1.4235F));

		PartDefinition cube_r61 = big_left_cable.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(236, 177).addBox(-6.0F, -8.5F, 0.0F, 10.0F, 18.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9715F, -9.927F, 1.3797F, 0.5113F, 1.4235F));

		PartDefinition cube_r62 = big_left_cable.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(236, 195).addBox(-5.0F, -11.5F, 0.0F, 10.0F, 25.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.9715F, -9.927F, 1.5708F, 1.0908F, 1.5708F));

		PartDefinition cube_r63 = big_left_cable.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(200, 236)
						.addBox(1.5F, 4.5739F, 0.9901F, 2.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(210, 226)
						.addBox(-1.5F, 4.5739F, 1.0901F, 7.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -9.7872F, -18.7303F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r64 = big_left_cable.addOrReplaceChild("cube_r64", CubeListBuilder.create()
				.texOffs(200, 239).addBox(0.5F, -15.0951F, 4.0444F, 2.0F, 17.0F, 0.0F, new CubeDeformation(0.01F))
				.texOffs(197, 241).addBox(0.5F, 2.0049F, 4.0444F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.01F))
				.texOffs(208, 224).addBox(-3.5F, -15.0951F, 4.2444F, 9.0F, 17.0F, 9.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.0F, -10.0372F, -19.7303F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r65 = big_left_cable.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(200, 236).addBox(-0.5F, -17.883F, -1.0024F, 2.0F, 19.0F, 0.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -37.36F, -5.0842F, -0.8286F, 0.0322F, 0.0295F));

		PartDefinition cube_r66 = big_left_cable.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(210, 225).addBox(-3.5F, -17.883F, -0.9024F, 7.0F, 19.0F, 7.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -37.36F, -5.0842F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r67 = big_left_cable.addOrReplaceChild("cube_r67", CubeListBuilder.create()
				.texOffs(200, 240).addBox(-0.5F, -22.2346F, 3.8022F, 2.0F, 16.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(195, 251).addBox(-0.5F, -22.3346F, 3.9022F, 2.0F, 0.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(204, 224).addBox(-4.5F, -22.2346F, 3.9022F, 9.0F, 16.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.7872F, -21.3303F, -0.5672F, 0.0F, 0.0F));

		PartDefinition big_cable = mainCable.addOrReplaceChild("big_cable", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 67.4938F, -13.1247F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r68 = big_cable.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(242, 156).addBox(-5.5F, -11.5F, 0.0F, 7.0F, 21.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0079F, 24.5669F, 0.1129F, 0.1472F, -0.5333F, -0.1854F));

		PartDefinition cube_r69 = big_cable.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(242, 156).addBox(1.5F, -8.5F, -4.0F, 7.0F, 21.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4641F, 7.7591F, -4.6359F, 0.4783F, -0.4655F, 0.7136F));

		PartDefinition cube_r70 = big_cable.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(232, 141).addBox(-2.5F, -26.5F, 2.0F, 12.0F, 36.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -13.5F, 7.0F, -0.4331F, -0.0309F, 0.0182F));

		PartDefinition cube_r71 = big_cable.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(232, 141).addBox(-6.5F, -22.5F, 2.0F, 12.0F, 36.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -13.5F, 7.0F, -0.5219F, 0.0436F, 0.0756F));

		PartDefinition cube_r72 = big_cable.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(242, 156).addBox(-1.5F, -14.5F, 0.0F, 7.0F, 21.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5F, -13.5F, 7.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r73 = big_cable.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(236, 195).addBox(-5.0F, -9.5F, 0.0F, 10.0F, 25.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.3617F, -3.552F, 2.8844F, -0.2651F, -0.1881F, -0.1198F));

		PartDefinition cube_r74 = big_cable.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(236, 195).addBox(-5.0F, -15.4886F, 0.2615F, 10.0F, 25.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.3617F, -3.552F, 2.8844F, -0.1731F, 0.0227F, -0.1765F));

		PartDefinition cube_r75 = big_cable.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(208, 224).addBox(-2.5F, -0.4261F, 0.0901F, 9.0F, 25.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 17.7562F, -5.3753F, 0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r76 = big_cable.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(206, 222).addBox(-4.5F, -12.0951F, -0.0056F, 11.0F, 12.0F, 11.0F,
						new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(-1.0F, 17.5062F, -6.3753F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r77 = big_cable.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(200, 230)
				.addBox(-4.6F, -45.8332F, -6.0338F, 0.0F, 23.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(208, 223)
				.addBox(-4.5F, -45.8332F, -8.0338F, 9.0F, 23.0F, 9.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -21.3166F, 23.7709F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r78 = big_cable.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(200, 230)
				.addBox(-5.6F, -23.0832F, -9.0338F, 0.0F, 23.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(198, 254)
				.addBox(-5.5F, -23.1832F, -9.0338F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(206, 221)
				.addBox(-5.5F, -23.0832F, -12.0338F, 11.0F, 23.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.3166F, 23.7709F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r79 = big_cable.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(200, 234)
				.addBox(-6.6F, -23.4177F, 2.6942F, 0.0F, 19.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(197, 254)
				.addBox(-6.5F, -23.5177F, 2.6942F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(204, 220)
				.addBox(-6.5F, -23.4177F, -0.3058F, 13.0F, 23.0F, 13.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, -13.8166F, -1.7291F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r80 = big_cable.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(204, 220).addBox(-6.5F, -22.0F, 0.0F, 13.0F, 22.0F, 13.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.7562F, -9.9753F, -0.3927F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mainFolder.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}