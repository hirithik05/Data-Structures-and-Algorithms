package Array;

public class MovesZeroes {
	void move(int[] arr) {
		int start = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] != 0) {
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i]= temp;
				start++;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] array = {0,1,2,0,1,4,0};
		MovesZeroes obj = new MovesZeroes();
		obj.move(array);
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
