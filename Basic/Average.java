package java_tutorial;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = obj.nextInt();
		System.out.print("Enter secong number: ");
		int num2 = obj.nextInt();
		System.out.print("Enter third number: ");
		int num3 = obj.nextInt();
		float average = (num1+num2+num3)/3;
		System.out.println("Average: "+average);
		
	}

}
