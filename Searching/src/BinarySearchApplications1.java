
public class BinarySearchApplications1 {

	// find first occurance in sorted array
	// find last occurance in sorted array

	public static void main(String[] args) {
		int[] a = { 1, 2,2, 4, 4, 6, 9 };
		int item = 4;

		System.out.println("fisrstOccuranceSearch :"+ fisrstOccuranceSearch(a, 0, 6, item));
		System.out.println("lastOccuranceSearch :"+ lastOccuranceSearch(a, 0, 6, item));

	}

	private static int lastOccuranceSearch(int[] a, int l, int h, int item) {
		if (l > h) {
			return -1;
		}
		int mid = (l + h) / 2;
		if (a[mid] == item && ((a[mid + 1] != item) || mid == (a.length-1))) {
			return mid;
		}
		if (a[mid] > item) {
			return lastOccuranceSearch(a, l, mid - 1, item);
		} else {
			return lastOccuranceSearch(a, mid+1, h, item);
		}
	}

	private static int fisrstOccuranceSearch(int[] a, int l, int h, int item) {

		if (l > h) {
			return -1;
		}
		int mid = (l + h) / 2;
		if (a[mid] == item && ((a[mid - 1] != item) || mid == 0)) {
			return mid;
		}
		if (a[mid] >= item) {
			return fisrstOccuranceSearch(a, l, mid - 1, item);
		} else {
			return fisrstOccuranceSearch(a, mid+1, h, item);
		}

	}

}
