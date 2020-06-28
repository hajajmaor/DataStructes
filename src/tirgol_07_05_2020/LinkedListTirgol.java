package tirgol_07_05_2020;

public class LinkedListTirgol {
	/*
	 * 1. insert data in head 2. insert data last 3. insert data in Index i
	 */
	public static void main(String[] args) {
		DSLinkedList<Integer> list1 = new DSLinkedList<Integer>(5);
//		System.out.println("at init:" + list1.head);// 5
		list1.addAtHead(101);
//		System.out.println("after adding at the head:" + list1.head);// 101
		list1.addAtEnd(25);
//		System.out.println("after adding at the end:" + list1.head.next.next);// 25
		// list1=[101,5,25]
		try {
			list1.addAtIndex(10, 2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list1);

	}
}
