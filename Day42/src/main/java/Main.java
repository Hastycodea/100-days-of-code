import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/users",
                    "root",
                    "sir2kalFOUR!"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");

            while(resultSet.next()){
                System.out.println(resultSet.getString("student_name"));
                System.out.println(resultSet.getInt("student_id"));
                System.out.println(resultSet.getInt("student_year"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
