
public class SelectionSort {

	// *************** SELECTION SORT ***************
	// in all O(n^2)
	public static void main(String[] args) {
		int[] arr = { 20, 10, 5, 15 };
		int n=arr.length;
		 for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int max_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (arr[j] < arr[max_idx])
	                    max_idx = j;
	 
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[max_idx];
	            arr[max_idx] = arr[i];
	            arr[i] = temp;
	        }
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
