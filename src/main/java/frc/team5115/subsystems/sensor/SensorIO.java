package frc.team5115.subsystems.sensor;

import org.littletonrobotics.junction.AutoLog;

public interface SensorIO {
  @AutoLog
  public static class SensorIOInputs {
    public boolean somethingDetected = false;
  }

  public default void updateInputs(SensorIOInputs inputs) {}
}
