import java.util.EmptyStackException;

public class CustomStackL {
	Node head;

	public CustomStackL() {
		head = null;
	}

	void push(int n) {
		Node old = head;
		head = new Node(n);
		head.next = old;

//		Node old=head;
//		Node newNode=new Node(n);
//		newNode.next=old;
//		head=newNode;

	}

	int pop() {
		if (head == null) {
			throw new EmptyStackException();
		} else {
			int v = head.value;
			head = head.next;
			return v;
		}
	}

	void display() {
		Node n=head;
		while (n != null) {
			System.out.println(head.value);
			n = n.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomStackL stack = new CustomStackL();
		stack.push(5);
		stack.push(4);
		stack.push(51);
		stack.display();
		System.out.println(stack);

	}

}
