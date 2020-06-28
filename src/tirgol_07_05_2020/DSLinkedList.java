package tirgol_07_05_2020;

public class DSLinkedList<E> {
	NodeDS<E> head = null;

	DSLinkedList(E data) {
		this.head = new NodeDS<E>(data);
	}

	void addAtHead(E data) {
		// מקבלת ערך מסוג E
		// ומכניסה אותו לתוך הפרמטר HEAD
		NodeDS<E> newHead = new NodeDS<E>(data);
		newHead.next = this.head;
		this.head = newHead;
	}

	void addAtEnd(E data) {
		NodeDS<E> newEnd = new NodeDS<E>(data);
		NodeDS<E> temp = this.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		// בנקודה הזו, TEMP מצביע על התא האחרון ברשימה
		temp.next = newEnd;
	}

	void addAtIndex(E data, int index) throws Exception {
		// קודם נראה כמה תאים יש - שנוכל להכניס את הערך החדש באינדקס הרצוי

		if (index == 0) {
			addAtHead(data);
			// size =2, index=3
		} else if (index == this.size() + 1) {
			addAtEnd(data);
		} else {
			if (index > this.size() + 1) {
				throw new Exception();
			} else {
				// בנקודה הזאת INDEX בטווח
				NodeDS<E> temp = this.head;

				for (int i = 1; i < index; i++) {
					temp = temp.next;
				}
				// temp.next=25 צריכים להחליף ל10
				NodeDS<E> newNode = new NodeDS<E>(data);// 10
				newNode.next = temp.next;
				temp.next = newNode;

			}
		}

	}

	public int size() {
		int counter = 1;
		NodeDS<E> temp = this.head;
		while (temp.next != null) {
			temp = temp.next;
			counter++;
		}
		return counter;

	}

	public String toString() {
		int counter = 0;
		NodeDS<E> temp = this.head;

		while (temp.next != null) {
			System.out.println("index: " + counter + " value: " + temp);
			counter++;

			temp = temp.next;
		}
		System.out.println("index: " + counter + " value: " + temp);

		return "";
	}

}
