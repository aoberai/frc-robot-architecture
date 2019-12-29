package com.PalyRoboticsTeam8.Subsystems;

import com.PalyRoboticsTeam8.Robot.Commands;
import com.PalyRoboticsTeam8.Robot.HardwareAdapter;
import com.PalyRoboticsTeam8.Robot.HardwareWriter;
import com.PalyRoboticsTeam8.Robot.RobotState;


public class Drive implements Subsystem{
    DriveState mEnabledDisabled = DriveState.DISABLED;
    public enum DriveState {
        ENABLED, DISABLED;
    }
    @Override
    public void start() {

    }

    @Override
    public void run() {
        mEnabledDisabled = Commands.getInstance().wantedDriveState;
        switch(mEnabledDisabled) {
            case DISABLED:
                HardwareWriter.getHardwareWriter().applyDrivetrain(0,0);
                break;
            case ENABLED:
                HardwareWriter.getHardwareWriter().applyDrivetrain(RobotState.getRobotState().getDriveJoystickY(),  RobotState.getRobotState().getDriveJoystickX());
        }
    }

    @Override
    public void stop() {

    }

    @Override
    public String getName() {
        return "Drive";
    }
}
