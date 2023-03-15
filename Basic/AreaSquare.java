package java_tutorial;
import java.util.Scanner;

public class AreaSquare {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the size of a square: ");
		int size = obj.nextInt();
		System.out.println("Area of square : "+ size*size);
	}

}
