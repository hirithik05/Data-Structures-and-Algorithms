package Array;
import java.util.*;

public class LargestInArray {
	int largest(int[] arr) {
		int large = Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}return large;
		
	}
	public static void main(String[] args) {
		int array[] = {3,4,2,5,7,8};
		LargestInArray obj = new LargestInArray();
		System.out.println(obj.largest(array));
	}

}
