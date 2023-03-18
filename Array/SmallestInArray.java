package Array;
import java.util.*;

public class SmallestInArray {
	int smallest(int[] arr) {
		int small = Integer.MAX_VALUE;
		for(int i= 0;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}
		}return small;
	}
	public static void main(String[] args) {
		int array[]= {2,4,1,7,8,9};
		SmallestInArray obj = new SmallestInArray();
		System.out.println(obj.smallest(array));
	}

}
