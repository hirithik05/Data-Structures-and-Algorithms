package Array;

public class PassByReference {
	public static void check(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
	}
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		check(arr1);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
