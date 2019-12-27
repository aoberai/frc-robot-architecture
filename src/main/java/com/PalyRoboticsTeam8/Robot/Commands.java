package com.PalyRoboticsTeam8.Robot;

import com.PalyRoboticsTeam8.Subsystems.ExampleSubsystem;

public class Commands {
    private static Commands sCommands = new Commands();
    public ExampleSubsystem.ExampleSubSystemState wantedExampleSubsystemState = ExampleSubsystem.ExampleSubSystemState.OFF;
    public static Commands getInstance() {
        return sCommands;
    }
}
