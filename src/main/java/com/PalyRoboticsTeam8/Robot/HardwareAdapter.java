package com.PalyRoboticsTeam8.Robot;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.sensors.PigeonIMU;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.EncoderType;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class HardwareAdapter {
    static HardwareAdapter sHardwareAdapter = new HardwareAdapter();

    CANSparkMax leftMasterSpark = new CANSparkMax(Ports.sLeftMotorPorts[0], CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax leftSlave1Spark = new CANSparkMax(Ports.sLeftMotorPorts[1], CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax leftSlave2Spark = new CANSparkMax(Ports.sLeftMotorPorts[2], CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax rightMasterSpark = new CANSparkMax(Ports.sRightMotorPorts[0], CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax  rightSlave1Spark = new CANSparkMax(Ports.sRightMotorPorts[1], CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax rightSlave2Spark = new CANSparkMax(Ports.sRightMotorPorts[2], CANSparkMaxLowLevel.MotorType.kBrushless);
//    CANSparkMax elevatorMasterSpark;
//    CANSparkMax elevatorSlaveSpark;
    CANEncoder drivetrainLeftEncoder;
    CANEncoder drivetrainRightEncoder;
    PigeonIMU gyro;
    Joystick driveJoystick = new Joystick(0);
    Joystick turnJoystick = new Joystick(1);
    XboxController xboxController = new XboxController(2);

    public void configureHardware() {
        configureDrivetrain();
//        elevatorSlaveSpark.follow(elevatorMasterSpark);
        drivetrainLeftEncoder = new CANEncoder(leftMasterSpark, EncoderType.kHallSensor, 1);
        drivetrainRightEncoder = new CANEncoder(rightMasterSpark, EncoderType.kHallSensor, 1);
        gyro = new PigeonIMU(new WPI_TalonSRX(9));
        gyro.setFusedHeading(0);
        drivetrainLeftEncoder.setPosition(0);
        drivetrainRightEncoder.setPosition(0);
    }
    public void configureDrivetrain() {
        leftMasterSpark = new CANSparkMax(Ports.sLeftMotorPorts[0], CANSparkMaxLowLevel.MotorType.kBrushless);
        leftSlave1Spark = new CANSparkMax(Ports.sLeftMotorPorts[1], CANSparkMaxLowLevel.MotorType.kBrushless);
        leftSlave2Spark = new CANSparkMax(Ports.sLeftMotorPorts[2], CANSparkMaxLowLevel.MotorType.kBrushless);
        rightMasterSpark = new CANSparkMax(Ports.sRightMotorPorts[0], CANSparkMaxLowLevel.MotorType.kBrushless);
        rightSlave1Spark = new CANSparkMax(Ports.sRightMotorPorts[1], CANSparkMaxLowLevel.MotorType.kBrushless);
        rightSlave2Spark = new CANSparkMax(Ports.sRightMotorPorts[2], CANSparkMaxLowLevel.MotorType.kBrushless);
        leftMasterSpark.setInverted(true);
        leftSlave1Spark.follow(leftMasterSpark);
        leftSlave2Spark.follow(leftMasterSpark);
        rightSlave1Spark.follow(rightMasterSpark);
        rightSlave2Spark.follow(rightMasterSpark);
    }
    public static HardwareAdapter getHardwareAdapter() {
        return sHardwareAdapter;
    }
}
