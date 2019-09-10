
public class InsertionSort {

	// *********** Insertion Sort **************
	// worst case O(n^2)
	//best O(n)
	//best among other when input is less
	public static void main(String[] args) {

		int[] a = { 20, 10, 5, 15 };

		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			for (int j = i - 1; j >= 0 && a[j] > key; j--) {
				a[j + 1] = a[j];
				a[j] = key;
			}
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
