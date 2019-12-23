package com.PalyRoboticsTeam8.Autos;

import java.util.Stack;

public class AutoManager {
    static AutoManager sAutoManager = new AutoManager();
    private Stack<Auto> autoSequence = new Stack();

    public void addAuto(Auto auto) {
       autoSequence.add(auto);
    }
    public void autoFinished() {
        autoSequence.pop();
    }

    public void runAutos() {
        if(autoSequence.size() > 0) {
            System.out.println(autoSequence.elementAt(0).autoName() + " has begun");
            autoSequence.elementAt(0).run();
            autoFinished();
        }
    }
    public static AutoManager getAutoManager() {
        return sAutoManager;
    }
}
