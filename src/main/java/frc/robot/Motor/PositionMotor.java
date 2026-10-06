package frc.robot.Motor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.signals.InvertedValue;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.controls.MotionMagicVoltage;
import com.ctre.phoenix6.configs.TalonFXConfiguration;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.wpilibj.Timer;


public class PositionMotor extends SubsystemBase {
    public TalonFX motor;
    public MotionMagicVoltage motionMagic;
    public TalonFXConfiguration config;
    public PositionMotor() {
        motor = new TalonFX(1, "krakenbus");
        //velocity = new VelocityVoltage(1);
        motionMagic = new MotionMagicVoltage(0);
        config = new TalonFXConfiguration();
        //inversion which direction is positive
        //stator current limit at 40
        //stator current limits enabled

        //pid values

        config.MotorOutput.Inverted = InvertedValue.Clockwise_Positive;

        config.CurrentLimits.StatorCurrentLimit = 40;
        config.CurrentLimits.StatorCurrentLimitEnable = true;
        config.Slot0.kP = 80;
        config.Slot0.kI = 0;
        config.Slot0.kD = 0;
        config.Slot0.kA = 0;
        config.Slot0.kV = 0;
        config.Slot0.kS = 0;
        config.Slot0.kG = 0;
        config.MotionMagic.MotionMagicAcceleration = 3;
        config.MotionMagic.MotionMagicCruiseVelocity = 15;
        config.MotionMagic.MotionMagicJerk = 5;
        motor.getConfigurator().apply(config);
    }

    /*public void periodic() {
        // do stuff
    }*/
    public void setState(double vel) {
        // if (vel == 0) {
        //     motor.setVoltage(0);
        // } else {
        //     motor.setControl(velocity.withVelocity(vel));
        // }
        // motor.setVoltage(vel);
        motor.setControl(motionMagic.withPosition(vel));
    }
}