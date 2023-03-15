package java_tutorial;
import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the price of book :");
		float book  = obj.nextFloat();
		System.out.print("Enter the price of pencil :");
		float pencil = obj.nextFloat();
		System.out.print("Enter the price of eraser :");
		float eraser = obj.nextFloat();
		System.out.println("Extra 18% GST is applied");
		float total = (book+pencil+eraser);
		System.out.println("Total bill: "+ (total + (total*18)/100));
	}

}
