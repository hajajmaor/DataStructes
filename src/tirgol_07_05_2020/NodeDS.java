package tirgol_07_05_2020;

public class NodeDS<E> {

	E data;
	NodeDS<E> next = null;

	NodeDS(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "" + data;
	}
}
