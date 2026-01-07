package Interface.Device;

public class SmartAC implements SmartDevice{
    @Override
    public void turnOn(){
        System.out.println("AC is Turned ON!");
    }

    @Override
    public void turnOff(){
        System.out.println("AC is Turned OFF!");
    }

}
