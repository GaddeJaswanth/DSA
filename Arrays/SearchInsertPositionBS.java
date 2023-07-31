class Solution {

    int mid;

    public int binary(int[] nums,int target,int start,int end){
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
        }

        if(nums[mid]<target){
            return mid+1;
        }
        else {
            return mid;
        }
    }

    public int searchInsert(int[] nums, int target) {
        return binary(nums, target, 0, nums.length-1);
    }
}

//Find appropriate position for 'target' in 'nums[]'
//Given array 'nums' is sorted in increasing order.
