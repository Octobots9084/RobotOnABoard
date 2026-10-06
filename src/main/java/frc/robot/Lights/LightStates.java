package frc.robot.Lights;

import com.ctre.phoenix6.controls.SolidColor;
import com.ctre.phoenix6.signals.RGBWColor;

public enum LightStates{


    
    DEFAULT(new SolidColor(0,65).withColor(new RGBWColor(255, 200, 0, 0))), // Yellow
    CANTSHOOT(new SolidColor(0,65).withColor(new RGBWColor(250, 30, 0, 0))), // Orange
    SHOOTFERRY(new SolidColor(0,65).withColor(new RGBWColor(0, 255, 100, 0))), // Tealish
    SHOOTHUB(new SolidColor(0,65).withColor(new RGBWColor(0, 255, 0, 0))), // Green
    ZEROED(new SolidColor(0,65).withColor(new RGBWColor(0, 0, 250, 100))),//light blue   /**
    DISABLED(new SolidColor(0,65).withColor(new RGBWColor(250, 0, 250, 0))),//pink   /**
    DISCONNECTEDCAMERA(new SolidColor(0,65).withColor(new RGBWColor(255, 0, 0, 0))),//violently red

    //NOT USING
    INTAKING(new SolidColor(0,65).withColor(new RGBWColor(250, 0, 250, 100))), // Blue
    REVERSEINTAKING(new SolidColor(0,65).withColor(new RGBWColor(250, 0, 250, 100))); // The hottest pink



    SolidColor color;  

    private LightStates(SolidColor color) {
        this.color = color;
    }
    
}
