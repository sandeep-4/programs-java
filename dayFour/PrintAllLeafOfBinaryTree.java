package dayFour;

public class PrintAllLeafOfBinaryTree {

	static class Node {
		int data;
		Node left, right;

		Node(int d) {
			data = d;
			left = right = null;
		}

		public Node() {
		}
	}

	static void printLeafNode(Node root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			System.out.println(root.data + " ");
			return;
		}

		if (root.left != null)
			printLeafNode(root.left);

		if (root.right != null)
			printLeafNode(root.right);
	}

	static Node newNode(int data) {
		Node temp = new Node();
		temp.data=data;
		temp.left=null;
		temp.right=null;
		return temp;

	}

	public static void main(String[] args) {

		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.right.left = newNode(5);
		root.right.right = newNode(8);
		root.right.left.left = newNode(6);
		root.right.left.right = newNode(7);
		root.right.right.left = newNode(9);
		root.right.right.right = newNode(10);

		printLeafNode(root);
	}
}
