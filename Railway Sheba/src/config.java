
import java.sql.Connection;
import java.sql.DriverManager;


public class config {
    
    static Connection con;
    public  static Connection db_connect(){
        try {
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/railway","root","");
             System.out.println("Connected");
             return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
