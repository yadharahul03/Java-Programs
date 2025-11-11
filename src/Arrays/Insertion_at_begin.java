package Arrays;

public class Insertion_at_begin {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=20;
        a[1]=30;
        a[2]=40;
        a[3]=50;
        a[4]=60;
        a[5]=0;
        int x=55;
        System.out.println("Before insertion:");
         for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
           
        }
        a[0]=x;
        System.out.println("After insertion: ");
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
    }
}