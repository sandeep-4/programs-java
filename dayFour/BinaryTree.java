package dayFour;

public class BinaryTree {

	static class Node {
		int key;
		Node left, right;

		public Node(int n) {
			key = n;
			left = right = null;
		}
	}

	Node root;

	public BinaryTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inOrder() {
		inOrderRec(root);
	}

	public void inOrderRec(Node root) {
		if (root != null) {
			inOrderRec(root.left);
			System.out.println(root.key);
			inOrderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		/*
		 * Let us create following BST 50 / \ 30 70 / \ / \ 20 40 60 80
		 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);

		// print inorder traversal of the BST
		tree.inOrder();
	}
}
