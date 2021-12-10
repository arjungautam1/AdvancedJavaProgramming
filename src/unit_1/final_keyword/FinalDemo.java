/**
 * Created By Arjun Gautam
 * Date :11/12/2021
 * Time :12:01 AM
 * Project Name :Java7thSem
 */
package unit_1.final_keyword;

class Bike{
    final void ride(){
        System.out.println("Let's rice bike.");
    }
}
public class FinalDemo extends Bike{
    private final int id=10;
    //id=20;   //gives compile time error since final keyword cannot be redeclared
    /*Can be implemented for method and constructor */

    //For method we can't override
//    void ride(){    //Can't be overridden
//        System.out.println("running safely");
    }



