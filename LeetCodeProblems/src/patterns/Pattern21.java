package patterns;
/*

****
*  *
*  *
*  *
****

*/

public class Pattern21 {
	public void pattern(int num, String symbol) {
		for(int i = 1; i<= num; i++) {
			for(int j = 1; j == 1; j++) {
				if(i == 1 || i == num) {
					String stars = symbol.repeat(num-1);
					System.out.print(stars);
				}
				else {
					int mid = (num-1)/2;
					String midSpace = " ".repeat(mid);
					System.out.print(symbol + midSpace + symbol);
				}
			}
			System.out.println();
		}
	}
}
