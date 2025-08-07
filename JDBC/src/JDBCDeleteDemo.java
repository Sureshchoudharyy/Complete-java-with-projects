import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDeleteDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            Statement statement = conn.createStatement();
            String query = "delete from student where id=3";
            int update = statement.executeUpdate(query);
            System.out.println("Deleted "+update+" rows");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
