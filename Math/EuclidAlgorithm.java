package Math;
//This algorithm is used to find gcd;

public class EuclidAlgorithm {
	int gcd(int a,int b) {
		if(a==0)
			return b;
		if(b==0)
			return a;
		while(a!=b) {
			if(a>b) {
				a = a-b;
			}
			else {
				b= b-a;
			}
		}return a;
	}
	public static void main(String[] args) {
		EuclidAlgorithm  obj = new EuclidAlgorithm ();
		System.out.println(obj.gcd(72, 24));
		
	}

}
