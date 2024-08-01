import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeDatabase {

    private static Connection conn = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();

        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String user = "root";
        String password = "sir2kalFOUR!";

        conn = DriverManager.getConnection(url, user, password);

        System.out.println("1. Insert Employee");
        System.out.print("Enter a choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                employeeDatabase.insertMethod();
                break;
            default:
                break;
        }
    }

    private void insertMethod() throws SQLException {
        String sql = "insert into employees(city, first_name, last_name, pay, days, email) values(?,?,?,?,?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        System.out.print("Enter the city: ");
        preparedStatement.setString(1, scanner.nextLine());

        System.out.print("Enter the first name: ");
        preparedStatement.setString(2, scanner.nextLine());

        System.out.print("Enter the last name: ");
        preparedStatement.setString(3, scanner.nextLine());

        System.out.print("Enter pay amount: ");
        preparedStatement.setInt(4, Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter days: ");
        preparedStatement.setInt(5, Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter email: ");
        preparedStatement.setString(6, scanner.nextLine());

        int rows = preparedStatement.executeUpdate();

        if (rows > 0) {
            System.out.println("Inserted successfully");
        }
    }
}
