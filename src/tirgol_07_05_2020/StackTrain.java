package tirgol_07_05_2020;

import java.util.Stack;

public class StackTrain {

	public static void main(String[] args) {

		Stack<Integer> st1 = new Stack<Integer>();
		System.out.println(st1.size());
		for (int i = 0; i < 6; i++) {
			st1.add(i);
		}
		System.out.println(st1.size());
		while (st1.empty() == false) {
			System.out.println(st1.pop());
		}

	}

}
