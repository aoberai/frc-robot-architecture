package com.PalyRoboticsTeam8.Autos.AutoModes;

import com.PalyRoboticsTeam8.Autos.Auto;
import com.PalyRoboticsTeam8.Robot.HardwareWriter;

public class ReleaseGamePiece implements Auto {

    @Override
    public void run() {
        HardwareWriter.getHardwareWriter().applyDrivetrain(1, 1); //example
    }

    @Override
    public String autoName() {
        return "PlaceGamePiece";
    }
}
