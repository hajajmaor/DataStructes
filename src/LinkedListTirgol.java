//package tirgol_07_05_2020;

public class LinkedListTirgol {
	public static void main(String[] args) {
		NodeDS<Integer> n1 = new NodeDS<Integer>(5);
		// ברשימה מקושרת - יש הפניה לראש הרשימה ועוברים לבא על ידי NEXT
//		NodeDS<Double> n2 = new NodeDS<Double>(5.5);
		n1.next = new NodeDS<Integer>(6);
		System.out.println("n1 data:" + n1);
		System.out.println("n1.next data:" + n1.next);
		System.out.println("n1.next data:" + n1.next.next);
	}
}
