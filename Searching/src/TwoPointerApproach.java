
public class TwoPointerApproach {

	
	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 6, 11, 21, 24 };
		int sum=110;
		
		//to check if array have any triplet of sum 
		for(int i=0;i<a.length;i++) {
			if(find(a, i+1, a.length - 1,sum-i)) {
				System.out.println("found");
				break;
			}

		}
	//to check if array have any pair of sum
	//System.out.println(find(a, 0, a.length - 1,sum));

	}

	//T(n)=O(n)
	private static Boolean find(int[] a, int start, int last,int sum) {
		
		if(start>last) {
			return false;
		}
		if(a[start]+a[last]==sum) {
			return true;
		}
		if(a[start]+a[last]>sum) {
			return find(a, start, last-1, sum);
		}
		else {
			return find(a, start+1, last, sum);

		}
		
	}

}
