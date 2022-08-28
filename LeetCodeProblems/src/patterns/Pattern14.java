package patterns;

/*

A
AB
ABC
ABCD
ABCDE

*/


// (char)65 = 'A'
public class Pattern14 {
	public void pattern(int num) {
		int charNum = 65;
		for(int i = 1; i<=num; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print((char)(charNum + j));
			
			}
			System.out.println();
		}
	}
}
