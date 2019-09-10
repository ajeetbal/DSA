
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<m.length;i++) {
			for(int j=i+1;j<m[i].length;j++) {
				m[i][j]^=m[j][i];
				m[j][i]^=m[i][j];
				m[i][j]^=m[j][i];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		
	}

}
