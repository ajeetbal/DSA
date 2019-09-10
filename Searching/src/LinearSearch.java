
public class LinearSearch {
	//T(n)
	public static void main(String[] args) {

		int[] a = { 3, 15, 34, 64, 45, 5, 2, 9 };
		int item = 15;
		boolean falg = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == item) {
				System.out.println(i);
				falg=true;
				break;
			}
		}
		if(falg==false) {
			System.out.println("not found!");
		}
		
	}

}
