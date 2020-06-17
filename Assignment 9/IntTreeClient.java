
// Short program that demonstrates the use of the IntTree class.

public class IntTreeClient {
    public static void main(String[] args) {
        IntTree t = new IntTree(0);
        System.out.println(t.countEmpty());
        System.out.println("Tree structure:");
        t.printSideways();
        System.out.println();
        t.printPreorder();
        t.printInorder();
        t.printPostorder();
        System.out.println();
        
        IntTree j = new IntTree(12);
        System.out.println(j.countEmpty());
        System.out.println("Tree structure:");
        j.printSideways();
        System.out.println();
        j.printPreorder();
        j.printInorder();
        j.printPostorder();
        
    }
}

