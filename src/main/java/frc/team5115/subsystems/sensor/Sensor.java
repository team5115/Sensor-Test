package frc.team5115.subsystems.sensor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sensor extends SubsystemBase {
    private final SensorIO io;

    public Sensor (SensorIO io) {
        this.io = io;
    }

    
}
