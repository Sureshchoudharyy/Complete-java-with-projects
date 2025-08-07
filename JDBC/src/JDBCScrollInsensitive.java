import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCScrollInsensitive {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);

            System.out.println("---Scroll insensitive, Read only---");
            rs.last();
            System.out.println(rs.getInt("id")+" | "+rs.getString("stdName"));

            rs.first();
            System.out.println(rs.getInt("id")+" | "+rs.getString("stdName"));

            rs.absolute(2);
            System.out.println(rs.getInt("id")+" | "+rs.getString("stdName"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
