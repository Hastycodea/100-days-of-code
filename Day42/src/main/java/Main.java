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
                String name = resultSet.getString("student_name");
                System.out.println(name);
//                String name = resultSet.getString("student_name");
//                int id = resultSet.getInt("student_id");
//                double year = resultSet.getDouble("student_year");
//                System.out.println("Name: " + name + ", ID: " + id + ", Year: " + year);
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
