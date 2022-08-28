package patterns;

/*

A
BB
CCC
DDDD
EEEEE

*/

public class Pattern16 {
	public void pattern(int num) {
		int charNum = 65;
		for(int i = 1; i<=num; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print((char)(charNum));
				
			}
			charNum++;
			System.out.println();
		}
	}
}
