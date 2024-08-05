import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String user = "root";
        String password = "sir2kalFOUR!";

        /*
        Transactions are a way for a database to group related statements together to be
        executed as a single unit by the system.
         */

        String sql1 = "insert into students(first_name, second_name, marks, gender) values('Onimba', 'Red', 332, 'female')";
        String sql2 = "insert into students(first_name, second_name, marks, gender) values('Beatrice', 'Red', 332, 'female')";


        Connection connection = DriverManager.getConnection(url, user, password);

        connection.setAutoCommit(false);

        PreparedStatement preparedStatement = connection.prepareStatement(sql1);
        int a = preparedStatement.executeUpdate();

        preparedStatement = connection.prepareStatement(sql2);
        int b = preparedStatement.executeUpdate();

        if (a > 0 && b > 0) {
            connection.commit();
            System.out.println("Inserted into database");
        } else {
            connection.rollback();
        }


//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        while (resultSet.next()) {
//            System.out.println(resultSet.getInt("id"));
//            System.out.println(resultSet.getString("first_name"));
//            System.out.println(resultSet.getString("second_name"));
//            System.out.println(resultSet.getInt("marks"));
//            System.out.println(resultSet.getString("gender"));
//        }

    }
}
