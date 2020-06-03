
import java.util.*;

public class isPalindromeMain {

	public static void main(String[] args) {
		Queue<Integer> nums = new LinkedList<Integer>();
		nums.add(3);
		nums.add(8);
		nums.add(17);
		nums.add(9);
		nums.add(117);
		nums.add(8);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(isPalindrome(nums));
		System.out.println(nums);
	}

	private static boolean isPalindrome(Queue<Integer> nums) {
		if(nums.isEmpty())return true;
		Stack<Integer> temp = new Stack<Integer>();
		int numsize = nums.size();
		boolean decider = true;
		for(int i = 0; i < numsize; i++) {
			int number = nums.remove();
			temp.push(number);
			nums.add(number);
		}
		while(!temp.isEmpty()) {
			int number = nums.remove();
			if(!(number == temp.peek())) {
				decider = false;
			}
			nums.add(temp.pop());
		}
		while(!nums.isEmpty()) {
			int n = nums.remove();
			temp.push(n);
		}
		while(!temp.empty()) {
			int n = temp.pop();
			nums.add(n);
		}
		return decider;
	}
}
