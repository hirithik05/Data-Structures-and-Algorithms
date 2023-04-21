package String;

import java.util.Scanner;

public class PallindromString {
	boolean reverse(char[] st) {
		int start = 0;
		int end = st.length-1;
		while(start<=end) {
			if(st[start]==st[end]) {
				start++;
				end--;
			}
			else {
				return false;
			}
		}return true;
	}
	
	public static void main(String[] args) {
		PallindromString obj = new PallindromString();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		char[] str = sc.next().toCharArray();
		System.out.println(obj.reverse(str));

	}

}
