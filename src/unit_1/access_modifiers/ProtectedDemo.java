/**
 * Created By Arjun Gautam
 * Date :10/12/2021
 * Time :11:32 PM
 * Project Name :Java7thSem
 */
package unit_1.access_modifiers;


import unit_1.access_protected.ProtectedDem;
//Protected is only accessible on the inherited class
public class ProtectedDemo extends ProtectedDem{
    public static void main(String[] args) {
        ProtectedDemo obj=new ProtectedDemo();
        obj.display();
    }
}
