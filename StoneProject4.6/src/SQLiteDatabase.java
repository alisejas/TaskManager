import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SQLiteDatabase {
    public static Connection connect(String database){
        String url = "jdbc:sqlite:" +database;
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
