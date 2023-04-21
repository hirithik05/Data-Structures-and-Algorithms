package String;
import java.util.Scanner;

public class CharacterArray {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the element: ");
		char[] name=obj.next().toCharArray();
		for(int i =0;i<name.length;i++) {
			System.out.print(name[i]);
		}
		
		
		
	}

}
