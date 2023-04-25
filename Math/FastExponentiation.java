package Math;

public class FastExponentiation {
	int exponent(int x,int y) {
		int result = 1;
		while(y>0) {
			if((y&1)!=0) {
				result = result*x;
			}
			y = y>>1;
			x = x*x;
		}
		return result;
	}
	public static void main(String[] args) {
		FastExponentiation obj = new FastExponentiation();
		System.out.println(obj.exponent(2, 3));
	}

}
