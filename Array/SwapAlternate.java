package Array;

public class SwapAlternate {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		for (int i=0;i<array.length;i+=2) {
			if(i+1<array.length) {
				int temp = array[i+1];
				array[i+1] = array[i];
				array[i] = temp;
			}
		}
		for (int j=0;j<array.length;j++) {
			System.out.print(array[j]+" ");
		}System.out.println();
	}
}
