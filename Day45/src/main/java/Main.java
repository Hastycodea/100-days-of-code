import javax.xml.crypto.Data;
import java.sql.*;

public class Main {

    private static String url = "jdbc:mysql://127.0.0.1:3306/myDB";
    private static String user = "root";
    private static String password = "sir2kalFOUR!";

    private static Connection connection = null;

    public static void main(String[] args) throws Exception {
        connection = DriverManager.getConnection(url, user, password);
        DatabaseMetaData metaData = connection.getMetaData();
        retrieveData();
        extractSchema(metaData);
        extractTables(metaData);
    }

    private static void retrieveData() throws Exception{
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String first_name = resultSet.getString("first_name");
                String second_name = resultSet.getString("second_name");
                int marks = resultSet.getInt("marks");
                String gender = resultSet.getString("gender");

                System.out.println(id + ". " +first_name + ", " + second_name + ", " + marks + ", " + gender);

            }
    }

    private static void extractSchema(DatabaseMetaData metaData) throws SQLException {
        ResultSet resultSet = metaData.getSchemas();
        System.out.println("Schemas: ");
        while (resultSet.next()) {
            System.out.println("-"+resultSet.getString(1));
        }
    }

    private static void extractTables(DatabaseMetaData metaData) throws SQLException {
        ResultSet resultSet = metaData.getTables("myDB", "students", null, new String[]{"TABLE"});
        while (resultSet.next()) {
            String tableName = resultSet.getString("TABLE_NAME");
            System.out.println("Table: "+tableName);
        }
    }

}
