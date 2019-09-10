
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "cta";
		String s2 = "act";
		boolean falg = false;
		if (s1.length() != s2.length()) {
			System.out.println("no!");
		} else {
			int[] c = new int[256];
			for (int i = 0; i < s1.length(); i++) {
			
				c[s1.charAt(i)]++;
			}
			for (int i = 0; i < s1.length(); i++) {
				
				c[s2.charAt(i)]--;
			}
			for (int i = 0; i < 256; i++) {
				if(c[i]!=0) {
					falg=true;
					break;
				}
			}
		if(falg==true) {
			System.out.println("no");
			} 
		else {
		System.out.println("yes");
		}
		}
		}

		
	}


