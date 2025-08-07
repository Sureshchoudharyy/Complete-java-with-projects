import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertUsingPS {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            String query = "insert into student (id,stdName,age) values (?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"ankit");
            preparedStatement.setInt(3,30);
            int update = preparedStatement.executeUpdate();
            System.out.println("Updated "+update+" rows");
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
