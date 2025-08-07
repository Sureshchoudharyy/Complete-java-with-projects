import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            Statement statement = conn.createStatement();
            String query = "update student set age=21 where id=2";
            int update = statement.executeUpdate(query);
            System.out.println("updated "+update+" rows");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
