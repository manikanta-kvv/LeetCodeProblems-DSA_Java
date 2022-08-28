package patterns;

/*

E
DE
CDE
BCDE
ABCDE

*/
public class Pattern18 {
	public void pattern(int num) {
		int charNum = 65;
		int endCharNum = charNum + num - 1;
		
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				char letter = (char)(endCharNum - (i-j));
				System.out.print(letter);
			}
			System.out.println();
		}
	}
}
