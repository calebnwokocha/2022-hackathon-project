import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
/**
 * Connect to a sample database
 */
    public static void connect() {
        Connection connection = null;
        try {
            // db parameters
            String url = "C:/sqlite/JTP.db";
            // create a connection to the database
            connection = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}

