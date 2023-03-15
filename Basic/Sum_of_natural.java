package java_tutorial;
import java.util.Scanner;

public class Sum_of_natural {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter natural number: ");
		int num = obj.nextInt();
		int Sum = 0;
		for (int i = 0 ; i <=num;i++) {
			Sum += i;
		}
		System.out.println("Sum of natural number: "+ Sum);
		}

}
