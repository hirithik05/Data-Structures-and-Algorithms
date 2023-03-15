package java_tutorial;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		boolean check = true;
		System.out.print("Enter a number : ");
		int num = obj.nextInt();
		for (int i = 2 ; i < num ;i++) {
			if(num % i==0) {
				check = false;
				break;
			}
		}
		if(check ==true) {
			System.out.println("Prime Number");
		}
		else
			System.out.println("Not a Prime Number");
		
	}

}
