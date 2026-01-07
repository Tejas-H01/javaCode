package Interface.Device;

public class SmartLight implements SmartDevice  {

    @Override
    public void turnOn(){
        System.out.println("Light is Turned ON!");
    }

    @Override
    public void turnOff(){
        System.out.println("Light is Turned OFF!");
    }


}
