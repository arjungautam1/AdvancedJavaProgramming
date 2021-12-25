/**
 * Created By Arjun Gautam
 * Date :16/12/2021
 * Time :3:07 PM
 * Project Name :Java7thSem
 */
package unit_4;

import java.sql.*;
public class Transaction {
    static final String JDBC_Driver="com.mysql.jdbc.Driver";
    static final String db_url="jdbc:mysql://localhost/bank";
    static final String username="root";
    static final String password="arjun";

    public static void main(String[] args) throws Exception{
        Connection connection=null;
        Statement statement=null;

        Class.forName(JDBC_Driver);
        connection=DriverManager.getConnection(db_url,username,password);
        statement=connection.createStatement();

        connection.setAutoCommit(false);

        String sql1="update account set balance=balance-10000 where accno=105";
        String sql2="update account set balance=balance+10000 where accno=205";

        statement.executeUpdate(sql1);
        statement.executeUpdate(sql2);

        connection.commit();
        ResultSet resultSet=statement.executeQuery("select * from account");

        //This is just demo

        resultSet=statement.executeQuery("select * from account");

        System.out.println("After transaction completed");

        while (resultSet.next()){
            int account=resultSet.getInt("accno");
            String n=resultSet.getString("accname");
            float bal=resultSet.getFloat("balance");
            String br=resultSet.getString("branch");
            System.out.println("Branch :"+br);

        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
