import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception {
        String sql = "select * from employees";
        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String user = "root";
        String password = "sir2kalFOUR!";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.print(rs.getString("city"));
            System.out.print(" : ");
            System.out.print(rs.getString("email"));
            System.out.println();

        }

    }
}
