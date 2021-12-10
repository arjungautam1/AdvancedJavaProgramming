/**
 * Created By Arjun Gautam
 * Date :10/12/2021
 * Time :11:48 PM
 * Project Name :Java7thSem
 */
package unit_1.interface_demo;

public class DemoClass implements DemoInterface{
    public void print(){
        System.out.println("This is a function to print.");
    }

    public static void main(String[] args) {
        DemoClass demoClass=new DemoClass();
        demoClass.print();
    }


}
