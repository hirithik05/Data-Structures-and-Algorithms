package String;

import java.util.Scanner;

public class ReverseString {

	void reverse(char[] str) {
		int start = 0;
		int end = str.length - 1;
		while (start <= end) {
			char temp = str[end];
			str[end] = str[start];
			str[start] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		char[] name = sc.next().toCharArray();
		obj.reverse(name);
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
		}System.out.println();

	}

}
