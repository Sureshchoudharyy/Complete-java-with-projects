import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteUsingPS {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            String query = "delete from student where id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,4);
            int update = preparedStatement.executeUpdate();
            System.out.println("Deleted "+update+" rows");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
