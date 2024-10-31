package frc.team5115.subsystems.sensor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.littletonrobotics.junction.Logger;

public class Sensor extends SubsystemBase {
  private final SensorIO io;
  private final SensorIOInputsAutoLogged inputs = new SensorIOInputsAutoLogged();

  public Sensor(SensorIO io) {
    this.io = io;
  }

  @Override
  public void periodic() {
    io.updateInputs(inputs);
    Logger.processInputs(getName(), inputs);
  }
}
