package Array;
import java.util.*;
public class Check {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int s = 5;
		ArrayList<int[]> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==s) {
					list.add(new int[] {arr[i],arr[j]});
				}
			}
		}
		for(int k =0;k<list.size();k++) {
			System.out.println(list.get(k));
		}
	}

}
