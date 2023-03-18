package Array;
import java.util.Scanner;
public class CreateArray {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the element of array:");
		int arr[] = new int[5];
		for (int i = 0;i<arr.length;i++) {
			arr[i] = obj.nextInt();
			
		}
		for(int j = 0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
