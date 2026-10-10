package frc.robot.Lights;

import com.ctre.phoenix6.controls.RainbowAnimation;
import com.ctre.phoenix6.controls.SolidColor;
import com.ctre.phoenix6.controls.StrobeAnimation;
import com.ctre.phoenix6.hardware.CANdle;
import com.ctre.phoenix6.signals.RGBWColor;

import edu.wpi.first.wpilibj2.command.WaitCommand;

public class Lights {
    CANdle candle;

    public Lights(){
        candle = new CANdle(2, "krakenbus");
    }


    public void chooseColor(SolidColor color){
        candle.setControl(color);
    }

    public void delay(double time){
        new WaitCommand(time);
    }

    public void colorfulShow(){
        StrobeAnimation strobe = new StrobeAnimation(0, 29);
        RainbowAnimation rainbow = new RainbowAnimation(0, 29);
        chooseColor(new SolidColor(0,65).withColor(new RGBWColor(0, 0, 250, 100)));
        candle.setControl(strobe);
        delay(2.0);
        candle.setControl(rainbow);
    }

    public LightStates lightsWantedState = LightStates.BLUE;
    public LightStates lightsCurrentState = LightStates.BLUE;
    public LightStates lastState = lightsCurrentState;

    public void stateColorWanted(){

    }

    public void stateColorCurrent(){

    }

}


