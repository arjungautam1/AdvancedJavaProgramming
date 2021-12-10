/**
 * Created By Arjun Gautam
 * Date :10/12/2021
 * Time :11:40 PM
 * Project Name :Java7thSem
 */
package unit_1.access_modifiers;

import unit_1.access_public.PublicDem;

public class PublicDemo {
    public static void main(String[] args) {
        PublicDem obj=new PublicDem();
        System.out.println(obj.name);
        obj.display();

    }
}
