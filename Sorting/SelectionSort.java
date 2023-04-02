package Sorting;

public class SelectionSort {

	void selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}

	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int[] array = { 64, 25, 12, 22, 11 };
		obj.selection(array);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
}
