package Array_2D;
import java.util.*;

public class SpiralMatrix {
	List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList();
		int row = matrix.length;
		int col = matrix[0].length;
		int count = 0;
		int total = row * col;

		// index
		int startingRow = 0;
		int startingCol = 0;
		int endingRow = row - 1;
		int endingCol = col - 1;

		while (count < total) {
			// first row print
			for (int index = startingCol; count < total && index <= endingCol; index++) {
				ans.add(matrix[startingRow][index]);
				count++;
			}
			startingRow++;
			// print ending column
			for (int index = startingRow; count < total && index <= endingRow; index++) {
				ans.add(matrix[index][endingCol]);
				count++;
			}
			endingCol--;
			// print buttomrow
			for (int index = endingCol; count < total && index >= startingCol; index--) {
				ans.add(matrix[endingRow][index]);
				count++;
			}
			endingRow--;
			// print first column
			for (int index = endingRow; count < total && index >= startingRow; index--) {
				ans.add(matrix[index][startingCol]);
				count++;
			}
			startingCol++;

		}
		return ans;
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		SpiralMatrix obj = new SpiralMatrix();
		System.out.println(obj.spiralOrder(arr));
	}

}
