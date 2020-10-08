package Database;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class DataBaseConnector {


    //http://127.0.0.1:51997/?key=5af1e2b9-bb52-489f-aed7-d81d4d28b72f

    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/Phonebook";
    static final String USER = "postgres";
    static final String PASS = "8991";

    public static void main(String[] args) {

        System.out.println("Testing connection to PostgreSQL JDBC"  );

        try{
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC is not found. Include it in your library path! ");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
    }
}
