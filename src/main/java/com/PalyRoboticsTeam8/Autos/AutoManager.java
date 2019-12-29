package com.PalyRoboticsTeam8.Autos;

import java.util.LinkedList;
import java.util.Queue;

public class AutoManager {
    private static AutoManager sAutoManager = new AutoManager();
    private Queue<Auto> autoSequence = new LinkedList<>();

    public void addAuto(Auto auto) {
       autoSequence.add(auto);
    }
    public void autoFinished() {
        autoSequence.poll();
    }

    public void runAutos() {
        if(autoSequence.size() > 0) {
            System.out.println(autoSequence.peek().autoName() + " has begun");
            autoSequence.peek().run();
            autoFinished();
        }
    }
    public static AutoManager getAutoManager() {
        return sAutoManager;
    }
}
