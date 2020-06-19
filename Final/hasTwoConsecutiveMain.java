

public class hasTwoConsecutiveMain {

	public static void main(String[] args) {
		LinkedIntList l1 = new LinkedIntList();
		l1.add(1);
		l1.add(2);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		LinkedIntList l2 = new LinkedIntList();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		
		System.out.println(l1.hasTwoConsecutive());
		System.out.println(l2.hasTwoConsecutive());
	}

	

}
