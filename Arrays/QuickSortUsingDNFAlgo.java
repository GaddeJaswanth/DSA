import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void sort(ArrayList<Integer> arr, int low, int high){
        if(low<high){
            int pivot = arr.get(low);
            int i = low;
            int j = low;
            int k = high;
            
            while(j<=k){
                if(arr.get(j)<pivot){
                    swap(arr, i, j);
                    i++;
                    j++;
                }
                else if(arr.get(j)>pivot){
                    swap(arr, j, k);
                    k--;
                }
                else {
                    j++;
                }
            }
            sort(arr, low, i-1);
            sort(arr, k+1, high);
        }
    }
    
    public static ArrayList<Integer> quickSortUsingDutchNationalFlag(ArrayList<Integer> arr) {
        // Write your code here.
        sort(arr, 0, arr.size()-1);
        return arr;
    }
}
