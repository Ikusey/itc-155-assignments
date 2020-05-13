package itc155_workspace;

public class Assignment5 {

	public static void main(String[] args) {
		writeNums(5);
		System.out.println();
		writeNums(12);
		System.out.println();
		writeNums(0);
	}

	private static void writeNums(int i) {
		if(i < 1) throw new IllegalArgumentException();
		else if(i == 1) System.out.print(i);
		else {
			writeNums(i-1);
			System.out.print(", " + i);
		}
		
	}

}
