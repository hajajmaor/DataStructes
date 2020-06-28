
public class NodeDS<E> {

	E data;
	NodeDS<?> next = null;

	NodeDS(E data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "" + data;
	}
}
