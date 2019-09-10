public class CustomStackA {

	int[] a;
	int top;
	int size;

	public CustomStackA(int c) {
		size = c;
		top = -1;
		a = new int[size];
	}

	void push(int n) {
		if (top < size) {
			top++;
			a[top] = n;
		}
	}

	int pop() {
		if (top >= 0) {
			return a[--top];
		}
		return -1;
	}

	boolean isEmpty(){
		if(top==-1) {
			return true;
		}
		return false;
	}
	boolean isFull() {
		if(top==size-1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		CustomStackA stack = new CustomStackA(5);
		stack.push(5);
		stack.push(23);
		stack.push(51);
		stack.push(45);
		stack.push(5);
//		stack.push(52);

		System.out.println(stack.isFull());
	}
}
