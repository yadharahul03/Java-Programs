//Bubble sort
public class Bubble_Sort{
   public static void main(String[] args){
      // int a[]={20,1,35,2,4,3};
      int a[]={5,4,10,1,6,2};
      
      
      int temp,i,j;
      int n=a.length;
      for( i=0;i<n-1;i++){
         boolean swapped=false;
         for( j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
               temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
               swapped=true;
            }
         }
         if(!swapped)
         break;
      }
      for( i=0;i<n;i++){
         System.out.println(a[i]+" ");
      }
   }
}