package Patterns.Alphabets;

import java.util.Scanner;

public class E{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||i==(n/2)+1){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
