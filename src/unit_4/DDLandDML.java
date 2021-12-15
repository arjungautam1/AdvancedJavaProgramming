/**
 * Created By Arjun Gautam
 * Date :15/12/2021
 * Time :7:59 PM
 * Project Name :Java7thSem
 */
package unit_4;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//DDL and DML Operation using Java and JDBC
public class DDLandDML {

    public static void main(String[] args) throws SQLException {
        Statement statement = null;
        String createTable="create table student"+"(name varchar(32)"+"(roll varchar(20)";

        statement.executeUpdate(createTable);

        //Entering data into table

        String inputString="insert into student"+"values('Arjun',1)";
        statement.executeUpdate(inputString);

        //Getting data from table

        ResultSet rs=statement.executeQuery("select * from student");

        while (rs.next()){
           String name= rs.getString("name");
           int rollNo=rs.getInt("roll");


            System.out.println("Name :"+name);
            System.out.println("Roll No:"+rollNo);
        }


        //Updating the table

        String updateTable="update student"+"set roll=5"+"where name='Arjun'";

        statement.executeUpdate(updateTable);

        //Delete from a table

        String deleteString="delete from student"+"where id=1";
        statement.executeUpdate(deleteString);




    }




}
