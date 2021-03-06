// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ShooterConst;

public class Shooter extends SubsystemBase {
  private final WPI_TalonFX shooter1;
  private final WPI_TalonFX shooter2;
  private final SpeedControllerGroup shooter;

  /** Creates a new Shooter. */
  public Shooter() {
    shooter1 = new WPI_TalonFX(ShooterConst.SHOOTER_MOTOR_PORT1);
    shooter2 = new WPI_TalonFX(ShooterConst.SHOOTER_MOTOR_PORT2);
    shooter = new SpeedControllerGroup(shooter1, shooter2);
    shooter2.setInverted(true);
  }

  public void setShooter(double shooter_speed) {
    shooter.set(shooter_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
