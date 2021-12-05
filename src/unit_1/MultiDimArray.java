/**
 * Created By Arjun Gautam
 * Date :05/12/2021
 * Time :9:28 PM
 * Project Name :Java7thSem
 */
package unit_1;

import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        //Program to show multi dimensional array
        System.out.println("Please Enter the Matrix elements 3*3 : ");
        Scanner scanner=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Entered 3*3 Matrix is : ");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
