import java.util.*;

public class Assignment3ArrayList {

	public static void main(String[] args) {
		ArrayList<String> evenOdd = new ArrayList<String>();
		evenOdd.add("one");
		evenOdd.add("two");
		evenOdd.add("three");
		evenOdd.add("four");
		evenOdd.add("five");
		System.out.println(evenOdd);
		removeEvenLength(evenOdd);
		System.out.println(evenOdd);
		
		doubleList(evenOdd);
		System.out.println(evenOdd);
	}

	private static void doubleList(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i+=2) {
			list.add(i+1, list.get(i));
		}
		
	}

	private static void removeEvenLength(ArrayList<String> list) {
		String s;
		for(int i = 0; i < list.size(); i++) {
			s = list.get(i);
			if (s.length() % 2 == 0) {
				list.remove(s);
				i--;
			}
		}
		
	}

}
