package Array;

public class BinarySearch {
	int display(int[] arr,int key) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]>key) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}return -1;
	}
		public static void main(String[] args) {
			BinarySearch obj = new BinarySearch();
			int[] array = {5,11,13,17,19};
			int key = 17;
			System.out.println(obj.display(array, key));
			
		}

}
