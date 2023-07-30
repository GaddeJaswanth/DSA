import java.util.* ;
import java.io.*; 
public class Solution{
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){
		if(arr.size()<3){
			return false;
		}

		Collections.sort(arr); //Try any sorting Algorithm

		for(int i=0;i<arr.size()-2;i++){
			if(arr.get(i)+arr.get(i+1)>arr.get(i+2)){
				return true;
			}
		}
		return false;
	}
}
