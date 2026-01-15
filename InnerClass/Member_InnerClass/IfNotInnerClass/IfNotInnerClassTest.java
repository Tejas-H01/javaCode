package InnerClass;

public class IfNotInnerClassTest {

    public static void main(String[] args) {
        IfNotInnerClass notInnerClass = new IfNotInnerClass("Nexa");
        //class1 obj1 = new class1(string)

        IfNotInnerClass_OuterClass outerClass = new IfNotInnerClass_OuterClass(notInnerClass);
        //class2 obj2 = new class2(obj1)
        outerClass.start();
        outerClass.stop();
        //obj2.methods of class2


        System.out.println("____________________________________________________________________________"   );


        IfNotInnerClass notInnerClass1 = new IfNotInnerClass("BMW");
        IfNotInnerClass_OuterClass outerClass1 = new IfNotInnerClass_OuterClass(notInnerClass1);
        outerClass1.start();
        outerClass1.stop();
    }
}
