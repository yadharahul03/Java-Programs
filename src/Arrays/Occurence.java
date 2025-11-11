package Arrays;
public class Occurence {
    public static void main(String args[]){
        int target=9;
        int count=0;
        int[] a={9,2,3,3,9};
        for(int i=0;i<a.length;i++){
            
            if(target==a[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
