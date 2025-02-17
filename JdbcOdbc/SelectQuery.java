import java.sql.*;

public class SelectQuery {
    public static void main(String[] args) throws Exception{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con= DriverManager.getConnection("jdbc:odbc:JdbcOdbc");
        Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        String sql= "SELECT * FROM employee WHERE id=1";
        ResultSet rs= smt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getInt(1));
        }
        rs.beforeFirst();
        while(rs.next()){
            System.out.println(rs.getString(2));
        }

    }
}
