/**
 * Created By Arjun Gautam
 * Date :12/12/2021
 * Time :8:38 PM
 * Project Name :Java7thSem
 */
package unit_1.exception_handling;

/*Throw keyword is used to throw an exception explicitly*/
public class ThrowKeywordDemo {
    //function to check if the person is eligible to vote or not
    public static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("Person is eligible to vote.");
        } else {
            System.out.println("Person is eligible to vote.");
        }
    }

    public static void main(String[] args) {
        validate(13);
        System.out.println("Rest of the code.....");
    }
}
