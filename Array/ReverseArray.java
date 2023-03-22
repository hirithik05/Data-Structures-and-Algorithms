package Array;

public class ReverseArray {
	public static void main(String[] args) {
		int[] array = {2,7,5,9};
		int start = 0;
		int end = array.length-1;
		while(start <=end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start +=1;
			end -=1;
		}
		for(int i = 0;i<array.length;i++) {
			System.out.print(array[i] +" ");
			
		}System.out.println();
	}

}
