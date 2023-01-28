package frc.robot.constants;

public interface Ports {
    public interface GamePad{
        int DRIVER = 0;
        int OPERATOR = 1;
        int DEBUGGER = 2;
    }
    public interface SinglePort{
        int port = 15;//Change port for the desire solenoid 
    }
    public interface DoublePort{
        int portForward = 0;//Change port for the desire solenoid 
        int portReverse = 1;//Change port for the desire solenoid 
    }
}
