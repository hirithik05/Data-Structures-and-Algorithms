package java_tutorial;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = obj.nextInt();
		if(num %2==0) {
			System.out.println("Number is divisible by 2");
		}
		else
			System.out.println("Not divisible");
		
	}

}
