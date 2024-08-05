import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String usr = "root";
        String psswd = "sir2kalFOUR!";
        Connection connection = DriverManager.getConnection(url, usr, psswd);

        connection.setAutoCommit(false);

        Statement statement = connection.createStatement();

        String sql1 = "insert into students (first_name, second_name, marks, gender) values('Tim', 'Tsv', 332, 'male')";
        String sql2 = "insert into students (first_name, second_name, marks, gender) values('Vim', 'Kimani', 332, 'male')";
        String sql3 = "insert into students (first_name, second_name, marks, gender) values('Pim', 'Tsv', 332, 'male')";

        statement.addBatch(sql1);
        statement.addBatch(sql2);
        statement.addBatch(sql3);
        int[] rows = statement.executeBatch();

        for (int i : rows) {
            if (i > 0) {
                continue;
            } else {
                connection.rollback();
                System.out.println("An error occurred");
                break;
            }
        }
        connection.commit();
        System.out.println("No errors were thrown");
    }
}
