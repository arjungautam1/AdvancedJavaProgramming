/**
 * Created By Arjun Gautam
 * Date :14/12/2021
 * Time :12:33 PM
 * Project Name :Java7thSem
 */
package unit_1.thread_demo;

//Java Thread example by extending Thread class
public class Multi extends Thread{
    public void run(){
        System.out.println("Thread is running..");
    }

    public static void main(String[] args) {
        Multi thread1=new Multi();
        thread1.start();
    }
}
