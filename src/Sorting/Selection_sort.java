package Sorting;

public class Selection_sort {
    public static void main(String[] args) {
        int a[]={25,1,20,22,15,30};
        int temp;
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
