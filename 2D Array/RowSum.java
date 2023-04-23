package Array_2D;

public class RowSum {
	void sum(int[][] arr,int row,int col) {
		
		for(int i=0;i<row;i++) {
			int Sum=0;
			for(int j=0;j<col;j++) {
				Sum = Sum+arr[i][j];
			}
			System.out.print(Sum+" ");
		}
	}
	public static void main(String[] args) {
		RowSum obj = new RowSum();
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		obj.sum(array, 3, 3);
		
	}

}
