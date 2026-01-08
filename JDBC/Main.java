import java.sql.*;

class Main {

    public static void main(String[] args  ) throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/Tejas";
        String username ="postgres";
        String password ="root@123";

        String sql = " SELECT * FROM employee WHERE emp_id = 12";

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        rs.next();
        String emp_id = rs.getString(1);

        String first_name = rs.getString(2);

        String last_name = rs.getString(3);

        String email = rs.getString(4);

        String department = rs.getString(5);

        int salary = rs.getInt(6);

        String hireDate = rs.getString(7);

        System.out.println(emp_id+"\n"+first_name+" "+last_name+"\n"+email+"  "+department+"\n"+salary+"\n"+hireDate);



        con.close();
    }
}