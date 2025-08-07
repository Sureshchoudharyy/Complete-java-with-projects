import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mystd";
        String user = "root";
        String password = "Suresh#123";
        String query = "select * from student";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    url,user,password
            );
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println("--------Read Data---------");
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+" | "+
                        rs.getString("stdName")+" | "+
                        rs.getInt("age")
                );
            }

            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
