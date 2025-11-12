// Prime digit count and Non Prime digit count
import java.util.Scanner;
public class Prime_nPrime_Count{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();//572468 o/p will be prime = 3 nprime =3
      int primeCount=0,nPrimeCount=0;
      while(num>0){
         int digit = num%10;
         if(digit == 2 || digit ==3 || digit == 5 || digit ==7 ){
            primeCount++;
         }
         else{
            nPrimeCount++;
         }
         num/=10;
      }
       
            System.out.println("Prime Count of Entered UserInput: "+primeCount);
            System.out.println("Non Prime Count of Entered UserInput: "+nPrimeCount);
   }
}