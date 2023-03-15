package java_tutorial;
import java.util.Scanner;

public class Even_number_in_range {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Starting range :");
		int start = obj.nextInt();
		System.out.print("Ending range :");
		int end = obj.nextInt();
		for (int i = start+1 ; i <end ; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		
		}System.out.println();
	}

}
