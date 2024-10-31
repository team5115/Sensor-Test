package frc.team5115.subsystems.sensor;

import edu.wpi.first.wpilibj.DigitalInput;

public class SensorIOPololu implements SensorIO {
    private final DigitalInput sensor;

    public SensorIOPololu() {
        sensor = new DigitalInput(0);

    }

    @Override
    public void updateInputs(SensorIOInputs inputs) {
        inputs.somethingDetected =  sensor.get();
    }
}
