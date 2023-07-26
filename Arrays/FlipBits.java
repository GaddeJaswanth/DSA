package Arrays;
public class FlipBits {
	public static int flipBits(int[] arr,int n) {
        //Write your code here
		int ans = Integer.MIN_VALUE;
		int one = 0, zero = 0;

		for(int i=0;i<n;i++){
			if(arr[i]==0){
				zero++;
			}
			else {
				zero--;
				one++;
				if(zero<0){
					zero = 0;
				}
			}
			if(ans<zero){
				ans = zero;
			}
		}
		return ans + one;
	}
	
	public static void main(String[] args) {
		int[] ex = {1,1,0,0,1};
		System.out.print(flipBits(ex, ex.length));
	}
}
