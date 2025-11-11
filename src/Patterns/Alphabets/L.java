package Patterns.Alphabets;
import java.util.*;
public class L {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(j==1||i==n){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    sc.close();
}
}
