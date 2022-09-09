// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    public static final class VisionConstants {
        public static double goalHeightInches = 60.0; //hight of the target from the flore
        public static double limelightMountAngleDegrees = 25.0; //guess
        public static double limelightLensHeightInches = 20.0; //how high the lens is from the floor
        public static final double kAzimuthalAngle = 1.0; // Degree azimuthal offset of limelight

      }
}
