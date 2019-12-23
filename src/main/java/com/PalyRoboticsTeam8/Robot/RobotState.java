package com.PalyRoboticsTeam8.Robot;

public class RobotState extends HardwareAdapter {
     private static RobotState sRobotState = new RobotState();
     private double mDrivetrainLeftEncoderVelocity = -1;
     private double mDrivetrainRightEncoderVelocity = -1;
     private double mDrivetrainLeftEncoderPosition = -1;
     private double mDrivetrainRightEncoderPosition = -1;
     private double mGyroAngleDegrees = -1;

    public static RobotState getRobotState() {
        return sRobotState;
    }
    public double getDrivetrainLeftEncoderVelocity() {
        return mDrivetrainLeftEncoderVelocity;
    }
    public double getDrivetrainLeftEncoderPosition() {
        return mDrivetrainLeftEncoderPosition;
    }
    public double getDrivetrainRightEncoderVelocity() {
        return mDrivetrainRightEncoderVelocity;
    }
    public double getDrivetrainRightEncoderPosition() { return mDrivetrainRightEncoderPosition; }
    public double getDrivetrainGyroAngleDegrees() {return mGyroAngleDegrees; }

    public void setDrivetrainLeftEncoderVelocity(double mDrivetrainLeftEncoderVelocity) { this.mDrivetrainLeftEncoderVelocity = mDrivetrainLeftEncoderVelocity; }
    public void setDrivetrainLeftEncoderPosition(double mDrivetrainLeftEncoderPosition) { this.mDrivetrainLeftEncoderPosition = mDrivetrainLeftEncoderPosition; }
    public void setDrivetrainRightEncoderVelocity(double  mDrivetrainRightEncoderVelocity) { this.mDrivetrainRightEncoderVelocity = mDrivetrainRightEncoderVelocity; }
    public void setDrivetrainRightEncoderPosition(double mDrivetrainRightEncoderPosition) { this.mDrivetrainRightEncoderPosition = mDrivetrainRightEncoderPosition; }
    public void setDrivetrainGyroAngleDegrees(double mGyroAngleDegrees) {this.mGyroAngleDegrees = mGyroAngleDegrees; }
}
