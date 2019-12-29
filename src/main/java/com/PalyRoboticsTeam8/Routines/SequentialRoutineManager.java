package com.PalyRoboticsTeam8.Routines;

import java.util.LinkedList;
import java.util.Queue;

public class SequentialRoutineManager {
    private static SequentialRoutineManager sRoutineManager = new SequentialRoutineManager();
    private Queue<Routine> mRoutineSequence = new LinkedList<>();

    public void addRoutine(Routine routine) {
        mRoutineSequence.add(routine);
    }
    public void routineFinished() {
        mRoutineSequence.poll();
    }
    private int oneTimeRoutineStarter = 0;

    public void runRoutines() {
        if(mRoutineSequence.size() > 0) {
            if(oneTimeRoutineStarter == 0) {
                System.out.println(mRoutineSequence.peek().routineName() + " has begun");
                mRoutineSequence.peek().start();
            }
            oneTimeRoutineStarter++;
            mRoutineSequence.peek().run();
            if (mRoutineSequence.peek().isFinished() == true) {
                System.out.println("Routine finished");
                mRoutineSequence.peek().stop();
                routineFinished();
                oneTimeRoutineStarter = 0;
            }
        }
    }

    /**
     * Gives number of routines in mRoutineSequence
     */
    public int getCalledRoutines() {
        return mRoutineSequence.size();
    }
    public static SequentialRoutineManager getRoutineManager() {
        return sRoutineManager;
    }

}
