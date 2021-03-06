// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    // Unchanged Constants for drivetrain
    public static final class DriveTrainConst {
        public static final int LEFT_MOTOR_PORT1 = 0;
        public static final int LEFT_MOTOR_PORT2 = 1;
        public static final int LEFT_MOTOR_PORT3 = 2;
        public static final int RIGHT_MOTOR_PORT1 = 3;
        public static final int RIGHT_MOTOR_PORT2 = 4;
        public static final int RIGHT_MOTOR_PORT3 = 5;
        public static final int[] LEFT_ENCODER_PORT = { 4, 5 };
        public static final int[] RIGHT_ENCODER_PORT = { 6, 7 };

        public static final double HIGH_SPEED_DRIVETRAIN = 1;
        public static final double MID_SPEED_DRIVETRAIN = 0.75;
        public static final double LOW_SPEED_DRIVETRAIN = 0.5;

    }

    // Unchanged Constants for Joystick Controlling
    public static final class JoystickConst {
        public static final int MAIN_STICK_PORT = 0;
        public static final int ASSIST_STICK_PORT = 1;

        public static final class MainStick {
            public static final int LEFT_DRIVETRAIN_AXIS = 1;
            public static final int RIGHT_DRIVETRAIN_AXIS = 3;
            public static final int HIGH_SPEED_DRIVETRAIN_BUTTON = 3;
            public static final int MID_SPEED_DRIVETRAIN_BUTTON = 2;
            public static final int LOW_SPEED_DRIVETRAIN_BUTTON = 1;
        }

        public static final class AssistStick {
            public static final int SUCKER_IN_BUTTON = 3;
            public static final int SUCKER_OUT_BUTTON = 5;
            public static final int SUCKER_OFF_BUTTON = 4;
            public static final int PUSH_OUT_INTAKE_BUTTON = 7;
            public static final int TAKE_BACK_INTAKE_BUTTON = 8;
            public static final int LOADING_AXIS = 1;
            public static final int SHOOTER_TRIGGER_BUTTON = 1;
            public static final int STOP_SHOOTER_BUTTON = 2;
            public static final int ADJUSTER_VER_UP_BUTTON = 9;
            public static final int ADJUSTER_VER_DOWN_BUTTON = 10;
        }
    }

    // Unchanged Constants for Intake
    public static final class IntakeConst {
        public static final int SUCKER_MOTOR_PORT = 9;
        public static final double SUCKER_IN_SPEED = 1;
        public static final double SUCKER_OUT_SPEED = 0.75;
        public static final int EXPAN_SOLEN_PORT = 6;
        public static final boolean EXPAN_SOLEN_PUSH_OUT_MODE = false;
        public static final boolean EXPAN_SOLEN_TAKE_BACK_MODE = true;
    }

    // Unchanged Constants for Loading
    public static final class LoadingConst {
        public static final int ROUTER_MOTOR_PORT1 = 7;
        public static final int ROUTER_MOTOR_PORT2 = 13;
        public static final int PRE_SHOOTING_MOTOR_PORT1 = 6;
        public static final int PRE_SHOOTING_MOTOR_PORT2 = 8;
        public static final int LOWER_DETECTOR_PORT = 8;
        public static final int MID_DETECTOR_PORT = 2;
        public static final int UPPER_DETECTOR_PORT = 9;
        public static final double PRE_SHOOTING_SPEED = 0.7;
        public static final double ROUTER_IN_SPEED = 0.7;
        public static final double ROUTER_IN_SPEED_DIFF_PERCENTAGE = 0.8;
    }

    // Unchanged Constants for Shooter
    public static final class ShooterConst {
        public static final int SHOOTER_MOTOR_PORT1 = 11;
        public static final int SHOOTER_MOTOR_PORT2 = 12;
        public static final double SHOOTER_MAX_SPEED = 0.5;
        public static final double SHOOTER_STEP_ACCELERATION = 0.0001;
        public static final double SHOOTER_MAX_ACCELERATION = 0.05;
    }

    // Unchanged Constants for Adjuster
    public static final class AdjusterConst {
        public static final int ADJUSTER_HOR_MOTOR_PORT = 10;
        public static final int ADJUSTER_VER_SOLEN_PORT = 7;
        public static final int LEFT_BOUND_LIMIT_PORT = 12;
        public static final int RIGHT_BOUND_LIMIT_PORT = 11;
        public static final double ADJUST_TO_TARGET_SPEED = 0.3;
    }

    // Unchanged Constants for Autonomous Period
    public static final class AutoConst {
        public static final double DRIVETRAIN_SPEED = 0.4;
        public static final double SUCKER_IN_SPEED = 1;
    }

}
