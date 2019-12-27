package com.PalyRoboticsTeam8.Subsystems;

import com.PalyRoboticsTeam8.Robot.Commands;
import com.PalyRoboticsTeam8.Robot.HardwareAdapter;
import com.PalyRoboticsTeam8.Robot.HardwareWriter;

public class ExampleSubsystem implements Subsystem {
    private ExampleSubSystemState mOnOffState = ExampleSubSystemState.OFF;
    public enum ExampleSubSystemState{
        ON, OFF;
    }
    @Override
    public void start() { }

    @Override
    public void run() {
//        mOnOffState = Commands.getInstance().wantedExampleSubsystemState;
//        switch(mOnOffState) {
//            case ON:
//                HardwareWriter.getHardwareWriter().applyDrivetrain(0.5, 0.5);
//                break;
//            case OFF:
//                HardwareWriter.getHardwareWriter().applyDrivetrain(0, 0);
//                break;
//        }
    }

    @Override
    public void stop() {

    }

    @Override
    public String getName() {
        return "Elevator";
    }
}
