package patterns;
/*

	A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/

public class Pattern17 {
	public void pattern(int num) {
		for(int i = 0; i<num; i++) {
			String spaces = " ".repeat(num-i);
			int charNum = 65;
			System.out.print(spaces);
			for(int j = 0; j <=i; j++) {
				System.out.print((char)(charNum + j));
			}
			for(int k = i; k >0 ; k--) {
				System.out.print((char)(charNum + k-1));
			}
			System.out.println();
		}
	}
}
