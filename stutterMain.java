

import java.util.*;

public class stutterMain {

	public static void main(String[] args) {
		Stack<Integer> nums = new Stack<Integer>();
		nums.push(3);
		nums.push(7);
		nums.push(1);
		nums.push(14);
		nums.push(9);
		
		System.out.println(nums);
		stutter(nums);
		System.out.println(nums);
	}
	
	public static void stutter(Stack<Integer> nums) {
		Queue<Integer> temp = new LinkedList<Integer>();
		while(!nums.empty()) {
			int n = nums.pop();
			temp.add(n);
		}
		while(!temp.isEmpty()) {
			int n = temp.remove();
			nums.push(n);
			nums.push(n);
		}
		while(!nums.empty()) {
			int n = nums.pop();
			temp.add(n);
		}
		while(!temp.isEmpty()) {
			int n = temp.remove();
			nums.push(n);
		}
	}

}
