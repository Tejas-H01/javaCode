package InnerClass;

class IfNotInnerClass_OuterClass {


    private IfNotInnerClass notInnerClass ;

    public IfNotInnerClass_OuterClass(IfNotInnerClass notInnerClass){
        this.notInnerClass = notInnerClass;
    }
    public void start(){
        if(notInnerClass.isEngineOn()!=true){
            notInnerClass.setEngineOn(true);
            System.out.println(notInnerClass.getModel()+" Engine Started !!");
        }else {
            System.out.println(notInnerClass.getModel()+"Engine is Already on !");
        }
    }

    public void stop(){
        if(notInnerClass.isEngineOn()){
            notInnerClass.setEngineOn(false);
            System.out.println(notInnerClass.getModel()+" Engine Stopped !!");
        }else {
            System.out.println(notInnerClass.getModel()+"Engine is Already off !");
        }
    }
}