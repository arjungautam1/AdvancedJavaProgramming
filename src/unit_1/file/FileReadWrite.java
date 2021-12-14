/**
 * Created By Arjun Gautam
 * Date :14/12/2021
 * Time :12:53 PM
 * Project Name :Java7thSem
 */
package unit_1.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*Program to write from one file to another using input byte stream.*/
public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("src/unit_1/file/input.txt");
            out=new FileOutputStream("src/unit_1/file/output.txt");
            int c;
            while ((c=in.read())!=-1){
                out.write(c);
            }
        }finally {
            in.close();
            out.close();
        }
    }
}
