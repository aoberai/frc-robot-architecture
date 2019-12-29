package com.PalyRoboticsTeam8.Routines;

import java.util.LinkedList;
import java.util.Queue;

public class ParallelRoutineManager {
    private static ParallelRoutineManager sRoutineManager = new ParallelRoutineManager();
    private Queue<Routine> mRoutineSequence = new LinkedList<>();

    public void addRoutine(Routine routine) {
        mRoutineSequence.add(routine);
        routine.start();
    }
    public void routineFinished() {
        mRoutineSequence.poll();
    }

    public void runRoutines() {
        for(Routine routine : mRoutineSequence) {
              routine.run();
               if(routine.isFinished() == true) {
                   routine.stop();
                   routineFinished();
               }
        }
    }

    /**
     * Gives number of routines in mRoutineSequence
     */
    public int getCalledRoutines() {
        return mRoutineSequence.size();
    }
    public static ParallelRoutineManager getRoutineManager() {
        return sRoutineManager;
    }

}
