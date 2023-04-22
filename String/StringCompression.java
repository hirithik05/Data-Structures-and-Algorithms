package String;

public class StringCompression {
	public int compress(char[] chars) {
	    int ans = 0;

	    for (int i = 0; i < chars.length;) {
	      char alphabet = chars[i];
	      int count = 0;
	      while (i < chars.length && chars[i] == alphabet) {
	        count++;
	        i++;
	      }
	      chars[ans++] = alphabet;
	      if (count > 1)
	        for ( char c : String.valueOf(count).toCharArray())
	          chars[ans++] = c;
	    }

	    return ans;
	  }
	public static void main(String[] args) {
		StringCompression obj = new StringCompression();
		char[] array = {'a','a','b','b','c','c','c'};
		System.out.println(obj.compress(array));
	}

}
