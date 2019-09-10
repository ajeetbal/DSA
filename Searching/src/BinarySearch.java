public class BinarySearch {

	// binarySearch is for sorted array
	//T(n)=O(log N)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 4, 6, 76, 89, 233, 567 };
		int item = 567;

		System.out.println(search(a, 0, a.length - 1, item));

	}

	private static int search(int[] a, int low, int high, int item) {

		if (low > high) {
			return -1;
		}
		int mid = (low + high) / 2;

		if (a[mid] == item) {
			return mid;
		}
		if (a[mid] > item) {

			return search(a, low, mid - 1, item);
		} else {
			return search(a, mid + 1, high, item);
		}

	}

}
