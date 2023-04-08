package Array;

import java.util.ArrayList;

public class MergeSortedArray {
	ArrayList<Integer> merge(int[] left , int[] right) {
		ArrayList<Integer> arr = new ArrayList<>();
		int left_index = 0;
		int right_index = 0;
		
		//first condition
		while(left_index<left.length && right_index <right.length) {
			if(left[left_index] < right[right_index]) {
				arr.add(left[left_index]);
				left_index++;
			}
			else {
				arr.add(right[right_index]);
				right_index++;
			}
			
		}
		//second condition
		while(left_index<left.length) {
			arr.add(left[left_index]);
			left_index++;
		}
		//third condition
		while(right_index<right.length) {
			arr.add(right[right_index]);
			right_index++;
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] array1 = {3,5,6,7,8};
		int[] array2 = {1,2,3,4,5,6,7};
		MergeSortedArray obj = new MergeSortedArray();
		System.out.println(obj.merge(array1, array2));
		
	}

}
