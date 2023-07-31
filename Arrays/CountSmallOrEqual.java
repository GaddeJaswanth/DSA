import java.util.* ;
import java.io.*; 
public class Solution {

    public static int binarySearch(int[] b, int key){
        int start = 0, end = b.length-1, count = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(b[mid]<=key){
                count = count + mid - start + 1;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return count;
    }
    public static List<Integer> countSmallerOrEqual(int[] a, int[] b, int n, int m) {
        // Write your code here!
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            ans.add(binarySearch(b, a[i]));
        }
        return ans;
    }
}

// Finding the no. of elements in 'b' that are smaller or equal to elements in 'a' with respect to every element using Binary Search.
