package Array;
import java.util.*;

public class IntersectionArray {
	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {3,4};
		int i =0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}System.out.println(ans);
	
	}
}
