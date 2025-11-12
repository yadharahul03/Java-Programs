import java.util.Scanner;
public class Prime_Sum{
   public static void main(String args[]){
      System.out.println("Enter the num");
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();//572468 Sum=14
      num=Math.abs(num);
      int primeSum=0;
      while(num>0){
         int digit=num%10;
        if(digit ==2 || digit ==3 || digit == 5 || digit == 7){
           primeSum+=digit;
        }
         num/=10;
      }
      System.out.println("Sum of prime digits: " + primeSum);
   }
}