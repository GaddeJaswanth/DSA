package Arrays;
import java.util.ArrayList;
public class MaxSubarrayKConcat {
	public static long kadane(ArrayList<Integer> arr, int n, int k){
		long maxHere = 0, maxSoFar = Integer.MIN_VALUE;

		for(int i=0;i<n*k;i++){
			maxHere += arr.get(i%n);
			if(maxSoFar<maxHere){
				maxSoFar = maxHere;
			}
			if(maxHere<0){
				maxHere = 0;
			}
		}
		return maxSoFar;
	}
	
	public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
		// Write your code here.
		if(k==1){
			return kadane(arr, n, k);
		}
		int sum = 0;
		for(int i: arr){
			sum += i;
		}
		long res;
		if(sum<=0){
			res = kadane(arr, n, 2);
		}
		else {
			res = kadane(arr, n, 2);
			res += (long)(k-2)*(long)sum;
		}
		return res;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(1);
		arr.add(3);
		
		System.out.println(maxSubSumKConcat(arr, 2, 3));
	}
}
