package frc.robot.Lights;

import com.ctre.phoenix6.controls.SolidColor;
import com.ctre.phoenix6.controls.StrobeAnimation;
import com.ctre.phoenix6.signals.RGBWColor;

public enum LightStates{
    
    YELLOW(new SolidColor(0,65).withColor(new RGBWColor(255, 200, 0, 0))),
    ORANGE(new SolidColor(0,65).withColor(new RGBWColor(250, 30, 0, 0))),
    TEAL(new SolidColor(0,65).withColor(new RGBWColor(0, 255, 100, 0))),
    GREEN(new SolidColor(0,65).withColor(new RGBWColor(0, 255, 0, 0))), 
    LIGHTBLUE(new SolidColor(0,65).withColor(new RGBWColor(0, 0, 250, 100))),
    PINK(new SolidColor(0,65).withColor(new RGBWColor(250, 0, 250, 100))),
    RED(new SolidColor(0,65).withColor(new RGBWColor(255, 0, 0, 0))),
    BLUE(new SolidColor(0,65).withColor(new RGBWColor(250, 0, 250, 100)));
    
    

    SolidColor color;  

    private LightStates(SolidColor color) {
        this.color = color;
    }
    
}
