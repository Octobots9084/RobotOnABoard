// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.Matrix;
import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.numbers.N1;
import edu.wpi.first.math.numbers.N3;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int kDriverControllerPort = 0;
    
    public static final String cam1 = "cam1";
    public static final AprilTagFieldLayout kTagLayout = AprilTagFieldLayout.loadField(AprilTagFields.k2026RebuiltWelded);

    public static final Matrix<N3, N1> kSingleTagStdDevs = VecBuilder.fill(4, 4, 8);
    public static final Matrix<N3, N1> kMultiTagStdDevs = VecBuilder.fill(0.5, 0.5, 1);
    public static final Matrix<N3, N1> kMultiTagHubStdDevs = VecBuilder.fill(0.3, 0.3, 0.6);
 
  public static final Transform3d robotToCam1 = new Transform3d(new Translation3d(-0.28,-0.135,0.24),
      new Rotation3d(0, 0, (30/180.0)*Math.PI + Math.PI));
      
  public static boolean isBlueAlliance = true;
  
  public static final double maxTelopVelocity = 1;// TODO
  public static final double maxTelopAngularVelocity = 1;// TODO
  public static final double leftYDeadband = 0.1;// TODO
  public static final double leftXDeadband = 0.1;// TODO
  public static final double rightXDeadband = 0.15;// TODO
  public static final double rightYDeadband = 0.15;
  public static final double maxAngularVelocity = 6;// TODO
  public static final double maxVelocity = 3.75;// TODO
}
