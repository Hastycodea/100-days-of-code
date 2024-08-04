import java.sql.*;
import java.util.Scanner;

public class EmployeeDatabase {

    private static Connection conn = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://127.0.0.1:3306/myDB";
        String user = "root";
        String password = "sir2kalFOUR!";

        conn = DriverManager.getConnection(url, user, password);


        EmployeeDatabase employeeDatabase = new EmployeeDatabase();
//        int value = 0;

        while(true){
            System.out.println();
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. View Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter a choice: ");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeDatabase.insertMethod();
                    break;
                case 2:
                    employeeDatabase.updateMethod();
                    break;
                case 3:
                    employeeDatabase.viewEmployees();
                    break;
                case 4:
                    employeeDatabase.deleteMethod();
                    break;
                case 5:
                    System.exit(0);
//                    value = 1;
                default:
                    break;
            }
        }
    }

    private void viewEmployees() throws SQLException {
        String sql = "SELECT * FROM employees";
        Statement statement = conn.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String city = resultSet.getString("city");
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            int pay = resultSet.getInt("pay");
            int days = resultSet.getInt("days");
            String email = resultSet.getString("email");

            System.out.println("city: " + city + " first_name: " + first_name + " last_name: " + last_name + " pay: " + pay + " days: " + days + " email: " + email);
        }
    }

    private void deleteMethod() throws SQLException {
        System.out.print("Enter the name of the employee to be deleted: ");
        String name = scanner.nextLine();
        String sql = "DELETE FROM employees where first_name = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, name);
        preparedStatement.execute();

        if (preparedStatement.execute()) {
            System.out.println("Employee deleted successfully");
        } else {
            System.out.println("Employee does not exist");
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
    private void updateMethod() throws SQLException {
        System.out.print("Enter pay to update table: ");
        int payValue = Integer.parseInt(scanner.nextLine());

        String sql = "select * from employees where pay="+payValue;
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) {

            String city = resultSet.getString("city");
            String first_name = resultSet.getString("first_name");
            String last_name = resultSet.getString("last_name");
            int pay = resultSet.getInt("pay");
            int days = resultSet.getInt("days");
            String email = resultSet.getString("email");

            System.out.println("The city is " + city);
            System.out.println("The first name is " + first_name);
            System.out.println("The last name is " + last_name);
            System.out.println("The pay amount is " + pay);
            System.out.println("The days is " + days);
            System.out.println("The email is " + email);

            System.out.println("What do you want to update? ");
            System.out.println("1. City");
            System.out.println("2. First name");
            System.out.println("3. Last name");
            System.out.println("4. Pay amount");
            System.out.println("5. Days");
            System.out.println("6. Email");

            int choice = Integer.parseInt(scanner.nextLine());

            String sqlQuery = "update employees set";
            switch (choice) {
                case 1:
                    System.out.print("Enter the new city: ");
                    String newCity = scanner.nextLine();

                    sqlQuery = sqlQuery + " city = ? where pay="+payValue;
                    PreparedStatement preparedStatement = conn.prepareStatement(sqlQuery);
                    preparedStatement.setString(1, newCity);

                    int rows = preparedStatement.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Updated successfully");
                    } else {
                        System.out.println("No rows updated");
                    }
                    break;
                case 2:
                    System.out.print("Enter the new first name: ");
                    String newFirstName = scanner.nextLine();
                    sqlQuery = sqlQuery + " first_name = ? where pay="+payValue;
                    preparedStatement = conn.prepareStatement(sqlQuery);
                    preparedStatement.setString(1, newFirstName);

                    rows = preparedStatement.executeUpdate();

                    if (rows > 0) {
                        System.out.println("Updated successfully");
                    } else {
                        System.out.println("No rows updated");
                    }
                    break;
                case 3:
                    System.out.print("Enter the new last name: ");
                    String newLastName = scanner.nextLine();
                    sqlQuery = sqlQuery + " last_name = ? where pay="+payValue;
                    preparedStatement = conn.prepareStatement(sqlQuery);
                    preparedStatement.setString(1, newLastName);
                    rows = preparedStatement.executeUpdate();
                    if (rows > 0) {
                        System.out.println("Updated successfully");
                    } else {
                        System.out.println("No rows updated");
                    }
                    break;

            }

        } else {
            System.out.println("No record found");
        }

    }
}
