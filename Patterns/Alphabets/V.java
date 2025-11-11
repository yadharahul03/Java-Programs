package Patterns.Alphabets;
import java.util.*;
public class V {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        //leading space means spaces before star
        for(int j=0;j<i;j++){
          System.out.print(" ");
        }
        System.out.print("*");
        //inner loop spaces means spaces between stars
        for(int j=0;j<2*(n-i-1)-1;j++){
            System.out.print(" ");
        }
        //printing another star until i is not equal to last row
        if(i!=n-1){
        System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
    }
}

