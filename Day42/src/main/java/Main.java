import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql//127.0.0.1:3306/users",
                    "root",
                    "sir2kalFOUR!"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");

            while(resultSet.next()){
                System.out.println(resultSet.getString("city"));
                System.out.println(resultSet.getString("first_name"));
                System.out.println(resultSet.getString("last_name"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
