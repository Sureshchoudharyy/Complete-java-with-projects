import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            Statement statement = conn.createStatement();
            String query = "insert into student values(3,'ashok',25)";
            int update = statement.executeUpdate(query);
            System.out.println("inserted "+update+" rows");
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
