package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrayList {
	public static void main(String[] args) {
		// 1. sort & then equals
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("a","b","c","d","e"));
		ArrayList<String> l2= new ArrayList<String>(Arrays.asList("b","c","d","e","a"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2)); // all letters in small case then true
		
		// 2. find out additional element
		
		ArrayList<Integer> no1= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		ArrayList<Integer> no2= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		no1.removeAll(no2);
		System.out.println(no1);
		
		// 3. find out missing element
		
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l4= new ArrayList<String>(Arrays.asList("A","C","B","E","D","F"));
		l4.removeAll(l3);
		System.out.println(l4);
		
		// 4. find out the common element
		
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l6= new ArrayList<String>(Arrays.asList("A","C","B","E","D","F"));
		l5.retainAll(l6);
		System.out.println(l5);
		
		// checking conflicts

		// Test Conflicts

		// conflict resolved
	}

}