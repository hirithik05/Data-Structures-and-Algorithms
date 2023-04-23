package Array_2D;
import java.util.*;

public class MaxSum {
	void maxSum(int[][] arr ,int row,int col) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<row;i++) {
			int sum = 0;
			for(int j=0;j<col;j++) {
				sum +=arr[i][j];
			}
			if(sum>max) {
				max = sum;
			}
		}
		System.out.println("Max sum : "+ max);
	}
	public static void main(String[] args) {
		MaxSum obj = new MaxSum();
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		obj.maxSum(array, 3, 3);
		
	}

}
