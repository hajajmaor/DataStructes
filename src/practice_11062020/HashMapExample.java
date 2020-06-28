package practice_11062020;

import java.util.LinkedList;

public class HashMapExample {
	// size of hash map
	final static int size = 50;

	static int hashID(int id) {
		return id % size;
	}

	public static void main(String[] args) {
		// array of super type - can put anything in.
		Object[] items = new Object[size];
		//
		items[5] = "dsadasdas";
		items[6] = 1234;
		items[8] = new LinkedList<>();

		// object that we create with a class me made;
		var st1 = new Student("lazy no.1", 1254687);
		var st2 = new Student("lazy no.2", 123548);

		// like in DBs, student id uses as key;
		items[hashID(st1.id)] = st1;
		items[hashID(st2.id)] = st2;
		// clear ref
		st1 = null;
		st2 = null;
		// just for stop point
		System.out.println();

		/*
		 * מקבל מחרוזת סוכם את התווים לפי טבלת ASCII עושה HASH ממשיך תהליך
		 * 
		 * ------------------ חיפוש - אותו דבר
		 */

	}

}
