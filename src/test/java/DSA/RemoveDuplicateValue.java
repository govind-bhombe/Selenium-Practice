package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateValue {
	
	public static void main(String[] args) {
		//int number[] = {1,2,2,3,4,2,2,2,2,4,5,6,4,4,7,6,7,8,9,2,4,5};
		ArrayList <Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,2,2,2,2,4,5,6,4,4,7,6,7,8,9,2,4,5));
		
		//LinkedHashSet
		LinkedHashSet<Integer> linkedhashsetduplicate = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> numberListWithoughtDuplicates = new ArrayList<Integer>(linkedhashsetduplicate);
		System.out.println(numberListWithoughtDuplicates);
		
	}

}
