package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	public static void main(String[] args) {
		// 1. collections.synchronized
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		
		nameList.add("java");
		nameList.add("Python");
		nameList.add("Ruby");
		
		// add, remove --we don't need explicit synchronization
		// for fetch/traverse the value from List --- we need to use explicit synchronization
		
		synchronized (nameList) {
			Iterator it = nameList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
		}
		
		//2. copyOnWriteArrayList -- it is a class : Thread-safe already synchronized
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Govind");
		empList.add("Govindrao");
		empList.add("Govindrao Bhombe");
		
		//we don't need any explicit synchronization for any operation add/remove/traverse
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
