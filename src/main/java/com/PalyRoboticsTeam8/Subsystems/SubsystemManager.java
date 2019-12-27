package com.PalyRoboticsTeam8.Subsystems;

import com.PalyRoboticsTeam8.Routines.SequentialRoutineManager;
import java.util.LinkedList;
import java.util.Queue;

public class SubsystemManager {
    private static SubsystemManager sSubsystemManager = new SubsystemManager();
    private Queue<Subsystem> mEnabledSubsystems = new LinkedList<Subsystem>();

    public void initializeSubsystems() {
        mEnabledSubsystems.add(new ExampleSubsystem());
        mEnabledSubsystems.add(new Drive());
        for (Subsystem subsystem : mEnabledSubsystems) {
            subsystem.start();
        }
    }

    public void disableSubsystems() {
        for (Subsystem subsystem : mEnabledSubsystems) {
            subsystem.stop();
        }
    }

    public void updateSubsystems() {
        for (Subsystem subsystem : mEnabledSubsystems) {
            if (!(subsystem instanceof Drive) || !(SequentialRoutineManager.getRoutineManager().getCalledRoutines() > 0)) {
                subsystem.run();
            }
        }
    }

    public static SubsystemManager getInstance() {
        return sSubsystemManager;
    }
}
