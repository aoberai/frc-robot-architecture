package com.PalyRoboticsTeam8.Autos;

import com.PalyRoboticsTeam8.Autos.AutoModes.ReleaseGamePiece;

public class AutoSequence {
    public AutoSequence() {
        AutoManager.getAutoManager().addAuto(new ReleaseGamePiece());
    }
}
