
public class RotationCheck {
	public static void main(String[] args) {
		String s="geek";
		String check="ekeg";
		
		s=s+s;
		// geekgeek
		if(s.contains(check)) {
			System.out.println("y");
		}
		else {
			System.out.print("n");
		}
	}

}
