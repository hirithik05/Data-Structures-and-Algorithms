package java_tutorial;
import java.util.Scanner;
public class Logical {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = obj.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = obj.nextInt();
		System.out.println((num1 >num2 && num1>0));
		System.out.println((num1 <num2 || num1>0));
		System.out.println(!(num1>0));
		
		
	
	}

}
