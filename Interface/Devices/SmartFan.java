package Interface.Device;

public class SmartFan implements SmartDevice   {

    @Override
    public void turnOn(){
        System.out.println("Fan is Turned ON!");
    }

    @Override
    public void turnOff(){
        System.out.println("Fan is Turned OFF!");
    }


}
