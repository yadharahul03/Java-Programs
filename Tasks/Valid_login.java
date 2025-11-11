package Tasks;
import java.util.Scanner;
public class Valid_login {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Username:");
    String name=sc.nextLine();
    System.out.println("Password");
    String password=sc.nextLine();
       if(name .equals("Rahul") && password.equals("1234")){
        System.out.println("login successfully!");
       }
       else{
        System.out.println("Enter valid Credentials");
       }
       sc.close();
    }
}
