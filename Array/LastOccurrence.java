package Array;

public class LastOccurrence {
	int last(int[] arr ,int element) {
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==element) {
				ans = mid;
				start = mid +1;
			}
			else if(arr[mid]>element) {
				end = mid-1;
			}
			else {
				start = mid +1;
			}
		}return ans;
	}
	public static void main(String[] args) {
		LastOccurrence obj = new LastOccurrence();
		int[] array = {1,3,3,5};
		int key = 3;
		System.out.println(obj.last(array, key));
	}

}
