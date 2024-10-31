package frc.team5115;

import frc.team5115.subsystems.sensor.Sensor;
import frc.team5115.subsystems.sensor.SensorIO;
import frc.team5115.subsystems.sensor.SensorIOPololu;

public class RobotContainer {
  private final Sensor sensor;

  public RobotContainer() {
    switch (Constants.currentMode) {
      case REAL:
        sensor = new Sensor(new SensorIOPololu());
        break;

      case SIM:
        sensor = new Sensor(new SensorIO() {});
        break;

      default:
        sensor = new Sensor(new SensorIO() {});
        break;
    }
    sensor.setDefaultCommand(sensor.printState());
  }
}
