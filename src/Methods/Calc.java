package Methods;
import java.util.*;
public class Calc {
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;
    }
    public int mul(int a,int b){
        int c=a*b;
        return c;
    }
    public int div(int a,int b){
        int c=a/b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose any Arithmetic Operators");
        char choice=sc.next().charAt(0);
        System.out.println("Enter num1: ");
        int a=sc.nextInt();
        System.out.println("Enter num2: ");
        int b=sc.nextInt();
        Calc c=new Calc();
        switch(choice){
            case '+':
            System.out.println(c.add(a,b));
            break;
            case '-':
            System.out.println(c.sub(a,b));
            break;
            case '*':
            System.out.println(c.mul(a,b));
            break;
            case '/':
            System.out.println(c.div(a,b));
            break;
            default:
            System.out.println("Enter a valid operator");
        }
        sc.close();
    }

}
