package Patterns.Alphabets;
import java.util.Scanner;
public class Sum_of_ltri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of rows and columns");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int s=0;
        int[][] a=new int[row][column];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
                if(j<=i){
                    s+=a[i][j];
                }
            }
        }
        System.out.println(s);
        sc.close();
    }
}
