package java_tutorial;
import java.util.Scanner;
public class Area_circle {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the radius of circle : ");
		int radius = obj.nextInt();
		System.out.println("Area of circle : "+ 3.14 * radius * radius);
	}

}
