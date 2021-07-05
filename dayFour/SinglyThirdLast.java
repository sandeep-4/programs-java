package dayFour;

public class SinglyThirdLast {

	static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

	}

	private Node head;

	public boolean isEmpty() {
		return length() == 0;
	}

	public void append(String data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		tail().next = new Node(data);
	}

	private Node tail() {
		Node tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}

	public int length() {
		int length = 0;
		Node current = head;

		while (current != null) {
			length++;
			current = current.next;

		}
		return length;
	}

	public String getLastNode(int n) {
		Node fast = head;
		Node slow = head;
		int start = 1;

		while (fast.next != null) {
			fast = fast.next;
			start++;
			if (start > n) {
				slow = slow.next;
			}
		}
		return slow.data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		Node current = head;
		while (current != null) {
			sb.append(current).append("-->");
			current = current.next;
		}

		if (sb.length() >= 3) {
			sb.delete(sb.length() - 3, sb.length());

		}
		return sb.toString();
	}

	public static void main(String args[]) {
		SinglyThirdLast list = new SinglyThirdLast();
		list.append("1");
		list.append("2");
		list.append("3");
		list.append("4");


		System.out.println("The first node from last: " + list.getLastNode(1));
		System.out.println("The second node from the end: " + list.getLastNode(2));
		System.out.println("The third node from the tail: " + list.getLastNode(3));
	}
}
