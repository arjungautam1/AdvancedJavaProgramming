/**
 * Created By Arjun Gautam
 * Date :14/12/2021
 * Time :12:34 PM
 * Project Name :Java7thSem
 */
package unit_1.thread_demo;
//Thread Example by implementing Runnable interface

public class ThreadUsingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        ThreadUsingRunnable threadUsingRunnable=new ThreadUsingRunnable();
        Thread t1=new Thread(threadUsingRunnable); //Using constructor thread
        t1.start();
    }


}
