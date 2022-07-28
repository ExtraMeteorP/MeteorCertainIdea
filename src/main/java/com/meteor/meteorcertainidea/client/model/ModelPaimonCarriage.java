package com.meteor.meteorcertainidea.client.model;

import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ModelPaimonCarriage<T extends Entity> extends EntityModel<T> {

    private final ModelPart paimonFR;
    private final ModelPart paimonFR2;
    private final ModelPart paimonFL;
    private final ModelPart paimonBL;
    private final ModelPart jiaozi;

    public ModelPaimonCarriage(ModelPart root) {
        this.paimonFR = root.getChild("paimonFR");
        this.paimonFR2 = root.getChild("paimonFR2");
        this.paimonFL = root.getChild("paimonFL");
        this.paimonBL = root.getChild("paimonBL");
        this.jiaozi = root.getChild("jiaozi");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition paimonFR = partdefinition.addOrReplaceChild("paimonFR", CubeListBuilder.create(), PartPose.offset(-18.0F, 24.0F, -15.0F));

        PartDefinition body = paimonFR.addOrReplaceChild("body", CubeListBuilder.create().texOffs(52, 0).addBox(-2.5F, -2.2152F, -5.694F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(68, 71).addBox(1.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(-3.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.9F, 0.2182F, 0.0F, 0.0F));

        PartDefinition arms = body.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3F, -1.9F));

        PartDefinition bone8 = arms.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(39, 96).addBox(-0.9954F, 0.5028F, -3.6789F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 98).addBox(-0.4954F, 4.5028F, -4.1789F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.75F, 0.75F, 0.0F, 0.0F, -2.1817F));

        PartDefinition bone9 = arms.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(18, 98).addBox(-1.6132F, 3.8416F, -4.4289F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 71).addBox(-1.1132F, -0.1584F, -3.9289F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -8.0F, 1.0F, 0.0F, 0.0F, 0.7418F));

        PartDefinition legs = body.addOrReplaceChild("legs", CubeListBuilder.create().texOffs(30, 71).addBox(-2.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 98).addBox(-2.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(5, 98).addBox(1.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 71).addBox(0.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0841F, -1.0151F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone7 = body.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(30, 79).addBox(-2.0F, -8.6493F, -0.5289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 96).addBox(-3.0F, -7.6493F, -1.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 96).addBox(-2.0F, -5.2493F, 0.6711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 82).addBox(-3.0F, -3.6493F, 0.7711F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(97, 84).addBox(-1.5F, -3.1493F, 1.5711F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(-0.7F, -2.2493F, 2.0711F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 53).addBox(-1.3F, 0.3507F, 1.3711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(-1.1F, -0.6493F, 1.7711F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(47, 96).addBox(-1.75F, -4.2493F, 1.2711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 60).addBox(-3.0F, -5.6493F, 0.0711F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(3.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(-4.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 62).addBox(2.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 62).addBox(-3.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 80).addBox(-2.5F, -6.6493F, 0.0711F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(85, 94).addBox(-3.0F, -7.6493F, -0.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 92).addBox(-3.0F, -7.6493F, -4.0289F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 79).addBox(-2.0F, -8.6493F, -4.9289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 93).addBox(2.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(95, 88).addBox(-3.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.8341F, -1.5151F));

        PartDefinition cube_r1 = bone7.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(67, 90).addBox(-4.3566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 55).addBox(-4.9566F, -1.6468F, 0.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 64).addBox(-4.9566F, -3.5468F, -0.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 11).addBox(-5.1566F, -2.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 13).addBox(-4.3566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 15).addBox(-3.3566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 64).addBox(-5.5566F, -0.1468F, 0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 0).addBox(-4.5566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 2).addBox(-4.1566F, -1.6468F, 0.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 12).addBox(-3.1566F, -1.6468F, 1.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r2 = bone7.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(96, 46).addBox(1.4566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 63).addBox(2.4566F, -0.6468F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 51).addBox(3.4566F, -1.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 14).addBox(3.2566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 50).addBox(3.9566F, -1.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 52).addBox(4.2566F, -2.6468F, -0.1789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(3.8566F, -4.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(4.0566F, -3.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 71).addBox(3.4566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 71).addBox(2.4566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r3 = bone7.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(36, 14).addBox(-0.5848F, -1.6438F, -3.4289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, -4.2F, 2.85F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r4 = bone7.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 63).addBox(1.9F, 0.3507F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition head = paimonFR.addOrReplaceChild("head", CubeListBuilder.create().texOffs(25, 86).addBox(-3.0F, -13.0F, -5.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-0.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(45, 2).addBox(-1.6F, -1.1F, -0.3F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -15.5F, -7.0F, 0.0F, -0.1309F, -0.3927F));

        PartDefinition blink = head.addOrReplaceChild("blink", CubeListBuilder.create().texOffs(6, 1).addBox(3.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(6, 0).addBox(-4.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(36, 20).addBox(-3.0F, -13.0F, -5.6F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone6 = head.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.8322F, -5.4044F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 61).addBox(2.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-3.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 54).addBox(-3.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 52).addBox(2.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(1.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 76).addBox(-2.5F, 0.1678F, 0.5956F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 60).addBox(-2.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 97).addBox(3.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(89, 96).addBox(-4.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.3167F, 0.05F, -0.2531F, 0.0F, 0.0F));

        PartDefinition bone5 = head.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(50, 82).addBox(-3.0F, -17.0F, -6.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 59).addBox(-5.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(6.0F, -13.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 2).addBox(7.0F, -12.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 90).addBox(5.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(-6.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(11, 90).addBox(-6.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 55).addBox(3.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(3.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 46).addBox(-4.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-5.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-5.0F, -15.0F, -6.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(47, 90).addBox(-4.0F, -13.0F, 0.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 90).addBox(-4.0F, -15.0F, 1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 33).addBox(-4.0F, -14.0F, 2.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(82, 92).addBox(-3.0F, -15.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 86).addBox(-3.0F, -8.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 82).addBox(-3.0F, -16.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 15).addBox(4.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(3.0F, -10.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 33).addBox(-4.0F, -10.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(-5.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 30).addBox(-4.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 16).addBox(3.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 63).addBox(-3.0F, -16.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(-4.0F, -15.0F, -7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(0.0F, -12.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 33).addBox(4.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(43, 27).addBox(-5.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(2.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(-5.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(4.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(5.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 14).addBox(5.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(13, 53).addBox(-5.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 88).addBox(-6.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(81, 96).addBox(-6.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(13, 50).addBox(-6.0F, -8.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 14).addBox(-6.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-7.0F, -13.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 10).addBox(-8.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 8).addBox(-7.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 8).addBox(-6.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(3.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(-5.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-4.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(8, 5).addBox(4.0F, -9.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 0).addBox(2.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 53).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 46).addBox(-5.0F, -14.0F, -7.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 0).addBox(3.0F, -8.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 10).addBox(4.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 8).addBox(4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 27).addBox(3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 25).addBox(3.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 93).addBox(5.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(36, 30).addBox(5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(-6.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 17).addBox(3.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 36).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(3.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 67).addBox(-4.0F, -7.0F, 1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(39, 44).addBox(3.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 46).addBox(-5.0F, -8.0F, 1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(76, 86).addBox(-5.0F, -13.0F, 1.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(3.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 36).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 14).addBox(-5.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 44).addBox(-5.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(-6.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(7, 27).addBox(-4.0F, -8.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 20).addBox(-5.0F, -9.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 30).addBox(-3.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition paimonFR2 = partdefinition.addOrReplaceChild("paimonFR2", CubeListBuilder.create(), PartPose.offset(-17.0F, 24.0F, 14.0F));

        PartDefinition body2 = paimonFR2.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(52, 0).addBox(-2.5F, -2.2152F, -5.694F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(68, 71).addBox(1.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(-3.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.9F, 0.2182F, 0.0F, 0.0F));

        PartDefinition arms2 = body2.addOrReplaceChild("arms2", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3F, -1.9F));

        PartDefinition bone2 = arms2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(39, 96).addBox(-0.9954F, 0.5028F, -3.6789F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 98).addBox(-0.4954F, 4.5028F, -4.1789F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.75F, 0.75F, 0.0F, 0.0F, -2.1817F));

        PartDefinition bone3 = arms2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(18, 98).addBox(-1.6132F, 3.8416F, -4.4289F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 71).addBox(-1.1132F, -0.1584F, -3.9289F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -8.0F, 1.0F, 0.0F, 0.0F, 0.7418F));

        PartDefinition legs2 = body2.addOrReplaceChild("legs2", CubeListBuilder.create().texOffs(30, 71).addBox(-2.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 98).addBox(-2.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(5, 98).addBox(1.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 71).addBox(0.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0841F, -1.0151F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone4 = body2.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(30, 79).addBox(-2.0F, -8.6493F, -0.5289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 96).addBox(-3.0F, -7.6493F, -1.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 96).addBox(-2.0F, -5.2493F, 0.6711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 82).addBox(-3.0F, -3.6493F, 0.7711F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(97, 84).addBox(-1.5F, -3.1493F, 1.5711F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(-0.7F, -2.2493F, 2.0711F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 53).addBox(-1.3F, 0.3507F, 1.3711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(-1.1F, -0.6493F, 1.7711F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(47, 96).addBox(-1.75F, -4.2493F, 1.2711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 60).addBox(-3.0F, -5.6493F, 0.0711F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(3.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(-4.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 62).addBox(2.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 62).addBox(-3.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 80).addBox(-2.5F, -6.6493F, 0.0711F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(85, 94).addBox(-3.0F, -7.6493F, -0.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 92).addBox(-3.0F, -7.6493F, -4.0289F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 79).addBox(-2.0F, -8.6493F, -4.9289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 93).addBox(2.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(95, 88).addBox(-3.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.8341F, -1.5151F));

        PartDefinition cube_r6 = bone4.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 90).addBox(-4.3566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 55).addBox(-4.9566F, -1.6468F, 0.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 64).addBox(-4.9566F, -3.5468F, -0.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 11).addBox(-5.1566F, -2.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 13).addBox(-4.3566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 15).addBox(-3.3566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 64).addBox(-5.5566F, -0.1468F, 0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 0).addBox(-4.5566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 2).addBox(-4.1566F, -1.6468F, 0.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 12).addBox(-3.1566F, -1.6468F, 1.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r7 = bone4.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(96, 46).addBox(1.4566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 63).addBox(2.4566F, -0.6468F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 51).addBox(3.4566F, -1.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 14).addBox(3.2566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 50).addBox(3.9566F, -1.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 52).addBox(4.2566F, -2.6468F, -0.1789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(3.8566F, -4.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(4.0566F, -3.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 71).addBox(3.4566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 71).addBox(2.4566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r8 = bone4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 14).addBox(-0.5848F, -1.6438F, -3.4289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, -4.2F, 2.85F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r9 = bone4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 63).addBox(1.9F, 0.3507F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition head2 = paimonFR2.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(25, 86).addBox(-3.0F, -13.0F, -5.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r10 = head2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-0.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(45, 2).addBox(-1.6F, -1.1F, -0.3F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -15.5F, -7.0F, 0.0F, -0.1309F, -0.3927F));

        PartDefinition blink2 = head2.addOrReplaceChild("blink2", CubeListBuilder.create().texOffs(6, 1).addBox(3.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(6, 0).addBox(-4.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(36, 20).addBox(-3.0F, -13.0F, -5.6F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone10 = head2.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.8322F, -5.4044F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 61).addBox(2.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-3.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 54).addBox(-3.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 52).addBox(2.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(1.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 76).addBox(-2.5F, 0.1678F, 0.5956F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 60).addBox(-2.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 97).addBox(3.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(89, 96).addBox(-4.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.3167F, 0.05F, -0.2531F, 0.0F, 0.0F));

        PartDefinition bone11 = head2.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(50, 82).addBox(-3.0F, -17.0F, -6.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 59).addBox(-5.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(6.0F, -13.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 2).addBox(7.0F, -12.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 90).addBox(5.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(-6.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(11, 90).addBox(-6.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 55).addBox(3.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(3.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 46).addBox(-4.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-5.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-5.0F, -15.0F, -6.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(47, 90).addBox(-4.0F, -13.0F, 0.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 90).addBox(-4.0F, -15.0F, 1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 33).addBox(-4.0F, -14.0F, 2.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(82, 92).addBox(-3.0F, -15.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 86).addBox(-3.0F, -8.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 82).addBox(-3.0F, -16.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 15).addBox(4.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(3.0F, -10.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 33).addBox(-4.0F, -10.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(-5.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 30).addBox(-4.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 16).addBox(3.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 63).addBox(-3.0F, -16.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(-4.0F, -15.0F, -7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(0.0F, -12.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 33).addBox(4.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(43, 27).addBox(-5.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(2.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(-5.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(4.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(5.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 14).addBox(5.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(13, 53).addBox(-5.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 88).addBox(-6.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(81, 96).addBox(-6.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(13, 50).addBox(-6.0F, -8.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 14).addBox(-6.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-7.0F, -13.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 10).addBox(-8.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 8).addBox(-7.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 8).addBox(-6.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(3.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(-5.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-4.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(8, 5).addBox(4.0F, -9.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 0).addBox(2.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 53).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 46).addBox(-5.0F, -14.0F, -7.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 0).addBox(3.0F, -8.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 10).addBox(4.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 8).addBox(4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 27).addBox(3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 25).addBox(3.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 93).addBox(5.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(36, 30).addBox(5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(-6.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 17).addBox(3.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 36).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(3.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 67).addBox(-4.0F, -7.0F, 1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(39, 44).addBox(3.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 46).addBox(-5.0F, -8.0F, 1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(76, 86).addBox(-5.0F, -13.0F, 1.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(3.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 36).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 14).addBox(-5.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 44).addBox(-5.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(-6.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(7, 27).addBox(-4.0F, -8.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 20).addBox(-5.0F, -9.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 30).addBox(-3.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition paimonFL = partdefinition.addOrReplaceChild("paimonFL", CubeListBuilder.create(), PartPose.offset(17.0F, 24.0F, -16.0F));

        PartDefinition body3 = paimonFL.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(52, 0).addBox(-2.5F, -2.2152F, -5.694F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(68, 71).addBox(1.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(-3.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.9F, 0.2182F, 0.0F, 0.0F));

        PartDefinition arms3 = body3.addOrReplaceChild("arms3", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3F, -1.9F));

        PartDefinition bone12 = arms3.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(39, 96).addBox(-1.0886F, -0.3484F, -3.6789F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 98).addBox(-0.5886F, 3.6516F, -4.1789F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.75F, 0.75F, 0.0F, 0.0F, -0.7418F));

        PartDefinition bone13 = arms3.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(18, 98).addBox(-1.7064F, 4.6927F, -4.4289F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 71).addBox(-1.2064F, 0.6927F, -3.9289F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -8.0F, 1.0F, 0.0F, 0.0F, 2.1817F));

        PartDefinition legs3 = body3.addOrReplaceChild("legs3", CubeListBuilder.create().texOffs(30, 71).addBox(-2.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 98).addBox(-2.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(5, 98).addBox(1.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 71).addBox(0.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0841F, -1.0151F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone14 = body3.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(30, 79).addBox(-2.0F, -8.6493F, -0.5289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 96).addBox(-3.0F, -7.6493F, -1.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 96).addBox(-2.0F, -5.2493F, 0.6711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 82).addBox(-3.0F, -3.6493F, 0.7711F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(97, 84).addBox(-1.5F, -3.1493F, 1.5711F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(-0.7F, -2.2493F, 2.0711F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 53).addBox(-1.3F, 0.3507F, 1.3711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(-1.1F, -0.6493F, 1.7711F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(47, 96).addBox(-1.75F, -4.2493F, 1.2711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 60).addBox(-3.0F, -5.6493F, 0.0711F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(3.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(-4.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 62).addBox(2.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 62).addBox(-3.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 80).addBox(-2.5F, -6.6493F, 0.0711F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(85, 94).addBox(-3.0F, -7.6493F, -0.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 92).addBox(-3.0F, -7.6493F, -4.0289F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 79).addBox(-2.0F, -8.6493F, -4.9289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 93).addBox(2.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(95, 88).addBox(-3.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.8341F, -1.5151F));

        PartDefinition cube_r11 = bone14.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(67, 90).addBox(-4.3566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 55).addBox(-4.9566F, -1.6468F, 0.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 64).addBox(-4.9566F, -3.5468F, -0.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 11).addBox(-5.1566F, -2.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 13).addBox(-4.3566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 15).addBox(-3.3566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 64).addBox(-5.5566F, -0.1468F, 0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 0).addBox(-4.5566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 2).addBox(-4.1566F, -1.6468F, 0.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 12).addBox(-3.1566F, -1.6468F, 1.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r12 = bone14.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(96, 46).addBox(1.4566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 63).addBox(2.4566F, -0.6468F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 51).addBox(3.4566F, -1.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 14).addBox(3.2566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 50).addBox(3.9566F, -1.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 52).addBox(4.2566F, -2.6468F, -0.1789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(3.8566F, -4.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(4.0566F, -3.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 71).addBox(3.4566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 71).addBox(2.4566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r13 = bone14.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 14).addBox(-0.5848F, -1.6438F, -3.4289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, -4.2F, 2.85F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r14 = bone14.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 63).addBox(1.9F, 0.3507F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition head3 = paimonFL.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(25, 86).addBox(-3.0F, -13.0F, -5.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r15 = head3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-0.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(45, 2).addBox(-1.6F, -1.1F, -0.3F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -15.5F, -7.0F, 0.0F, -0.1309F, -0.3927F));

        PartDefinition blink3 = head3.addOrReplaceChild("blink3", CubeListBuilder.create().texOffs(6, 1).addBox(3.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(6, 0).addBox(-4.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(36, 20).addBox(-3.0F, -13.0F, -5.6F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone15 = head3.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.8322F, -5.4044F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 61).addBox(2.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-3.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 54).addBox(-3.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 52).addBox(2.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(1.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 76).addBox(-2.5F, 0.1678F, 0.5956F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 60).addBox(-2.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 97).addBox(3.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(89, 96).addBox(-4.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.3167F, 0.05F, -0.2531F, 0.0F, 0.0F));

        PartDefinition bone16 = head3.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(50, 82).addBox(-3.0F, -17.0F, -6.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 59).addBox(-5.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(6.0F, -13.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 2).addBox(7.0F, -12.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 90).addBox(5.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(-6.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(11, 90).addBox(-6.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 55).addBox(3.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(3.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 46).addBox(-4.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-5.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-5.0F, -15.0F, -6.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(47, 90).addBox(-4.0F, -13.0F, 0.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 90).addBox(-4.0F, -15.0F, 1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 33).addBox(-4.0F, -14.0F, 2.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(82, 92).addBox(-3.0F, -15.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 86).addBox(-3.0F, -8.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 82).addBox(-3.0F, -16.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 15).addBox(4.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(3.0F, -10.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 33).addBox(-4.0F, -10.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(-5.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 30).addBox(-4.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 16).addBox(3.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 63).addBox(-3.0F, -16.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(-4.0F, -15.0F, -7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(0.0F, -12.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 33).addBox(4.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(43, 27).addBox(-5.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(2.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(-5.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(4.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(5.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 14).addBox(5.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(13, 53).addBox(-5.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 88).addBox(-6.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(81, 96).addBox(-6.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(13, 50).addBox(-6.0F, -8.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 14).addBox(-6.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-7.0F, -13.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 10).addBox(-8.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 8).addBox(-7.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 8).addBox(-6.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(3.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(-5.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-4.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(8, 5).addBox(4.0F, -9.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 0).addBox(2.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 53).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 46).addBox(-5.0F, -14.0F, -7.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 0).addBox(3.0F, -8.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 10).addBox(4.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 8).addBox(4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 27).addBox(3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 25).addBox(3.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 93).addBox(5.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(36, 30).addBox(5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(-6.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 17).addBox(3.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 36).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(3.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 67).addBox(-4.0F, -7.0F, 1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(39, 44).addBox(3.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 46).addBox(-5.0F, -8.0F, 1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(76, 86).addBox(-5.0F, -13.0F, 1.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(3.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 36).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 14).addBox(-5.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 44).addBox(-5.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(-6.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(7, 27).addBox(-4.0F, -8.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 20).addBox(-5.0F, -9.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 30).addBox(-3.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition paimonBL = partdefinition.addOrReplaceChild("paimonBL", CubeListBuilder.create(), PartPose.offset(17.0F, 24.0F, 14.0F));

        PartDefinition body4 = paimonBL.addOrReplaceChild("body4", CubeListBuilder.create().texOffs(52, 0).addBox(-2.5F, -2.2152F, -5.694F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(68, 71).addBox(1.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(-3.0F, 4.3848F, -6.194F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -7.3F, 0.9F, 0.2182F, 0.0F, 0.0F));

        PartDefinition arms4 = body4.addOrReplaceChild("arms4", CubeListBuilder.create(), PartPose.offset(0.0F, 7.3F, -1.9F));

        PartDefinition bone17 = arms4.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(39, 96).addBox(-1.0886F, -0.3484F, -3.6789F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 98).addBox(-0.5886F, 3.6516F, -4.1789F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -7.75F, 0.75F, 0.0F, 0.0F, -0.7418F));

        PartDefinition bone18 = arms4.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(18, 98).addBox(-1.7064F, 4.6927F, -4.4289F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 71).addBox(-1.2064F, 0.6927F, -3.9289F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -8.0F, 1.0F, 0.0F, 0.0F, 2.1817F));

        PartDefinition legs4 = body4.addOrReplaceChild("legs4", CubeListBuilder.create().texOffs(30, 71).addBox(-2.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 98).addBox(-2.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(5, 98).addBox(1.75F, 0.5293F, -3.7075F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 71).addBox(0.25F, -2.9707F, -3.2075F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0841F, -1.0151F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone19 = body4.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(30, 79).addBox(-2.0F, -8.6493F, -0.5289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 96).addBox(-3.0F, -7.6493F, -1.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 96).addBox(-2.0F, -5.2493F, 0.6711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 82).addBox(-3.0F, -3.6493F, 0.7711F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(97, 84).addBox(-1.5F, -3.1493F, 1.5711F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(-0.7F, -2.2493F, 2.0711F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 53).addBox(-1.3F, 0.3507F, 1.3711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(-1.1F, -0.6493F, 1.7711F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(47, 96).addBox(-1.75F, -4.2493F, 1.2711F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 60).addBox(-3.0F, -5.6493F, 0.0711F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(3.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(-4.0F, -5.6493F, -0.1789F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 62).addBox(2.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 62).addBox(-3.5F, -6.6493F, -0.5289F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 80).addBox(-2.5F, -6.6493F, 0.0711F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(85, 94).addBox(-3.0F, -7.6493F, -0.0289F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 92).addBox(-3.0F, -7.6493F, -4.0289F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 79).addBox(-2.0F, -8.6493F, -4.9289F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 93).addBox(2.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(95, 88).addBox(-3.0F, -8.6493F, -4.2289F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.8341F, -1.5151F));

        PartDefinition cube_r16 = bone19.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(67, 90).addBox(-4.3566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 55).addBox(-4.9566F, -1.6468F, 0.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 64).addBox(-4.9566F, -3.5468F, -0.0789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 11).addBox(-5.1566F, -2.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 13).addBox(-4.3566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 15).addBox(-3.3566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 64).addBox(-5.5566F, -0.1468F, 0.1211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 0).addBox(-4.5566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(66, 2).addBox(-4.1566F, -1.6468F, 0.9211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 12).addBox(-3.1566F, -1.6468F, 1.4211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

        PartDefinition cube_r17 = bone19.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(96, 46).addBox(1.4566F, -3.6468F, 0.3211F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 63).addBox(2.4566F, -0.6468F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 51).addBox(3.4566F, -1.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(67, 14).addBox(3.2566F, -0.6468F, 0.6211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 50).addBox(3.9566F, -1.6468F, 0.3211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 52).addBox(4.2566F, -2.6468F, -0.1789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(3.8566F, -4.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 54).addBox(4.0566F, -3.6468F, -0.4789F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 71).addBox(3.4566F, -2.6468F, 0.8211F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 71).addBox(2.4566F, -2.6468F, 1.0711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r18 = bone19.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(36, 14).addBox(-0.5848F, -1.6438F, -3.4289F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.8F, -4.2F, 2.85F, 0.0F, 0.0F, 0.1309F));

        PartDefinition cube_r19 = bone19.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 63).addBox(1.9F, 0.3507F, 1.4711F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition head4 = paimonBL.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(25, 86).addBox(-3.0F, -13.0F, -5.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r20 = head4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 0).addBox(-2.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 1).addBox(-0.6F, -0.35F, -0.3F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(45, 2).addBox(-1.6F, -1.1F, -0.3F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -15.5F, -7.0F, 0.0F, -0.1309F, -0.3927F));

        PartDefinition blink4 = head4.addOrReplaceChild("blink4", CubeListBuilder.create().texOffs(6, 1).addBox(3.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(6, 0).addBox(-4.0F, -11.0F, -5.6F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(36, 20).addBox(-3.0F, -13.0F, -5.6F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone20 = head4.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, -0.8322F, -5.4044F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 61).addBox(2.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-3.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 54).addBox(-3.5F, 0.1678F, -4.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 52).addBox(2.5F, 0.1678F, -0.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(1.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 76).addBox(-2.5F, 0.1678F, 0.5956F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 60).addBox(-2.5F, 0.1678F, -5.4044F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 97).addBox(3.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(89, 96).addBox(-4.5F, 0.1678F, -3.4044F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -19.3167F, 0.05F, -0.2531F, 0.0F, 0.0F));

        PartDefinition bone21 = head4.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(50, 82).addBox(-3.0F, -17.0F, -6.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 59).addBox(-5.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(6.0F, -13.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 2).addBox(7.0F, -12.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 90).addBox(5.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(60, 50).addBox(-6.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(11, 90).addBox(-6.0F, -11.0F, -6.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(13, 55).addBox(3.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(3.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 46).addBox(-4.0F, -11.0F, -5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-5.0F, -12.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-5.0F, -15.0F, -6.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(47, 90).addBox(-4.0F, -13.0F, 0.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 90).addBox(-4.0F, -15.0F, 1.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 33).addBox(-4.0F, -14.0F, 2.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(82, 92).addBox(-3.0F, -15.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 86).addBox(-3.0F, -8.0F, 2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 82).addBox(-3.0F, -16.0F, 1.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 15).addBox(4.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(3.0F, -10.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 33).addBox(-4.0F, -10.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(-5.0F, -13.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 30).addBox(-4.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 16).addBox(3.0F, -13.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 63).addBox(-3.0F, -16.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(-4.0F, -15.0F, -7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(0.0F, -12.0F, -7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 33).addBox(4.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(43, 27).addBox(-5.0F, -13.0F, 1.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(2.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(-5.0F, -14.0F, -6.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 27).addBox(4.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(5.0F, -14.0F, -6.0F, 1.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(36, 14).addBox(5.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(13, 53).addBox(-5.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 88).addBox(-6.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(81, 96).addBox(-6.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(13, 50).addBox(-6.0F, -8.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 14).addBox(-6.0F, -7.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-7.0F, -13.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(43, 10).addBox(-8.0F, -12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 8).addBox(-7.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 8).addBox(-6.0F, -15.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(3.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 27).addBox(-5.0F, -16.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-4.0F, -17.0F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(8, 5).addBox(4.0F, -9.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(43, 0).addBox(2.0F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 53).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 46).addBox(-5.0F, -14.0F, -7.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 0).addBox(3.0F, -8.0F, -6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 10).addBox(4.0F, -10.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 8).addBox(4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 27).addBox(3.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 25).addBox(3.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 93).addBox(5.0F, -9.0F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(36, 30).addBox(5.0F, -8.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 50).addBox(5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(-6.0F, -9.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 17).addBox(3.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 36).addBox(-4.0F, -6.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 23).addBox(3.0F, -7.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 67).addBox(-4.0F, -7.0F, 1.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(39, 44).addBox(3.0F, -8.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 46).addBox(-5.0F, -8.0F, 1.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(76, 86).addBox(-5.0F, -13.0F, 1.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 11).addBox(3.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 36).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 14).addBox(-5.0F, -9.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 44).addBox(-5.0F, -8.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 40).addBox(-6.0F, -10.0F, -5.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(7, 27).addBox(-4.0F, -8.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 20).addBox(-5.0F, -9.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 30).addBox(-3.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition jiaozi = partdefinition.addOrReplaceChild("jiaozi", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -12.0F, -27.0F, 2.0F, 2.0F, 48.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(10.0F, -12.0F, -27.0F, 2.0F, 2.0F, 48.0F, new CubeDeformation(0.0F))
                .texOffs(52, 42).addBox(-16.0F, -13.0F, -11.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 42).addBox(-16.0F, -13.0F, 4.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(52, 0).addBox(-9.0F, -17.0F, -12.0F, 18.0F, 4.0F, 19.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -33.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(0, 0).addBox(-8.0F, -33.0F, -11.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(0, 0).addBox(6.0F, -33.0F, -11.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(0, 0).addBox(6.0F, -33.0F, 4.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(37, 0).addBox(-1.0F, -23.0F, 4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(37, 0).addBox(-8.0F, -23.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(37, 0).addBox(6.0F, -23.0F, -3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(37, 0).addBox(2.0F, -23.0F, -11.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(37, 0).addBox(-4.0F, -23.0F, -11.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(39, 40).addBox(-6.0F, -22.0F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(39, 40).addBox(4.0F, -22.0F, -11.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(27, 71).addBox(-8.0F, -22.0F, -9.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(27, 71).addBox(6.0F, -22.0F, -9.0F, 2.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(69, 82).addBox(-6.0F, -22.0F, 4.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition head5 = jiaozi.addOrReplaceChild("head5", CubeListBuilder.create().texOffs(0, 50).addBox(-10.0F, -30.0F, -12.0F, 20.0F, 1.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(4, 52).addBox(-9.0F, -31.0F, -11.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(7, 54).addBox(-8.0F, -32.0F, -10.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(13, 56).addBox(-7.0F, -33.0F, -9.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(17, 58).addBox(-6.0F, -34.0F, -8.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(20, 60).addBox(-5.0F, -35.0F, -7.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(24, 62).addBox(-4.0F, -36.0F, -6.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-6.0F, -13.0F, -9.0F, 12.0F, 0.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offset(0.0F, -4.0F, 0.0F));

        PartDefinition bone22 = head5.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(44, 80).addBox(2.1213F, -0.5F, -2.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(4.1213F, -3.5F, -2.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(9.0F, -29.0F, -8.0F, -0.7854F, 0.7854F, -0.7854F));

        PartDefinition bone = head5.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(44, 80).addBox(2.1213F, -0.5F, 0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(35, 63).addBox(4.1213F, -3.5F, 0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-8.0F, -29.0F, -8.0F, -2.3562F, 0.7854F, -2.3562F));

        PartDefinition bone24 = head5.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(44, 80).addBox(-2.1213F, -3.5F, 0.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(34, 63).addBox(-0.1213F, -6.5F, 0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-8.0F, -29.0F, 10.0F, 2.3562F, -0.7854F, -2.3562F));

        PartDefinition bone23 = head5.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(44, 80).addBox(-2.1213F, -3.5F, -2.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(33, 61).addBox(-0.1213F, -6.5F, -2.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(9.0F, -29.0F, 10.0F, 0.7854F, -0.7854F, -0.7854F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.paimonFR.getChild("head").getChild("blink").visible = entity.tickCount % 40 >= 2 && entity.tickCount % 40 <= 5;
        this.paimonFR2.getChild("head2").getChild("blink2").visible = entity.tickCount % 50 >= 4 && entity.tickCount % 50 <= 7;
        this.paimonFL.getChild("head3").getChild("blink3").visible = entity.tickCount % 45 >= 6 && entity.tickCount % 45 <= 9;
        this.paimonBL.getChild("head4").getChild("blink4").visible = entity.tickCount % 55 >= 12 && entity.tickCount % 55 <= 15;

        this.paimonFR.getChild("body").getChild("arms").getChild("bone9").zRot = (float) Math.toRadians(42.5F - 4F*Math.sin(entity.tickCount*0.1F));
        this.paimonFR2.getChild("body2").getChild("arms2").getChild("bone3").zRot = (float) Math.toRadians(42.5F - 4F*Math.sin(entity.tickCount*0.1F));
        this.paimonFL.getChild("body3").getChild("arms3").getChild("bone12").zRot = (float) Math.toRadians(-42.5F + 4F*Math.sin(entity.tickCount*0.1F));
        this.paimonBL.getChild("body4").getChild("arms4").getChild("bone17").zRot = (float) Math.toRadians(-42.5F + 4F*Math.sin(entity.tickCount*0.1F));
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        paimonFR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        paimonFR2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        paimonFL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        paimonBL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        jiaozi.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
