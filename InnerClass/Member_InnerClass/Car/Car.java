package InnerClass;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model=model;
        this.isEngineOn=false;
    }

    class Engine{

        public void start(){
            if(isEngineOn!=true){
                isEngineOn=true;
                System.out.println(model+" Engine Started !!");
            }else {
                System.out.println(model+"Engine is Already on !");
            }
        }

        public void stop(){
            if(isEngineOn=true){
                isEngineOn=false;
                System.out.println(model+" Engine Stopped !!");
            }else {
                System.out.println(model+"Engine is Already off !");
            }
        }
    }
}
