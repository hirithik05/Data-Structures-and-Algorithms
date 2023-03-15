package java_tutorial;
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = obj.nextInt();
		System.out.print("Enter second number : ");
		int num2 = obj.nextInt();
		System.out.println("Addition: " + (num1+num2));
		System.out.println("Subtraction: " + (num1-num2));
		System.out.println("Multiplication " + (num1*num2));
		System.out.println("Division: " + (num1/num2));
		System.out.println("Modulo: " + (num1%num2));
	}

}
