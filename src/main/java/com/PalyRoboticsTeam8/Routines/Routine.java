package com.PalyRoboticsTeam8.Routines;

public interface Routine {

    public void start() ;

    public void run();

    public void stop();

    public Boolean isFinished();

    public void cancel();

    public String routineName();
}
