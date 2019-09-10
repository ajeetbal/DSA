public class SnackPrint {

	public static void main(String[] args) {
	
	int[][] m= {{1,2,3},{4,5,6},{7,8,9}};
	
	for(int i=0;i<m.length;i++) {
		for(int j=0;j<m[i].length;j++)
		if(i%2==0) {
			System.out.print(m[i][j]);
		}
		else {
			System.out.print(m[i][m[i].length-j-1]);
		}
		System.out.println();
	}
		
	}
}