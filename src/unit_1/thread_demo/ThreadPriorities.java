/**
 * Created By Arjun Gautam
 * Date :14/12/2021
 * Time :12:44 PM
 * Project Name :Java7thSem
 */
package unit_1.thread_demo;

public class ThreadPriorities extends Thread{
    String tname;

    ThreadPriorities(String n){
        tname=n;
    }

    public void run(){
        for(int i=9;i>0;i--){
            System.out.println(tname+ " Printing:"+i);
        }
    }

    public static void main(String[] args) {
        ThreadPriorities x=new ThreadPriorities("T1");
        ThreadPriorities y=new ThreadPriorities("T2");
        ThreadPriorities z=new ThreadPriorities("T3");
        x.setPriority(10);
        y.setPriority(1);
        int p=z.getPriority();
        System.out.println("Priority of z:"+p);
        x.start();
        y.start();
        z.start();
    }

}
