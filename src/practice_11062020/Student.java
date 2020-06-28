package practice_11062020;

public class Student {
	String name;
	int id;

	Student() {
		this.name = "default";
		this.id = 1;
	}

	Student(String name, int id) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "name: " + this.name + ",id: " + this.id;
	}
}
