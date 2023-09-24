package com.test.testmod.client.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class TestVillagerAnimation {

    public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(2f).looping()
            .addAnimation("bone",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.52f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(-2f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.52f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone3",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.52f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.52f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone4",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.52f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(2f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.52f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone5",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();


    public static final AnimationDefinition WALK = AnimationDefinition.Builder.withLength(2.6f).looping()
            .addAnimation("bone",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone2",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8f, KeyframeAnimations.posVec(-1f, 0f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.8f, KeyframeAnimations.posVec(-1f, 0f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(-1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone3",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6f, KeyframeAnimations.posVec(0f, 0f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8f, KeyframeAnimations.posVec(0f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.8f, KeyframeAnimations.posVec(0f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone4",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4f, KeyframeAnimations.posVec(1f, 0f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6f, KeyframeAnimations.posVec(1f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8f, KeyframeAnimations.posVec(1f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.2f, KeyframeAnimations.posVec(1f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.8f, KeyframeAnimations.posVec(1f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.4f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("bone5",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.2f, KeyframeAnimations.posVec(0f, 0f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.4f, KeyframeAnimations.posVec(0f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.6f, KeyframeAnimations.posVec(0f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.8f, KeyframeAnimations.posVec(0f, 0f, 4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.4f, KeyframeAnimations.posVec(0f, 0f, 2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.6f, KeyframeAnimations.posVec(0f, 0f, 3f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.8f, KeyframeAnimations.posVec(0f, 0f, 4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.6f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

    private TestVillagerAnimation() {
        throw new UnsupportedOperationException("Utility class");
    }
}
