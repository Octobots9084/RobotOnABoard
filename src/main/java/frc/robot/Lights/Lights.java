package frc.robot.Lights;

import com.ctre.phoenix6.controls.SolidColor;
import com.ctre.phoenix6.hardware.CANdle;

public class Lights {
    CANdle candle;

    public Lights(){
        candle = new CANdle(2, "krakenbus");
    }


    public void chooseColor(SolidColor color){
        candle.setControl(color);
    }

    public LightStates lightsWantedState = LightStates.DEFAULT;
    public LightStates lightCurrentState = LightStates.DEFAULT;

    public void stateColorWanted(){

    }

    public void stateColorCurrent(){

    }

}


