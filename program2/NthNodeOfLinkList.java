package program2;

public class NthNodeOfLinkList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void nthNumberFromLast(int n) {
		int len = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			len++;
		}
		if(len <n) {
			return;
		}
		
		temp=head;
		
		for(int i=1;i<len-n;i++) {
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public static void main(String [] args) {
		NthNodeOfLinkList linkList=new NthNodeOfLinkList();
		linkList.push(20);
		linkList.push(4);
		linkList.push(15);
		linkList.push(23);
		
		linkList.nthNumberFromLast(4);
	}
	
}
