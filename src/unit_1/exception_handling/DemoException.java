/**
 * Created By Arjun Gautam
 * Date :12/12/2021
 * Time :8:24 PM
 * Project Name :Java7thSem
 */
package unit_1.exception_handling;

public class DemoException {
    public static void main(String[] args) {
        try{
            int i=1/0;
        }catch (Exception e){
            System.out.println("Exception handled.");
        }finally {
            System.out.println("This is printed anyway.");
        }
    }
}
