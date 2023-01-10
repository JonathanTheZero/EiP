
public class BinarySearchTreeApplication {

	public static void main(String[] args) throws Exception {
		BinarySearchTree<Integer> root = new BinarySearchTree<Integer>(45);
		root.append(13);
		root.append(100);
		root.append(9);
		root.append(26);
		root.append(94);
		root.append(63);
		root.append(102);
		printNodes(root);
	}

	//recursive in-order printing
	public static void printNodes(BinarySearchTree root) {
		if (root == null) {
			return;
		}
		printNodes(root.getLeft());
		System.out.print(root.getValue() + ", ");
		printNodes(root.getRight());
	}

}
