package frc.robot.Motor;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorPosition extends SubsystemBase{

    private MotionMagicVoltage voltage;
    private TalonFX fx;
    private TalonFXConfiguration config;
    
    public MotorPosition(){
        voltage = new MotionMagicVoltage(0);
        fx = new TalonFX(1,"krakenbus");
        config = new TalonFXConfiguration();

        config.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;
        config.CurrentLimits.StatorCurrentLimit = 40;
        config.CurrentLimits.StatorCurrentLimitEnable = true;

        config.Slot0.kP = 80.0;
        config.Slot0.kI = 0.0;
        config.Slot0.kD = 0.0;
        config.Slot0.kA = 0.0;
        config.Slot0.kV = 0.0;
        config.Slot0.kS = 0.0;
        config.Slot0.kG = 0.0;

        config.MotionMagic.MotionMagicAcceleration = 3;
        config.MotionMagic.MotionMagicJerk = 5;
        config.MotionMagic.MotionMagicCruiseVelocity = 15;

        fx.getConfigurator().apply(config);
    }

    public void setState(double setPosition) {
        fx.setControl(voltage.withPosition(setPosition));
    }

}
