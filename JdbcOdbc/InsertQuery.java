import java.sql.*;

public class InsertQuery {
     public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement stmt = null;

    
            // Load the MySQL JDBC driver (optional in newer versions of JDBC)
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Establish the connection
            con = DriverManager.getConnection("jdbc:odbc:JdbcOdbc");

            // SQL query to create the 'employee' table
            String query = "INSERT INTO employee (id, name) VALUES (1, 'Ram')";
            String query2 = "INSERT INTO employee (id, name) VALUES (3, 'Ram')";
            String query3 = "INSERT INTO employee (id, name) VALUES (4, 'Ram')";

            stmt = con.createStatement();

            // Execute the query to create the table
           stmt.executeUpdate(query);
           stmt.executeUpdate(query2);
           stmt.executeUpdate(query3);

// System.out.println(n+"Rows affected");
            System.out.println("Data Inserted Sucessfully!");

    }
}
