package Collections;
import java.util.ArrayList;

public class Array {
	public static void main(String[] args) {
		ArrayList <Integer> obj = new ArrayList<>();
		//Add element in arraylist
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println(obj);
		//Add element by providing index .add(index,element)
		obj.add(5,6);
		//display element by providing index
		obj.get(3);
		//remove element by providing index
		obj.remove(0);
		//element present in aaraylist or not
		obj.contains(4);
		//length of arraylist
		obj.size();
		
	 }
}
