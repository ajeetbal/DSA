
public class LexoRank {

	public static void main(String[] args) {

		int rank=0;
		String s = "cba".toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			int a = compare(s.charAt(i), s.substring(i));
			rank+=a*fact(s.substring(i).length()-1);
		}
		System.out.println(rank+1);
	}

	private static int fact(int i) {
		int fact=1;
		while(i>0) {
			fact*=i;
			i--;
		}
		return fact;
	}

	private static int compare(char c, String substring) {

		int count=0;
		for (int i = 0; i < substring.length(); i++) {
			if(c>substring.charAt(i)) {
				count++;
			}
		}
		return count;

	}

}
