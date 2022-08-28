package patterns;
/*

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

*/

public class Pattern20 {
	public void pattern(int num, String symbol) {
		int counter = num -1;
		for(int i = 1; i <=num; i++) {
			for(int j = 1; j==1; j++) {
			String spaces = " ".repeat(counter * 2);
			String stars = symbol.repeat(i);
			System.out.print(stars + spaces + stars);
			counter--;
			}
			System.out.println();
			
		}
		
		counter = 1;
		for(int i = num; i > 0; i--) {
			if(i == num) continue;
			for(int j = 1; j==1; j++) {
				
			String spaces = " ".repeat(counter * 2);
			String stars = symbol.repeat(i);
			System.out.print(stars + spaces + stars);
			counter++;
			}
			System.out.println();
			
		}
		
		
	}
}
