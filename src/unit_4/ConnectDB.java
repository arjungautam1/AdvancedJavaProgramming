package unit_4;

import java.sql.*;

public class ConnectDB {

    static final String driverName="com.mysql.cj.jdbc.Driver";
    static final String db_url="jdbc:mysql://localhost/demo";
    static final String username="root";
    static final String password="$Lase5431";

    public static void main(String[] args){

        Connection connection=null;
        Statement statement=null;

        try {
            Class.forName(driverName);

            connection=DriverManager.getConnection(db_url,username,password);
            statement=connection.createStatement();

            String sql="select * from employees";

            ResultSet rs=statement.executeQuery(sql);

            while (rs.next()){
                int id=rs.getInt("id");
                int age=rs.getInt("age");
                String name= rs.getString("name");

                System.out.println("Id: "+id);
                System.out.println("Age: "+age);
                System.out.println("Name: "+name);


            }




        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}