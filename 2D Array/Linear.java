package Array_2D;

public class Linear {
	int linear(int[][] arr,int element) {
		for(int i=0 ; i<3;i++) {
			for(int j=0;j<3;j++) {
				if(arr[i][j]==element) {
					return 1;
				}
			}
		}return 0;
		
	}
	public static void main(String[] args) {
		Linear obj = new Linear();
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		int n = 4;
		System.out.println(obj.linear(array, n));
	}

}
