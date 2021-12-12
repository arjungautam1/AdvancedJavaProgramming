/**
 * Created By Arjun Gautam
 * Date :12/12/2021
 * Time :8:42 PM
 * Project Name :Java7thSem
 */
package unit_1.exception_handling;
/*
 * Exception is everything else under the Throwable class
 */


class UserDefinedExceptionClass extends Exception {
    public UserDefinedExceptionClass(String str) {
        //calling constructor of parent Exception
        super(str);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            throw new UserDefinedExceptionClass("This is user Defined exception.");
        } catch (UserDefinedExceptionClass ude) {
            //Print message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}
