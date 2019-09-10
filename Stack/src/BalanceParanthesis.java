import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {
		Stack<Character> s=new Stack<Character>();
		String str="[{()}]";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='[' || str.charAt(i)=='{' || str.charAt(i)=='(') {
				s.push(str.charAt(i));
			}
			else if(!s.empty() && ( 
					((str.charAt(i)==']')&& (s.peek()=='[')) ||
					((str.charAt(i)=='}')&& (s.peek()=='{')) ||
					((str.charAt(i)==')')&& (s.peek()=='('))
					)) {
				s.pop();
			}
		}
		if(s.empty()) {
			System.out.println("b");
		}
	}
}
