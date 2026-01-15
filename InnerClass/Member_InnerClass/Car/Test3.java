package InnerClass;

public class Test3 {
    public static void main(String[] args) {


        Car car = new Car("Nexa");


        Car.Engine engine = car.new Engine();

        engine.start();
        engine.stop();
    }
}
