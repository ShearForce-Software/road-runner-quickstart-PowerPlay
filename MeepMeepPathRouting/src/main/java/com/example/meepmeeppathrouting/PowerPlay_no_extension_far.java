package com.example.meepmeeppathrouting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class PowerPlay_no_extension_far {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(248), Math.toRadians(180), 13.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, 60, Math.toRadians(-90)))
                                .splineToLinearHeading(new Pose2d(-50, 12, Math.toRadians(0)), Math.toRadians(-180))
                                //1st cone
                                .splineToSplineHeading(new Pose2d(-8, 16, Math.toRadians(45)), Math.toRadians(45))
                                .waitSeconds(.75)
                                .setReversed(true)
                                .splineToSplineHeading(new Pose2d(-58, 12, Math.toRadians(0)), Math.toRadians(-180))
                                .waitSeconds(.75)
                                .setReversed(false)
                                //2nd cone
                                .splineToSplineHeading(new Pose2d(-8, 16, Math.toRadians(45)), Math.toRadians(45))
                                .waitSeconds(.75)
                                .setReversed(true)
                                .splineToSplineHeading(new Pose2d(-58, 12, Math.toRadians(0)), Math.toRadians(-180))
                                .waitSeconds(.75)
                                .setReversed(false)
                                //3rd cone
                                .splineToSplineHeading(new Pose2d(-8, 16, Math.toRadians(45)), Math.toRadians(45))
                                .waitSeconds(.75)
                                .setReversed(true)
                                .splineToSplineHeading(new Pose2d(-58, 12, Math.toRadians(0)), Math.toRadians(-180))
                                .waitSeconds(.75)
                                .setReversed(false)
                                //4th cone
                                .splineToSplineHeading(new Pose2d(-8, 16, Math.toRadians(45)), Math.toRadians(45))
                                .waitSeconds(.75)
                                .setReversed(true)
                                .splineToSplineHeading(new Pose2d(-58, 12, Math.toRadians(0)), Math.toRadians(-180))
                                .waitSeconds(.75)
                                .setReversed(false)
                                //5th cone
                                .splineToSplineHeading(new Pose2d(-8, 16, Math.toRadians(45)), Math.toRadians(45))
                                .waitSeconds(.75)
                                .setReversed(true)
                                .splineToSplineHeading(new Pose2d(-58, 12, Math.toRadians(0)), Math.toRadians(-180))
                                .waitSeconds(.75)
                                .setReversed(false)
                                //6th cone
                                .splineToSplineHeading(new Pose2d(-8, 16, Math.toRadians(45)), Math.toRadians(45))
                                //.waitSeconds(.75)
                                //.setReversed(true)
                                //.splineToLinearHeading(new Pose2d(-58, 12, Math.toRadians(0)), Math.toRadians(-180))
                                //.forward(48)
                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}