package Day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class DataStructure {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("Sourabh");
		arrayList.add("Tapkir");
		arrayList.add(2,"Any Name");  // Inserting elementi n between 2 elements
		
		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
		}
		
		arrayList.clear();
		
		System.out.println(arrayList.contains("Sourabh"));
		
		arrayList.forEach((word) -> System.out.println(word));
		
		for (String word : arrayList) {
			System.out.println(word);
		}
		
		// LinkedList
		LinkedList<String>LinkedList = new LinkedList<>();
		LinkedList.add("Suyesh");
		LinkedList.add("Suru");
		LinkedList.add("Test");
		LinkedList.add("Test 2");
		
		for (String word : LinkedList) {
			System.out.println(word);
		}
		
		LinkedList.add("First Element");
		LinkedList.add("Last Element");
		System.out.println(LinkedList.getFirst());
		System.out.println(LinkedList.getLast());
		
		System.out.println("After Adding First & Last Element");
		for (String word : LinkedList) {
			System.out.println(word);
		}
		
		LinkedList.removeFirst();
		LinkedList.removeLast();
			System.out.println("After Removing First & Last Element");

	
	 for (String word : LinkedList) {
		 System.out.println(word);
	 }
	 Iterator<String> it2 = LinkedList.iterator();
	 while (it2.hasNext()) {
		 System.out.println(it2.next());
	 }
	 
	 // HashMap
	 HashMap<String, String> hashMap = new HashMap<>();
	 hashMap.put("name 1", "Sourabh");
	 hashMap.put("name 2", "Test");
	 hashMap.put("name 3", "Test 2");
	 hashMap.put("name 4", "Test 3");
	 hashMap.put("name 5", "Sourabh");
	 hashMap.put("name 1", "Test");
	 
	 
	 // Hash Set
	 HashSet<String> hashSet = new HashSet<>();
	 hashSet.add("Sourabh");
	 hashSet.add("Sourabh");
	 hashSet.add("Sourabh");
	 hashSet.add("Test");
	 hashSet.add("Test");
	 hashSet.add("Test 2");
	 
	 for (String Value : hashSet) {
		 System.out.println(Value);
	 }
	 
	 Iterator<String> it4 = hashSet.iterator();
	 while(it4.hasNext()) {
		 System.out.println(it4.next());
	 }
   
	}
	
}