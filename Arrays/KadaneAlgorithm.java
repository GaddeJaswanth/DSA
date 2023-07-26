package Arrays;
public class KadaneAlgorithm {
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long maxHere = 0;
		long maxSoFar = Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			maxHere += arr[i];
			if(maxHere<0){
				maxHere = 0;
			}
			if(maxSoFar<maxHere){
				maxSoFar = maxHere;
			}
		}
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		int[] example = {1, 2, 7, -4, 3, 2, -10, 9, 1};
		System.out.println(maxSubarraySum(example, example.length));
	}
}
