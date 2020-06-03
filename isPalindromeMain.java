
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
		
//		System.out.println(nums);
		System.out.println(isPalindrome(nums));
//		System.out.println(nums);
	}

	private static boolean isPalindrome(Queue<Integer> nums) {
		if(nums.isEmpty())return true;
		Stack<Integer> temp = new Stack<Integer>();
		int numsize = nums.size();
		for(int i = 0; i < numsize/2; i++) {
			int number = nums.remove();
			temp.push(number);
			nums.add(number);
		}
		System.out.println(nums);
		System.out.println(temp);
		return true;
	}
}
