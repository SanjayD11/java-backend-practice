package day20.Collections.ArrayList;
import java.util.ArrayList;
public class DupsRemoved {
public static void main(String[] args) {
	ArrayList<Integer> arrL1 = new ArrayList<>();
	ArrayList<Integer> temp = new ArrayList<>();
	arrL1.add(10);
	arrL1.add(10);
	arrL1.add(20);
	arrL1.add(30);
	arrL1.add(30);
	int j = 0;
	for (int i = 0; i < arrL1.size(); i++) {
		if(temp.contains(arrL1.get(i))) {
			continue;
		}
		temp.add(arrL1.get(i));
		
	}
System.out.println("ArrayList after the removal of Duplicate elements : "+temp);
}
}
