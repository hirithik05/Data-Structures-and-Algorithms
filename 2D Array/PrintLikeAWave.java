package Array_2D;

public class PrintLikeAWave {
	int[] wave(int[][] arr, int row, int col) {
		int[] answer = new int[row * col];
		int k = 0;
		for (int j = 0; j < col; j++) {
			// Even index of column
			if (j % 2 == 0) {
				for (int i = 0; i < row; i++) {
					answer[k++] = arr[i][j];
				}
			} else {
				for (int i = row - 1; i >= 0; i--) {
					answer[k++] = arr[i][j];
				}
			}

		}return answer;
	}

	public static void main(String[] args) {
		PrintLikeAWave obj = new PrintLikeAWave();
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		obj.wave(array, 3, 3);

	}

}
