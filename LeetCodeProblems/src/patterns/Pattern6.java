package patterns;

/* 

12345
1234
123
12
1

*/

public class Pattern6 {
	public void pattern(int num) {
		for(int i = num; i>0; i--) {
			for(int j = 1; j<=i; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
