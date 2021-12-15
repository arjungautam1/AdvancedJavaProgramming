/**
 * Created By Arjun Gautam
 * Date :15/12/2021
 * Time :8:30 PM
 * Project Name :Java7thSem
 */
package unit_4;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetTest {
    public static void main(String[] args) throws Exception{
        RowSetFactory rowSetFactory= RowSetProvider.newFactory();
        JdbcRowSet rowSet=rowSetFactory.createJdbcRowSet();
        Class.forName("com.mysql.jdbc.Driver");
        rowSet.setUrl("jdbc:mysql://localhost/demo");
        rowSet.setUsername("root");
        rowSet.setPassword("$Lase5431");

        rowSet.setCommand("select * from employees");

        rowSet.execute();
        rowSet.last();
        System.out.println("-- Last Row --");
        System.out.println(rowSet.getInt("id")+","+rowSet.getInt("age")+","+rowSet.getString("name"));

        rowSet.first();
        System.out.println("-- First row --");
        System.out.println(rowSet.getInt("id")+","+rowSet.getInt("age")+","+rowSet.getString("name"));


    }
}
