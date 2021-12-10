/**
 * Created By Arjun Gautam
 * Date :05/12/2021
 * Time :9:53 PM
 * Project Name :Java7thSem
 */
package unit_1.class_obj;

//ClassObject : Initialization via reference
class Rectangle{
    int length;
    int breadth;
}

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle();
        rectangle.length=10;
        rectangle.breadth=20;

        System.out.println("Length:"+rectangle.length +" Breadth:"+ rectangle.breadth);

    }
}
