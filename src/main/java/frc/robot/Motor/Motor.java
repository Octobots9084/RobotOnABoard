package frc.robot.Motor;
import java.io.ObjectInputFilter.Config;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.controls.MotionMagicVelocityVoltage;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

//velocity based
public class Motor extends SubsystemBase {

    private VelocityVoltage velocity;
    private TalonFX fx;
    private TalonFXConfiguration config;

    public Motor() {
        velocity = new VelocityVoltage(0);
        fx = new TalonFX(1,"krakenbus");
        config = new TalonFXConfiguration();
        
        config.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;
        config.CurrentLimits.StatorCurrentLimit = 40;
        config.CurrentLimits.StatorCurrentLimitEnable = true;

        config.Slot0.kP = 0.35;
        config.Slot0.kI = 0.0;
        config.Slot0.kD = 0.0;
        config.Slot0.kA = 0.0;
        config.Slot0.kV = 0.12;
        config.Slot0.kS = 0.0;
        config.Slot0.kG = 0.0;

        fx.getConfigurator().apply(config);
    }

    public void periodic() {

    }

    public void setState(double setSpeed) {
        if(setSpeed == 0){
            fx.setVoltage(0);
        }
        else{
            fx.setControl(velocity.withVelocity(setSpeed));
        }
    }
}
