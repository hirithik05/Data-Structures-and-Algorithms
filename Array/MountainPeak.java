package Array;

public class MountainPeak {
	int display(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int mid = start+(end-start)/2;
		while(start<end) {
			if(arr[mid]<arr[mid+1]) {
				start = mid +1;
			}
			else {
				end = mid;
			}
			mid = start+(end-start)/2;
		}
		return mid;
	}
	public static void main(String[] args) {
		int[] array = {0,2,1,0};
		MountainPeak obj = new MountainPeak();
		System.out.println(obj.display(array));
	}

}
