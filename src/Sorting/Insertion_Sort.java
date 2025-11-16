//Insertion Sort
public class Insertion_Sort{
   public static void main(String[] args){
      int a[]={5,4,10,0,6,2};
      int i,j,temp;
      for( i=1;i<a.length;i++){
         temp=a[i];
         j=i-1;
         while(j>=0 && a[j]>temp){
            a[j+1]=a[j];
            j--;
         }
         a[j+1]=temp;
      }
      for( i=0;i<a.length;i++){
         System.out.println(a[i]+" ");
      }
   }
}