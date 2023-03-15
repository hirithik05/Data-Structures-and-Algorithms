package java_tutorial;
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = obj.nextInt();
		System.out.print("Enter second number: ");
		int num2 = obj.nextInt();
		System.out.println(num1 += num2);
		System.out.println(num1 -= num2);
		System.out.println(num1 *= num2);
		System.out.println(num1 /= num2);
		System.out.println(num1 %= num2);
		
		
	}

}
