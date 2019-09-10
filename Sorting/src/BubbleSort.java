
public class BubbleSort {

	//************BUBBLE SORT *******************
	//worst O(n^2)
	//best O(n)
	public static void main(String[] args) {

		int[] a= {20,10,5,15};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i:a) {
			System.out.println(i);
		}
	}

}
