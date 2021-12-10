/**
 * Created By Arjun Gautam
 * Date :10/12/2021
 * Time :11:09 PM
 * Project Name :Java7thSem
 */
package unit_1.overloading;

public class OverLoadingDemo {
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {

      OverLoadingDemo obj=new OverLoadingDemo();
      int sumOfTwoNum=obj.add(10,20);
      int sumOfThreeNum=obj.add(10,20,30);

        System.out.println(sumOfTwoNum);
        System.out.println(sumOfThreeNum);


    }
}
