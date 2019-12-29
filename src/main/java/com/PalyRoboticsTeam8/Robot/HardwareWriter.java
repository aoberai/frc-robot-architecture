package com.PalyRoboticsTeam8.Robot;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class HardwareWriter extends HardwareAdapter{
    private static HardwareWriter sHardwareWriter = new HardwareWriter();
    public void applyDrivetrain(double leftOutput, double rightOutput) {
        System.out.println("left output: " + leftOutput + " right output " + rightOutput);
        applySpark(leftMasterSpark, leftOutput * 0.5);
        applySpark(rightMasterSpark, rightOutput * 0.5);
    }

    public void applySpark(CANSparkMax spark, double output) {
        spark.set(output);
    }
    public void applyTalon(TalonSRX talon, double output) {
        talon.set(ControlMode.PercentOutput, output);
    }
    public void applyPneumatics(DoubleSolenoid solenoid, DoubleSolenoid.Value output) {
        solenoid.set(output);
    }

    public static HardwareWriter getHardwareWriter() {
        return sHardwareWriter;
    }
}
