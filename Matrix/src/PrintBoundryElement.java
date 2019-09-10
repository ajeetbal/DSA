
public class PrintBoundryElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12,14 }, { 13, 14, 15 }, { 16, 17, 18 } };
		
		for (int i = 0; i < m.length; i++) { 
            for (int j = 0; j < m[i].length; j++) { 
                if (i == 0) 
                    System.out.print(m[i][j] + " "); 
                else if (i == m.length - 1) 
                    System.out.print(m[i][j] + " "); 
                else if (j == 0) 
                    System.out.print(m[i][j] + " "); 
                else if (j == m[i].length- 1) 
                    System.out.print(m[i][j] + " "); 
                else
                    System.out.print("  "); 
            } 
            System.out.println(""); 
        } 
		 
	}

}
