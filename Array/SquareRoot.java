package Array;

public class SquareRoot {
	long search(int num) {
		int start = 0;
		int end = num;
		int mid = start+(end-start)/2;
		long ans = 0;
		while(start<=end) {
			long square = (long)mid*(long)mid;
			if(square==num) {
				ans = mid;
				return ans;
			}
			else if(square>num) {
				end = mid-1;
			}
			else {
				ans = mid;
				start = mid+1;
			}mid = start+(end-start)/2;
		}return ans;
	}
	int sqrt(int x) {
		return (int) search(x);
	}
	public static void main(String[] args) {
		SquareRoot obj = new SquareRoot();
		System.out.println(obj.sqrt(2147395599));
		
	}

}
