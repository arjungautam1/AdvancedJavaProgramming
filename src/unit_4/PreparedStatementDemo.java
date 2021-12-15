package unit_4;

import java.sql.*;

public class PreparedStatementDemo {

    static final String db_url = "jdbc:mysql://localhost/demo";
    static final String driver_jdbc = "com.mysql.jdbc.Driver";
    static final String username = "root";
    static final String password = "$Lase5431";

    public static void main(String[] args) {
        Connection conn = null;

        try {

            Class.forName(driver_jdbc);

            conn = DriverManager.getConnection(db_url, username, password);
            String sql = "insert into employees values(?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);


            statement.setInt(1, 2);
            statement.setInt(2, 23);
            statement.setString(3, "Ram");
            statement.executeUpdate();
            statement.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}