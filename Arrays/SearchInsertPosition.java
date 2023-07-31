public class Solution {
    public static int searchInsert(int [] arr, int m){
        // Write your code here.
        if(arr[0]>=m){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==m){
                return i;
            }
            if(arr[i-1]<m && arr[i]>m){
                return i;
            }
        }
        if(arr[arr.length-1]<=m){
            return arr.length;
        }
        return -1;
    }
}

//Find appropriate position for 'm' in 'arr'
//Given array 'arr' is not sorted.
//If a sorted Array is given -> use Binary search instead of linear search as above.
