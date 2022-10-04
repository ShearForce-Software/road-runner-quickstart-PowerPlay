package com.example.meepmeeppathrouting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class PowerPlay1 {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(70, 70, Math.toRadians(248), Math.toRadians(180), 13.5)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(-36, 60, Math.toRadians(-90)))
                                .splineToLinearHeading(new Pose2d(-50, 12, Math.toRadians(0)), Math.toRadians(-180))
                                .turn(Math.toRadians(-25))      //deliver 1st cone sequence
                                .forward(7)
                                .waitSeconds(.75)
                                .back(7)
                                .turn(Math.toRadians(25))
                                .waitSeconds(.75)
                                .turn(Math.toRadians(-25))      //deliver 2nd cone sequence
                                .forward(7)
                                .waitSeconds(.75)
                                .back(7)
                                .turn(Math.toRadians(25))
                                .waitSeconds(.75)
                                .turn(Math.toRadians(-25))      //deliver 3rd cone sequence
                                .forward(7)
                                .waitSeconds(.75)
                                .back(7)
                                .turn(Math.toRadians(25))
                                .waitSeconds(.75)
                                .turn(Math.toRadians(-25))      //deliver 4th cone sequence
                                .forward(7)
                                .waitSeconds(.75)
                                .back(7)
                                .turn(Math.toRadians(25))
                                .waitSeconds(.75)
                                .turn(Math.toRadians(-25))      //deliver 5th cone sequence
                                .forward(7)
                                .waitSeconds(.75)
                                .back(7)
                                .turn(Math.toRadians(25))
                                .waitSeconds(.75)
                                .turn(Math.toRadians(-25))      //deliver 6th cone sequence
                                .forward(7)
                                .waitSeconds(.75)
                                .back(7)
                                .turn(Math.toRadians(25))
                                .forward(40)
                                //.splineToLinearHeading(new Pose2d(-36, 60, Math.toRadians(0)), Math.toRadians(90))
                                //.forward(15)
                                //.strafeLeft(48)

                                //.strafeLeft(1)
                                //.splineToSplineHeading(new Pose2d(-36, 60, Math.toRadians(-180)), Math.toRadians(90))
                                //.waitSeconds(1)
                                //.setReversed(true)
                                //.splineToLinearHeading(new Pose2d(-60, 60, Math.toRadians(0)), Math.toRadians(0))
                                //.waitSeconds(3)
                                //.setReversed(false)
                                //.splineTo(new Vector2d(43, 60), Math.toRadians(0))
                                //.splineToLinearHeading(new Pose2d(-12,40, Math.toRadians(-90)), Math.toRadians(-90))
                                //.splineToLinearHeading(new Pose2d(-60,35, Math.toRadians(0)), Math.toRadians(0))
                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}