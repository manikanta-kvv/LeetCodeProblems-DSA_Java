package patterns;

/* 

*
**
***
****
*****

*/

public class Pattern2 {
	
	public void pattern(int num, String symbol) {
		int counter = 1;
		while(num > 0) {
			String repeated = symbol.repeat(counter);
			System.out.println(repeated);
			num--; 
			counter++;
		}
	}
}
