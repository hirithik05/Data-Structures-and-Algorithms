package String;

public class MaximumOccurInString {
	char maxOccur(String s) {
		int[] element = new int[26];
		int number = 0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			number = ch - 'a';
			element[number]++;
		}
		//check occurence
		int max = -1;
		int ans = 0;
		for(int i=0;i<26;i++) {
			if(max<element[i]) {
				ans = i;
				max = element[i];
			}
			
		}return (char)(ans+'a');
		
	}
	public static void main(String[] args) {
		String s = "Ritik";
		MaximumOccurInString obj = new MaximumOccurInString();
		System.out.println(obj.maxOccur(s));
	}
}
