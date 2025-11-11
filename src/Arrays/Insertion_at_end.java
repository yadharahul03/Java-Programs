package Arrays;
public class Insertion_at_end {
    public static void main(String[] args) {
    int size=5;
    int x=20;
    int[] a={1,2,7,5,3,0};
    System.out.println("Befor insertion at end:");
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("After Insertion at end:");
        a[size]=x;
        // size++;
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
}
