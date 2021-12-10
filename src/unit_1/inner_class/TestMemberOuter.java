/**
 * Created By Arjun Gautam
 * Date :10/12/2021
 * Time :11:58 PM
 * Project Name :Java7thSem
 */
package unit_1.inner_class;
//Demo for inner class
public class TestMemberOuter {
    private int data=30;
    class inner{
        void display(){
            System.out.println("Data is "+data);
        }
    }

    public static void main(String[] args) {
        TestMemberOuter obj=new TestMemberOuter();
        TestMemberOuter.inner in=obj.new inner();
        in.display();
    }
}
