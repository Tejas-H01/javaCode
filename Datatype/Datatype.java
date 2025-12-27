public class Datatype {

    public static void main (String[] args ){
        byte studentAge = 19;
        short graduationYear = 2028;
        int rollNumber = 71;
        long enrollmentNumber = 2204060218L;
        float percentage = 94.00f;
        double cgpa = 9.4d;
        char gender ='M';
        boolean result = true;

        System.out.println(studentAge);
        System.out.println(graduationYear);
        System.out.println(rollNumber);
        System.out.println(enrollmentNumber);
        System.out.println(percentage);
        System.out.println(cgpa);
        System.out.println(gender);
        if(result){
            System.out.println("Pass");
        }else
            System.out.println("Fail");

    }
}
