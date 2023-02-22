// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldiscouragement_redirection_cube<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "discouragement_redirection_cube"), "main");
	private final ModelPart bone;

	public Modeldiscouragement_redirection_cube(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.5F, -13.5F, -5.5F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-5.0F, -13.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(-5.5F, -13.5F, -5.5F, 11.0F, 11.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 26.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}