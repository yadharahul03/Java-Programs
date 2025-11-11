package Searching;

public class Linear_Search {
    public static void main(String args[]){
        int target=80;
        int a[]={23,56,89,80,10};
        int res=0;
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                res=i;
            }
        }
         System.out.println(res);
        
    }
}
