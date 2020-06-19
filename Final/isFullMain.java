
public class isFullMain {

	public static void main(String[] args) {
		IntTree t = new IntTree(11);
		System.out.println("Tree structure:");
        t.printSideways();
		System.out.println(t.isFull());
		
		IntTree j = new IntTree(12);
		System.out.println("Tree structure:");
        j.printSideways();
		System.out.println(j.isFull());
	}

}
