package frc.robot.Motor;

import com.ctre.phoenix6.configs.MotionMagicConfigs;
import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motor extends SubsystemBase {
    TalonFX thomas = new TalonFX(1, "krakenbus");
    TalonFXConfiguration config = new TalonFXConfiguration();
    MotionMagicConfigs configMotion = new MotionMagicConfigs();
    XboxController control;
    
    public Motor(XboxController controller)
    {
        control = controller;
        config.Slot0.kP = 0;
        config.Slot0.kI = 0;
        config.Slot0.kD = 0;
        configMotion.MotionMagicAcceleration = 0;
        configMotion.MotionMagicCruiseVelocity = 0;
        config.withMotionMagic(configMotion);
        thomas.getConfigurator().apply(config);
    }

    @Override
    public void periodic()  {
        // if(control.getAButton())
        // {
        //     thomas.setVoltage(2);
        // }
        // else
        // {
        //     thomas.setVoltage(0);
        // }
    }
}
