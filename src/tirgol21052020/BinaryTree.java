package tirgol21052020;

public class BinaryTree {
	Leaf root;

	public BinaryTree(double value) {
		this.root = new Leaf(value);
	}

	void insertLeaf(double value) {
		this.insertLeaf(new Leaf(value));
	}

	void insertLeaf(Leaf leaf) {
		this.addRecursive(root, leaf);
	}

	private Leaf addRecursive(Leaf current, Leaf leaf) {
		if (current == null) {
			return leaf;
		}

		if (leaf.value < current.value) {
			current.left = addRecursive(current.left, leaf);
		} else if (leaf.value > current.value) {
			current.right = addRecursive(current.right, leaf);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	private boolean containsNodeRecursive(Leaf current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		if (value < current.value)
			return containsNodeRecursive(current.left, value);
		else
			return containsNodeRecursive(current.right, value);

	}
}
