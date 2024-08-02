import java.sql.*;

public class Main {

    public static void main(String[] args) throws SQLException {

        String sql = "select * from students";
        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String user = "root";
        String password = "sir2kalFOUR!";

        Connection connection = DriverManager.getConnection(url, user, password);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("first_name"));
            System.out.println(resultSet.getString("second_name"));
            System.out.println(resultSet.getInt("marks"));
            System.out.println(resultSet.getString("gender"));
        }

    }
}
