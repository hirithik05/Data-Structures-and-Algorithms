package Sorting;

public class BubbleSort {
	void bubble(int[] arr) {
		for(int i = 1;i<arr.length;i++) {
			for(int j = 0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = 0;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int[] array = {10,1,7,6,14,9};
		BubbleSort obj = new BubbleSort();
		obj.bubble(array);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
