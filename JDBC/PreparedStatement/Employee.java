import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Employee {

    public static void main(String[] args) throws Exception {

        // 1. Load Driver
        Class.forName("org.postgresql.Driver");

        // 2. Database details
        String url = "jdbc:postgresql://localhost:5432/Tejas";
        String username = "postgres";
        String password = "root@123";

        // 3. Establish connection
        Connection con = DriverManager.getConnection(url, username, password);

        // 4. Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        // 5. SQL query with placeholder
        String sql = "SELECT * FROM employee WHERE emp_id = ?";

        // 6. Create PreparedStatement
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, empId);

        // 7. Execute query
        ResultSet rs = ps.executeQuery();

        // 8. Display result
        if (rs.next()) {
            System.out.println("Employee ID   : " + rs.getInt("emp_id"));
            System.out.println("First Name    : " + rs.getString("first_name"));
            System.out.println("Last Name     : " + rs.getString("last_name"));
            System.out.println("Email         : " + rs.getString("email"));
            System.out.println("Department    : " + rs.getString("department"));
            System.out.println("Salary        : " + rs.getDouble("salary"));
            System.out.println("Hire Date     : " + rs.getDate("hire_date"));
        } else {
            System.out.println("Employee not found.");
        }

        // 9. Close resources
        rs.close();
        ps.close();
        con.close();
        sc.close();
    }
}
