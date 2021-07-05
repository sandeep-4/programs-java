package dayFour;

public class DublicateRemoveSortedLinkList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void removeDublicates() {
		Node curr = head;
		while (curr != null) {
			Node temp = curr;

			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		DublicateRemoveSortedLinkList llist = new DublicateRemoveSortedLinkList();
		llist.push(21);
		llist.push(13);
		llist.push(13);
		llist.push(11);
		llist.push(11);
		llist.push(11);

		System.out.println("List before removal of duplicates");
		llist.printList();

		llist.removeDublicates();

		System.out.println("List after removal of elements");
		llist.printList();
	}

}
