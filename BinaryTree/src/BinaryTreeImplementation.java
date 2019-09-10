import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {

	static Node root;

	public BinaryTreeImplementation() {
		this.root = null;
	}

	void add(int n) {
		root = addRecursive(root, n);
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;
	}

	void inorder(Node root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.value + " ");
		inorder(root.right);
	}

	void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		preorder(root.left);
		preorder(root.right);
	}

	void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.value + " ");
	}

	void leveltraversal(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tmp = queue.poll();
			System.out.print(tmp.value + " ");
			if (tmp.left != null)
				queue.add(tmp.left);
			if (tmp.right != null)
				queue.add(tmp.right);
		}
	}

	int findHeight(Node root) {
		if (root == null) {
			return 0;
		}
		int l = findHeight(root.left);
		int r = findHeight(root.right);
		return Math.max(l, r) + 1;
	}

	boolean childrenSumProperty(Node root) {
		if (root == null) {
			return true;
		}
		if (root.left == null && root.right == null) {
			return true;
		}
		int sum = 0;
		if (root.left != null) {
			sum += root.left.value;
		}
		if (root.right != null) {
			sum += root.right.value;
		}
		if (sum == root.value && childrenSumProperty(root.left) && childrenSumProperty(root.right)) {
			return true;
		}
		return false;
	}

	boolean checkBalance(Node root) {
		if(root==null) {
			return true;
		}
		int l = findHeight(root.left);
		int r = findHeight(root.right);
		int mode = Math.abs(l - r);
		if (mode < 1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		BinaryTreeImplementation b = new BinaryTreeImplementation();
		b.add(20);
		b.add(12);
		b.add(43);
		b.add(21);
		b.add(43);
		b.add(53);
		b.add(12);
		b.add(42);
		b.add(90);

		b.add(10);
		b.add(30);
		b.add(8);
		b.add(12);
		b.add(26);
		b.add(32);
		System.out.println(b);
		System.out.println("+++++++++++++++++inorder++++++++++++++");
		b.inorder(root);
		System.out.println();
		System.out.println("+++++++++++++++++preorder++++++++++++++");
		b.preorder(root);
		System.out.println();
		System.out.println("+++++++++++++++++postOrder++++++++++++++");
		b.postorder(root);
		System.out.println("+++++++++++++++++levelwiseTraversal++++++++++++++");
		b.leveltraversal(root);
		System.out.println("hieght of tree :::" + b.findHeight(root));

		System.out.println("children sum property::::::::" + b.childrenSumProperty(root));
		System.out.println("binary tree is balanced :" + b.checkBalance(root));
	}
}
