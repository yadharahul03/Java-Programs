import java.util.Scanner;
public class EvenOddDiff
{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();//572468 user input difference 8
		int evenSum=0, oddSum=0;
		num=Math.abs(num);
		while(num>0){
		   int digit=num%10;
		   if(digit%2==0){
		   evenSum+=digit;
		   }
		   else{
		      oddSum+=digit;
		   }
		   num/=10;
		}
		int difference=evenSum-oddSum;
		System.out.println("Even Sum: " + evenSum);
      System.out.println("Odd Sum: " + oddSum);
      System.out.println("Difference: " + difference);

		System.out.println("Difference between evenSum and oddSUM :"+difference);
	}
}

