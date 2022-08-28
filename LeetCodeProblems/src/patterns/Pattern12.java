package patterns;

/* 
 
1      1
12    21
123  321
12344321

*/

public class Pattern12 {
	public void pattern(int num) {

		for(int m = 1; m<=num; m++) {
			String spaces = " ".repeat(num-m);
			for(int j=1; j<=m; j++) {
				System.out.print(j);
			}
			System.out.print(spaces + spaces);
			for(int n = m; n >=1; n--) {
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
}
