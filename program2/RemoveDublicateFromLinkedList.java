package program2;

public class RemoveDublicateFromLinkedList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void removeDublicate() {
		@SuppressWarnings("unused")
		Node prt1 = null, prt2 = null, dup = null;
		prt1 = head;

		while (prt1 != null && prt1.next != null) {
			prt2 = prt1;
			while (prt2.next != null) {
				if (prt1.data == prt2.next.data) {
					dup = prt2.next;
					prt2.next = prt2.next.next;
					System.gc();
				} else {
					prt2 = prt2.next;
				}
			}
			prt1 = prt1.next;
		}
	}
	
	public void print(Node node) {
		while(node!=null) {
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
	  @SuppressWarnings("static-access")
	public static void main(String[] args) {
	        RemoveDublicateFromLinkedList list = new RemoveDublicateFromLinkedList();
	        list.head = new Node(10);
	        list.head.next = new Node(12);
	        list.head.next.next = new Node(11);
	        list.head.next.next.next = new Node(11);
	        list.head.next.next.next.next = new Node(12);
	        list.head.next.next.next.next.next = new Node(11);
	        list.head.next.next.next.next.next.next = new Node(10);
	 
	        System.out.println("Linked List before removing duplicates : \n ");
	        list.print(head);
	 
	        list.removeDublicate();
	        System.out.println("");
	        System.out.println("Linked List after removing duplicates : \n ");
	        list.print(head);
	    }
	
}
