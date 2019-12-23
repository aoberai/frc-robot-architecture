package com.PalyRoboticsTeam8.Robot;

public class HardwareReader {
    private static HardwareReader sHardwareReader = new HardwareReader();

    public void updateSensorValues() {
        RobotState.getRobotState().setDrivetrainLeftEncoderVelocity(HardwareAdapter.getHardwareAdapter().drivetrainLeftEncoder.getVelocity());
        RobotState.getRobotState().setDrivetrainRightEncoderVelocity(HardwareAdapter.getHardwareAdapter().drivetrainRightEncoder.getVelocity());
        RobotState.getRobotState().setDrivetrainLeftEncoderPosition(HardwareAdapter.getHardwareAdapter().drivetrainLeftEncoder.getPosition());
        RobotState.getRobotState().setDrivetrainRightEncoderPosition(HardwareAdapter.getHardwareAdapter().drivetrainRightEncoder.getPosition());
        RobotState.getRobotState().setDrivetrainGyroAngleDegrees(HardwareAdapter.getHardwareAdapter().gyro.getFusedHeading());
    }
    public static HardwareReader getHardwareReader() {
        return sHardwareReader;
    }
}
