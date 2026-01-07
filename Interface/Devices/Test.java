package Interface.Device;

public class Test {


public static void main(String[] args) {
    SmartDevice smart;

    smart= new SmartLight();
    System.out.println("Lights: ");
    smart.turnOn();
    smart.turnOff();

    smart=new SmartFan();
    System.out.println("Fans: ");
    smart.turnOn();
    smart.turnOff();

    smart=new SmartAC();
    System.out.println("AC: ");
    smart.turnOn();
    smart.turnOff();
    System.out.println();
    SmartDevice.showSafetyGuidelines();
    System.out.println();
    System.out.println();
    smart.deviceInfo();

}
}
