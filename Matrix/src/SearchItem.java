
public class SearchItem {
	//search item in a matrix having sorted col and rows
	static int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

	public static void main(String[] args) {
		int item = 16;
		find(0, 2);

	}

	private static void find(int r, int c) {
		if (m[r][c] < 15) {
			find(r + 1, c);
		} else if (m[r][c] > 15) {
			find(r, c - 1);
		} else {
			System.out.println(r + " " + c);
		}
	}

}
