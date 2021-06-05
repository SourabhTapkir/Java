package Day5;

import java.util.ArrayList;

public class LambdaFunction {

	public static void main(String[] args) {
	
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.add("Sourabh");
			arrayList.add("Prathamesh");
			arrayList.add("Prathamesh 2");
			arrayList.add("Prathamesh 3");
			arrayList.add(2, "Some Name"); // inserting element in between 2 elements

			ArrayList<String> arrayList2 = new ArrayList<>();
			
			arrayList.forEach((word) -> {
				if(word.contains("Prathamesh"))
					arrayList2.add(word);
				}
			);
			
			arrayList2.forEach((word) -> System.out.println(word));

	}

}
