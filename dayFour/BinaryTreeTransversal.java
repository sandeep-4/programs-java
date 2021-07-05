package dayFour;

public class BinaryTreeTransversal {

	static class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	public BinaryTreeTransversal() {
		root = null;
	}

	public void printPostOrder(Node node) {
		if (node == null)
			return;

		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println(node.key + " ");
	}

	public void printInOrder(Node node) {
		if (node == null)
			return;

		printInOrder(node.left);
		System.out.print(node.key + " ");
		printInOrder(node.right);
	}

	public void printPreOrder(Node node) {
		if (node == null)
			return;

		System.out.println(node.key + " ");
		printPreOrder(node.left);
		printPreOrder(node.right);

	}

	// wrappers recursion
	void printPostOrder() {
		printPostOrder(root);
	}

	void printInOrder() {
		printInOrder(root);
	}

	void printPreOrder() {
		printPreOrder(root);
	}

	public static void main(String[] args) {
		BinaryTreeTransversal tree = new BinaryTreeTransversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println("Preorder traversal of binary tree is ");
		tree.printPreOrder();

		System.out.println("\nInorder traversal of binary tree is ");
		tree.printInOrder();

		System.out.println("\nPostorder traversal of binary tree is ");
		tree.printPostOrder();
	}

}
