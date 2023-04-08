package Array;

public class ReverseArray2 {
	void reverse(int[] arr , int n) {
		int start = n+1;
		int end = arr.length-1;
		while(start<=end) {
			int temp = arr[start];
			arr[end] = arr[start];
			arr[start] = temp;
			start+=1;
			end-=1;
		}
	}
	public static void main(String[] args) {
		int[] array = {10,4,5,2,3,6,1,3,6};
		int m = 3;
		ReverseArray2 obj = new ReverseArray2();
		obj.reverse(array, m);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}System.out.println();
		
	}

}
