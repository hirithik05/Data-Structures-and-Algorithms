package Array;

import java.util.*;

public class KadaneAlgorithm {
	int kadane(int[] arr) {
		int max_sum = Integer.MIN_VALUE;
		int current = 0;
		for (int i = 0; i < arr.length; i++) {
			current = current + arr[i];
			if (current < 0) {
				current = 0;
			}
			max_sum = Math.max(current, max_sum);
		}
		return max_sum;
	}

	public static void main(String[] args) {
		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
		KadaneAlgorithm obj = new KadaneAlgorithm();
		System.out.println(obj.kadane(array));
	}

}
