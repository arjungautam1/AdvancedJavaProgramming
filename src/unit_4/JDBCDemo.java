/**
 * Created By Arjun Gautam
 * Date :14/12/2021
 * Time :7:51 PM
 * Project Name :Java7thSem
 */
package unit_4;
/*Step 1: Import required packages*/

import java.sql.*;

public class JDBCDemo {
    static final String DB_URL = "jdbc:mysql://localhost/demo";
    static final String username = "root";
    static final String password = "$Lase5431";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            /*Step 2 : Register JDBC Driver*/
            Class.forName("com.mysql.cj.jdbc.Driver");

            /*Step 3 : Open a connection*/
            System.out.println("Connecting to a database...");
            connection = DriverManager.getConnection(DB_URL, username, password);

            /*Step 4 : Execute a query*/
            System.out.println("Creating a statement...");
            statement = connection.createStatement();

            String sql = "select * from employees";
            ResultSet rs = statement.executeQuery(sql);

            /*Step 5 : Extract data from result set*/
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");

                //Display values
                System.out.println("ID:" + id);
                System.out.println("Age:" + age);
                System.out.println("Name:" + name);

            }
            /*Step 6 : Clean up environment*/
            rs.close();
            statement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
