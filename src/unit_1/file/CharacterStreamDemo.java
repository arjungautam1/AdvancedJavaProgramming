/**
 * Created By Arjun Gautam
 * Date :14/12/2021
 * Time :1:19 PM
 * Project Name :Java7thSem
 */
package unit_1.file;

/*Writing and reading in files using character stream */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("src/unit_1/file/hello.txt");
        writer.write("This is random example for the sake of an example.");
        writer.close();

        FileReader reader=new FileReader("src/unit_1/file/hello.txt");
        char [] a=new char[50];
        reader.read(a);
        for (char c:a){
            System.out.println(c);
        }
        reader.close();
    }
}
