import java.sql.*;

public class DeleteTable {
    public static void main(String[] args) throws Exception {

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:JdbcOdbc");
        Statement smt = con.createStatement();
        String sql = "DELETE FROM employee WHERE id = 1";

        int n = smt.executeUpdate(sql);
        System.out.println("Rows affected " + n);
        System.out.println("Data Deleted");
    }
}
