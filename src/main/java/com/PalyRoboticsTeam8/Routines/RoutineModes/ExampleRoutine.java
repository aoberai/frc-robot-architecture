package com.PalyRoboticsTeam8.Routines.RoutineModes;

import com.PalyRoboticsTeam8.Robot.HardwareWriter;
import com.PalyRoboticsTeam8.Routines.Routine;
import edu.wpi.first.wpilibj.Timer;

public class ExampleRoutine implements Routine {
    private Timer mTimer = new Timer();
    @Override
    public void start() {
        System.out.println("ExampleRoutine Started");
        mTimer.start();
    }

    @Override
    public void run() {
            HardwareWriter.getHardwareWriter().applyDrivetrain(1, 1); //example
    }

    @Override
    public void stop() {
        System.out.println("ExampleRoutine Finished");
    }

    @Override
    public Boolean isFinished() {
        if(mTimer.get() > 1000) {
            return true;
        }
        return false;
    }

    @Override
    public void cancel() {

    }

    @Override
    public String routineName() {
        return "ExampleRoutine";
    }
}
