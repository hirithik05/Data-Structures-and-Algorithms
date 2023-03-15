package java_tutorial;
import java.util.Scanner;

public class Greatest_of_three {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = obj.nextInt();
		System.out.print("Enter the second number :");
		int b = obj.nextInt();
		System.out.print("Enter the third number :");
		int c = obj.nextInt();
		if(a>b && a >c) {
			System.out.println(a);
		}
		else if (b > a && b > c) {
			System.out.println(b);
		}
		else
			System.out.println(c);
	}
	

}
