package frc.robot.subsystems.Vision;

import org.littletonrobotics.junction.Logger;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.Vision.VisionIOSystem.EstimateConsumer;

public class Vision  extends SubsystemBase {
    private static Vision instance; 
    public final VisionIO io;
    private final VisionIOInputsAutoLogged visionInputs = new VisionIOInputsAutoLogged();

    public static Vision getInstance(){
        return instance;
    }

    public Vision(EstimateConsumer estConsumer) {
        io = new VisionIOSystem(estConsumer);
        instance = this;
    }

    public void periodic() {
        io.periodic();
        io.updateInputs(visionInputs);
        Logger.processInputs("Vision", visionInputs);
    }
}
