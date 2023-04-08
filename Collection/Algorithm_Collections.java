package Collections;

import java.util.Arrays;

public class Algorithm_Collections {
	public static void main(String[] args) {
		int[] arr = {2,4,5,6,7,8};
		int[] arr1 = {4,3,1,8,6,4,9};
		//Binary Search
		int index = Arrays.binarySearch(arr, 6);
		System.out.println(index);
		//Sorting
		Arrays.sort(arr1);
	}

}
