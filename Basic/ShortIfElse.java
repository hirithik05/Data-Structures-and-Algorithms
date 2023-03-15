package java_tutorial;
import java.util.Scanner;

public class ShortIfElse {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = obj.nextInt();
		System.out.print("Enter the second number: ");
		int num2= obj.nextInt();
		int c  = (num1>num2)?(num1):(num2);
		System.out.println(c);
	}

}
