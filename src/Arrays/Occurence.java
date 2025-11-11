package Arrays;
import java.util.Scanner;
public class Occurence
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int[] freq={0,0,0,0,0,0,0,0,0,0};
	while (num>0){
	    int digit=num%10;
	    freq[digit]++;
	    num/=10;
	}
	for(int i=0;i<freq.length;i++){
	    if(freq[i]>0){
	        System.out.println(i+" "+freq[i]);
	    }
	}
	}
}