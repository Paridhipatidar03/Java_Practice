import java.sql.*;

public class CreateTable {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement stmt = null;

    
            // Load the MySQL JDBC driver (optional in newer versions of JDBC)
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Establish the connection
            con = DriverManager.getConnection("jdbc:odbc:JdbcOdbc");

            // SQL query to create the 'employee' table
            String query = "CREATE TABLE employee(id INT, name VARCHAR(50))";
            stmt = con.createStatement();

            // Execute the query to create the table
            stmt.executeUpdate(query);

            System.out.println("Table 'employee' created successfully!");

    }
}