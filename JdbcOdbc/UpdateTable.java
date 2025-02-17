import java.sql.*;

public class UpdateTable {
    public static void main(String[] args) throws Exception {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con= DriverManager.getConnection("jdbc:odbc:JdbcOdbc");
        Statement smt=con.createStatement();
        String sql="UPDATE employee SET id=id+1";
        int n=smt.executeUpdate(sql);
        System.out.println("Data Updated Sucessfully!");
System.out.println(n+"  Rows affected");
    }
}
