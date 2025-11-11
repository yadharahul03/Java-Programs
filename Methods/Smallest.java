package Methods;
public class Smallest {
    public static int smallest1(int a,int b,int c){
        if(a<c && a<b){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(smallest1(25, 56, 5));
    }
}
