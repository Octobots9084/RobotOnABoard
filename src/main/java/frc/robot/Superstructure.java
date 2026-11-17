package frc.robot;

public class Superstructure {
    private static Superstructure instance = null;
    public Superstructure getInstance () {
        return instance;
    }

    public static Superstructure setInstance (Superstructure superstructure) {
        instance = superstructure;
        return instance;
    }

    public Superstructure () {
        instance = this;
    }

    public RobotStates wantedState = RobotStates.SAFE;
    public RobotStates currentState = RobotStates.SAFE;

    public void handleStateTransitions () {
        switch (wantedState) {
            case SAFE:
                currentState = RobotStates.SAFE;
                break;
            case ACTIVE:
                wantedState = RobotStates.ACTIVE;
                break;
            default:
                break;
        }
    }

    public void applyStateTransitions () {
        switch (currentState) {
            case SAFE:
                currentState = RobotStates.SAFE;
                break;
            case ACTIVE:
                wantedState = RobotStates.ACTIVE;
                break;
            default:
                break;
        }
    }
}
