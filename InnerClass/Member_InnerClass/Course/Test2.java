package InnerClass;

public class Test2 {
    public static void main(String[] args){
        Course course ;

        course = new Course("IT",1101);
        Course.Enrollment enroll = course.new Enrollment("Tejas","2209640216");
        enroll.displayDetails();


        System.out.println("-------------------------------------------------------------------_");

        course = new Course("COMP",7005);
        Course.Enrollment enroll1 = course.new Enrollment("Shreya","2209640250");
        enroll1.displayDetails();

    }
}
