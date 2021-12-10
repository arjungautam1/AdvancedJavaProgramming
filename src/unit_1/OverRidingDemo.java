/**
 * Created By Arjun Gautam
 * Date :11/12/2021
 * Time :12:19 AM
 * Project Name :Java7thSem
 */
package unit_1;

import unit_1.overloading.OverLoadingDemo;

class Riding{
    void display(){
        System.out.println("I am riding a bike.");
    }
}

public class OverRidingDemo extends Riding{

    void display(){
        System.out.println("I am fucking riding my bike.");
    }

    public static void main(String[] args) {
        OverRidingDemo obj=new OverRidingDemo();
        obj.display();
    }


}
