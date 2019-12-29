package com.PalyRoboticsTeam8.Robot;


import com.PalyRoboticsTeam8.Routines.RoutineModes.FiveSecMove;
import com.PalyRoboticsTeam8.Routines.RoutineModes.TwoSecMove;
import com.PalyRoboticsTeam8.Routines.SequentialRoutineManager;

public class OperatorInterface {
    public static void updateCommands() {
        if (HardwareAdapter.getHardwareAdapter().driveJoystick.getTriggerPressed()) {
            System.out.println("Trigger Pressed");
            SequentialRoutineManager.getRoutineManager().addRoutine(new TwoSecMove());
        }

        if(HardwareAdapter.getHardwareAdapter().turnJoystick.getTriggerPressed()) {
            System.out.println("Trigger Pressed");
            SequentialRoutineManager.getRoutineManager().addRoutine(new FiveSecMove());
        }
//        if (HardwareAdapter.getHardwareAdapter().driveJoystick.getTopPressed()) {
//            Commands.getInstance().wantedExampleSubsystemState = ExampleSubsystem.ExampleSubSystemState.ON;
//        } else {
//            Commands.getInstance().wantedExampleSubsystemState = ExampleSubsystem.ExampleSubSystemState.OFF;
//        }
    }
}
