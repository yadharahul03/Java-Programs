package Patterns.Alphabets;
import java.util.*;
public class K {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||j==i-2||(i==1&&j==i+4)||(i==2 && j==i*i)||(i==3 && i==j)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
