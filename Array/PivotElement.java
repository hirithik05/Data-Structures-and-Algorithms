package Array;

public class PivotElement {
	int check(int[] arr){
		int start = 0;
		int end = arr.length-1;
		int ans = 0;
		int mid = start+(end-start)/2;
		while(start<end) {
			if(arr[mid]>=arr[0]) {
				start= mid+1;
			}
			else {
				end = mid;
			}
			mid = start+(end-start)/2;
		}return start;
	}
	public static void main(String[] args) {
		int[] array = {7,9,1,2,3}; //Rotated and shorted array
		PivotElement obj = new PivotElement();
		System.out.println(obj.check(array));
		
		
	}

}
