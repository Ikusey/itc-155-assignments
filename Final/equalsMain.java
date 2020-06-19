import java.util.Stack;

public class equalsMain {

	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		
		Stack<Integer> s2 = new Stack<Integer>();
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(4);
		
		Stack<Integer> s3 = new Stack<Integer>();
		s3.add(1);
		s3.add(2);
		s3.add(3);
		s3.add(5);
		
		System.out.println(equals(s1,s2));
		System.out.println(equals(s1,s3));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

	private static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
		if(s1.size() == 0 && s2.size() == 0) return true;
		else if( s1.size() != s2.size()) return false;
		boolean status = true;
		Stack<Integer> temp = new Stack<Integer>();
		while(!s1.isEmpty()) {
			int s1Num = s1.pop();
			int s2Num = s2.pop();
			if(s1Num == s2Num) {
				temp.add(s1Num);
				temp.add(s2Num);
			} else { 
				temp.add(s1Num);
				temp.add(s2Num);
				status = false;
			}
		}
		while(!temp.isEmpty()) {
			System.out.println(temp);
			s2.add(temp.pop());
			s1.add(temp.pop());
		}
		
		return status;
	}

}
