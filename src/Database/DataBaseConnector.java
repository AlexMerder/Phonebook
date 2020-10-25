package Database;
import java.sql.*;

public class DataBaseConnector {


   /* static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/Phonebook";
    static final String USER = "postgres";
    static final String PASS = "8991";*/

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Phonebook","postgres","8991");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM logAndPasswords WHERE id = '2'");

        while (resultSet.next()){
            System.out.println(resultSet.getString("login"));
            System.out.println(resultSet.getString("password"));

        }








    }

}
