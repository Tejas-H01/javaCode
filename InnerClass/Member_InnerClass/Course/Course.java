package InnerClass;

public class Course {
    private String CourseName;
    int CourseCode;

    public Course (String CourseName , int CourseCode){
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
    }

    public class Enrollment {

        private String name;
        private String number;

        public Enrollment(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public void displayDetails() {
            System.out.println("Course Name : " + CourseName);
            System.out.println("Course Code : " + CourseCode);
            System.out.println("Student Name : " + name);
            System.out.println("Enrollment Number : " + number);
        }
    }

}
