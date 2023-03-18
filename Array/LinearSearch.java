package Array;
import java.util.Scanner;

public class LinearSearch {
	int linear(int[] arr,int X) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==X) {
				return i;
			}
			
		}
			return -1;
	}
	public static void main(String[] args) {
		int[] arr1 = {2,4,6,7,9};
		LinearSearch obj = new LinearSearch();
		System.out.println(obj.linear(arr1, 4));
	}

}
