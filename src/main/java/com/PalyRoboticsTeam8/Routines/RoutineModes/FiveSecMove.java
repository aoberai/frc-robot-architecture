package com.PalyRoboticsTeam8.Routines.RoutineModes;

import com.PalyRoboticsTeam8.Robot.HardwareWriter;
import com.PalyRoboticsTeam8.Routines.Routine;
import edu.wpi.first.wpilibj.Timer;

public class FiveSecMove implements Routine {
    Timer timer = new Timer();
    @Override
    public void start() {
        timer.start();
    }

    @Override
    public void run() {
        System.out.println("entered");
        HardwareWriter.getHardwareWriter().applyDrivetrain(0.75, 0.75);
    }

    @Override
    public void stop() {

    }

    @Override
    public Boolean isFinished() {
        return timer.hasPeriodPassed(5);
    }

    @Override
    public void cancel() {

    }

    @Override
    public String routineName() {
        return "TwoSecMove";
    }
}
