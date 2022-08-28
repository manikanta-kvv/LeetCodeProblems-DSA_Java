package patterns;

/*

ABCDE
ABCD
ABC
AB
A


*/

public class Pattern15 {
	public void pattern(int num) {
		int charNum = 65;
		for(int i = num; i>0; i--) {
			for(int j = 0; j<i; j++) {
				System.out.print((char)(charNum + j));
			
			}
			System.out.println();
		}
	}
}
