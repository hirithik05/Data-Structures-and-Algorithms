package Array;

public class FirstOccurrence {
	int firstOccu(int[] arr , int element) {
		int start =0;
		int end = arr.length-1;
		int ans = 0;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==element) {
				ans = mid;
				end = mid-1;
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
		int[] array = {1,3,3,5};
		int key = 5;
		FirstOccurrence obj = new FirstOccurrence();
		System.out.println(obj.firstOccu(array, key));

	}

}
