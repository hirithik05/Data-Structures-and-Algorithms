package Array;

public class UniqueElement {
	public static void main(String[] args) {
		int[] arr = {1,3,4,1,3};
		int ans = 0;
		for (int i =0;i<arr.length;i++) {
			ans = ans ^ arr[i];
		}
		System.out.println("Unique Element :" + ans);
	}

}
