package tirgol21052020;

public class Leaf {
	double value;
	Leaf left = null;
	Leaf right = null;

	public Leaf(double value) {
		this.value = value;
	}

	void setRight(Leaf right) {
		this.right = right;
	}

	void setLeft(Leaf left) {
		this.left = left;
	}
}
