import java.sql.*;
import java.util.Scanner;
public class PrepareStatement {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id of employee");
        int n= sc.nextInt();
        String sql = "SELECT * FROM employee WHERE id=?";

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con= DriverManager.getConnection("jdbc:odbc:JdbcOdbc");
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, n);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
    }
}
