// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.loading.LoadingIn;
import frc.robot.commands.loading.PreShootingCtrl;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Loading;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ThrBallShootMinor extends SequentialCommandGroup {
  /** Creates a new ThrBallShootMinor. */
  public ThrBallShootMinor(DriveTrain drivetrain, Loading loading_subsys) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new GoStraight(drivetrain).withTimeout(0.9), new WaitCommand(1),
        new AutoPreShootingCtrl(loading_subsys, () -> 0.5).withTimeout(1.5),
        new AutoLoadingIn(loading_subsys, () -> -0.5, () -> -0.5).withTimeout(3));
  }
}
