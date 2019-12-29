package com.PalyRoboticsTeam8.Robot;

import com.PalyRoboticsTeam8.Subsystems.Drive;
import com.PalyRoboticsTeam8.Subsystems.ExampleSubsystem;

public class Commands {
    private static Commands sCommands = new Commands();
    public ExampleSubsystem.ExampleSubSystemState wantedExampleSubsystemState = ExampleSubsystem.ExampleSubSystemState.OFF;
    public Drive.DriveState wantedDriveState = Drive.DriveState.DISABLED;
    public static Commands getInstance() {
        return sCommands;
    }
}
