/**
 * Created By Arjun Gautam
 * Date :11/12/2021
 * Time :12:09 AM
 * Project Name :Java7thSem
 */
package unit_1.static_keyword;

class Student{
    int id;
    String name;
    static String college="Texas";

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(this.id+" "+this.name+" "+college);
    }
}

public class StaticDemo {


    public static void main(String[] args) {

        Student student1=new Student(10,"Arjun");
        Student student2=new Student(20,"Pooja");
        Student.college="Texas";
        student1.display();
        student2.display();

    }
}
