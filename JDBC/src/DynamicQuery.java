import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DynamicQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mystd",
                    "root",
                    "Suresh#123"
            );
            Statement statement = conn.createStatement();
            System.out.print("Enter ID which data you want : ");
            int id = sc.nextInt();
            String query = "Select * from student where id = "+id;
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+" | "+
                        rs.getString("stdName")+" | "+
                        rs.getInt("age")
                );
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
