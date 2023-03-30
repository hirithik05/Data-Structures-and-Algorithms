package Array;

public class BookAllocation {
	boolean isPossible(int[] arr ,int n, int student,int mid) {
		int studentCount = 1;
		int pageSum = 0;
		for(int i = 0;i<n;i++) {
			if(pageSum +arr[i]<=mid) {
				pageSum+=arr[i];
			}
			else {
				studentCount++;
				if(studentCount>student || arr[i]>mid) {
					return false;
				}
				else {
					pageSum = arr[i];
				}
			}
		}return true;
		
		
	}
	
	public int allocation(int[] arr,int n,int student) {
		int start = 0;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum += arr[i];
		}
		int end = sum;
		int ans = 0;
		int mid = start+(end-start)/2;
		while(start<=end) {
			if(isPossible(arr , n, student, mid)) {
				ans = mid;
				end = mid-1;
			}
			else {
				start = mid+1;
			}
			mid = start+(end-start)/2;
		}return ans;
	}
	public static void main(String[] args) {
		BookAllocation obj = new BookAllocation();
		int[] array = {10,20,30,40};
		int size = 4;
		int st = 2;
		System.out.println(obj.allocation(array,size,st));
		
	}

}
