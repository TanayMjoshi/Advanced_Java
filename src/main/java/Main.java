import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "Toonoo@050504");
            System.out.println(con);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}