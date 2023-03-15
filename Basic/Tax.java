package java_tutorial;
import java.util.Scanner;
public class Tax {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter your income (in Lacs): ");
		int income = obj.nextInt();
		if(income <=5) {
			System.out.println("0 % tax");
		}else if(income>5 && income <=10) {
			System.out.println("10 % tax appllied");
		}
		else {
			System.out.println("30 % tax will be apply");
		}
	}

}
