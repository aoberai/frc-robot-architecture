package com.PalyRoboticsTeam8.Subsystems;

import com.PalyRoboticsTeam8.Robot.HardwareAdapter;
import com.PalyRoboticsTeam8.Robot.HardwareWriter;
import com.PalyRoboticsTeam8.Robot.RobotState;

public class Drive implements Subsystem{
    @Override
    public void start() {

    }

    @Override
    public void run() {
        HardwareWriter.getHardwareWriter().applyDrivetrain(RobotState.getRobotState().getDriveJoystickY(),  RobotState.getRobotState().getDriveJoystickX());
    }

    @Override
    public void stop() {

    }

    @Override
    public String getName() {
        return "Drive";
    }
}
