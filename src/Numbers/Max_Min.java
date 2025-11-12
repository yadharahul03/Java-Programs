import java.util.Scanner;
public class Max_Min
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num= sc.nextInt();
		num=Math.abs(num);
		int maxDigit = 0;
		int minDigit = 9;
		while(num>0){
		   int digit=num%10;
		   if(digit>maxDigit){
		      maxDigit=digit;
		   }
		   if(digit<minDigit){
		      minDigit=digit;
		   }
		   num/=10;
		}
		System.out.println("Max Digit of UserInput is :"+maxDigit);
		System.out.println("Min Digit of UserInput is :"+minDigit);
	}
}
