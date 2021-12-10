/**
 * Created By Arjun Gautam
 * Date :10/12/2021
 * Time :11:14 PM
 * Project Name :Java7thSem
 */
package unit_1.access_modifiers;

class Demo{
    private String name;
    private void display(){
        System.out.println("Hello Java");
    }
}

public class PrivateDemo {


    public static void main(String[] args) {

        PrivateDemo obj=new PrivateDemo();
//        System.out.println(obj.name);  //Compile time error
//        obj.display(); //Compile time error

    }
}
