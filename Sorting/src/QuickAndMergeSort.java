
public class QuickAndMergeSort {

	
	//QuickSort best O(nlog n) and O(n^2) worst
	//mergeSort both O(nlog n) 
	public static void main(String args[]) {

		int[] a = { 30, 10, 8 };
// quickSort(a, 0, a.length - 1);
		mergeSort(a, 0, a.length - 1);
		System.out.println(a);
	}

	private static void mergeSort(int[] a, int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);

		}
	}

	private static void merge(int[] a, int start, int mid, int end) {

		int[] l = new int[mid - start + 1];
		int[] r = new int[end - mid];

		for (int i = 0; i <= end; i++) {

			if (i < l.length) {
				l[i] = a[i];
			} else {
				r[i - l.length] = a[i];
			}

		}
		int i = 0, j = 0;

// Initial index of merged subarry array
		int k = start;
		while (i < l.length && j < r.length) {
			if (l[i] <= r[j]) {
				a[k] = l[i];
				i++;
			} else {
				a[k] = r[j];
				j++;
			}
			k++;
		}

// Copy remaining elements of L[] if any /
		while (i < l.length) {
			a[k] = l[i];
			i++;
			k++;
		}

// Copy remaining elements of R[] if any /
		while (j < r.length) {
			a[k] = r[j];
			j++;
			k++;
		}
	}

	private static int partition(int[] a, int l, int h) {
		int pivot = l + (h - l) / 2;
		int i = 0, j = 0;
		while (l < h) {
			for (int k = 0; k <= h; k++) {
				if (a[k] > a[pivot]) {
					i = k;
					break;
				}
			}
			for (int k = h; k >= l; k--) {
				if (a[k] < a[pivot]) {
					j = k;
					break;
				}
			}

			if (i >= j) {
				int temp = a[pivot];
				a[pivot] = a[i - 1];
				a[i - 1] = temp;
				return i - 1;

			} else {

				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		return j;

	}

	static void quickSort(int a[], int beg, int end) {

		if (beg < end) {
			int loc = partition(a, beg, end);
			quickSort(a, beg, loc);
			quickSort(a, loc + 1, end);
		}
	}

}