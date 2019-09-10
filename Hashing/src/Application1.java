
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String st = sc.next();
			ArrayList<String> ans = new LexSort().powerSet(st);
			Collections.sort(ans);
			for (String s : ans)
				System.out.print(s + " ");
			System.out.println();
		}
	}
}
//Position this line where user code will be pasted.

/*
 * This is a function problem.You only need to complete the function given below
 */
//User function Template for Java
class LexSort {
	// complete the function
	static ArrayList<String> powerSet(String s) {
		return power(s, -1, "");
	}

	static ArrayList<String> power(String str, int index, String curr) {
		ArrayList<String> list = new ArrayList<>();
		int n = str.length();

		// base case
		if (index == n) {
			return;
		}

		// First print current subset
		list.add(curr);

		// Try appending remaining characters
		// to current subset
		for (int i = index + 1; i < n; i++) {
			curr += str.charAt(i);
			powerSet(str, i, curr);

			// Once all subsets beginning with
			// initial "curr" are printed, remove
			// last character to consider a different
			// prefix of subsets.
			curr = curr.substring(0, curr.length() - 1);
		}
		return list;

	}
}
