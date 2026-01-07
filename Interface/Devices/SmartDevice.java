package Interface.Device;

public interface SmartDevice {
    public void turnOn();
    void turnOff();

    default void deviceInfo(){
            System.out.println("Smart Device Information:");
            System.out.println("- Ensure the device is connected to a power source.");
            System.out.println("- Ensure stable network connectivity.");
            System.out.println("- Follow manufacturer instructions for safe usage.");
    }

    public static void showSafetyGuidelines(){
        System.out.println("Smart Home Safety Guidelines:");
        System.out.println("1. Do not operate devices with wet hands.");
        System.out.println("2. Disconnect devices during power surges.");
        System.out.println("3. Keep devices away from extreme heat or moisture.");
        System.out.println("4. Perform regular maintenance checks.");

    }


}
