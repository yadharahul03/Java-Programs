package Arrays;
import java.util.*;
public class Md_Array {
    public static void main(String[] args){
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int row=sc.nextInt();
        System.out.println("Enter the size of column");
        int column=sc.nextInt();
        int[][] a=new int[row][column];
        System.out.println("Enter the values of rows and columns");
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array elements are:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
               System.out.print( a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
