
public class PatternMatching {
	public static void main(String[] args) {
		String s = "abcdabce";
		String p = "abce";
		call(s,s.indexOf(p), p);
	}

	private static void call(String s,int i, String p) {
		if (i >= 0 && i<s.length()) {
			System.out.println(i);
			call(s,s.indexOf(p,i+p.length()),p);
		}
	}
}
