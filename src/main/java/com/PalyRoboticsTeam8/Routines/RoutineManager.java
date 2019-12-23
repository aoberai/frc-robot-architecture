package com.PalyRoboticsTeam8.Routines;

import java.util.Stack;

public class RoutineManager {
    private static RoutineManager sRoutineManger = new RoutineManager();
    private Stack<Routine> mRoutineSequence = new Stack();

    public void addRoutine(Routine routine) {
        mRoutineSequence.add(routine);
    }
    public void routineFinished() {
        mRoutineSequence.pop();
    }

    public void runRoutine() {
        if(mRoutineSequence.size() > 0) {
            System.out.println(mRoutineSequence.elementAt(0).routineName() + " has begun");
            mRoutineSequence.elementAt(0).start();
            mRoutineSequence.elementAt(0).run();
            if (mRoutineSequence.elementAt(0).isFinished() == true) {
                mRoutineSequence.elementAt(0).stop();
                routineFinished();
            }
        }
    }
    public static RoutineManager getRoutineManager() {
        return sRoutineManger;
    }
}
