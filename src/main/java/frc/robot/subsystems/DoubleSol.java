// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DoubleSol extends SubsystemBase {
  /** Creates a new DoubleSol. */
  private DoubleSolenoid arm, intake;

  public DoubleSol() {
    arm = new DoubleSolenoid(PneumaticsModuleType.REVPH, 0, 1);
    intake = new DoubleSolenoid(PneumaticsModuleType.REVPH, 2, 3);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void Intake(){
    arm.set(kForward);
    intake.set(kForward);
  }
  public void outTake(){
    arm.set(kReverse);
    intake.set(kReverse);
  }
  public void stop(){
    arm.set(kOff);
    intake.set(kOff);
  }

}
