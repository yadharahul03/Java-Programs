package Searching;

public class Binary_Search {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int tar = 11;
        int start = 0;
        int end = a.length - 1;
        int res = -1; 
        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == tar) {
                res = mid; 
                break;
            }
            else if (tar < a[mid]) {
                end = mid - 1; 
            }
            else {
                start = mid + 1; 
            }
        }

        System.out.println(res);
    }
}
