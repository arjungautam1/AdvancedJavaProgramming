/**
 * Created By Arjun Gautam
 * Date :05/12/2021
 * Time :10:22 PM
 * Project Name :Java7thSem
 */
package unit_1.class_obj;

class Rectangle1{
    int length;
    int breadth;

    void insertData(int length,int breadth){
        this.length=length;
        this.breadth=breadth;

    }
    int calculateArea(){
        return length*breadth;
    }

}

public class RectangleInitMethod {
    public static void main(String[] args) {
        Rectangle1 rectangle=new Rectangle1();
        rectangle.insertData(20,10);
        System.out.println("Area of rectangle is:"+rectangle.calculateArea());

    }
}
