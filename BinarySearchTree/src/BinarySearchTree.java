
/**
 * Implemented to work with generic Type parameters, as long as they are
 * comparable
 * 
 * For example: Integer, Double, Float, etc...
 */
public class BinarySearchTree<T extends Comparable<T>> {
	private T value;
	private BinarySearchTree<T> left;
	private BinarySearchTree<T> right;

	public BinarySearchTree(T value) {
		this.value = value;
		left = null;
		right = null;
	}

	// No need to check if B is empty as my constructor cannot be called without an
	// value
	public void append(T newVal) throws Exception {
		if (value.compareTo(newVal) > 0) {
			if (left == null) {
				left = new BinarySearchTree<T>(newVal);
			} else {
				left.append(newVal);
			}
		} else if (value.compareTo(newVal) < 0) {
			if (right == null) {
				right = new BinarySearchTree<T>(newVal);
			} else {
				right.append(newVal);
			}
		} else {
			throw new Exception("The given value is already part of the BST");
		}
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BinarySearchTree<T> getLeft() {
		return left;
	}

	public void setLeft(BinarySearchTree<T> left) {
		this.left = left;
	}

	public BinarySearchTree<T> getRight() {
		return right;
	}

	public void setRight(BinarySearchTree<T> right) {
		this.right = right;
	}
}
