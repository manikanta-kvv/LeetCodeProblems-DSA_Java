package patterns;


/* 

*****
****
***
**
*

*/


public class Pattern5 {
	
	public void pattern(int num, String symbol) {
		
		while(num > 0) {
			String repeated = symbol.repeat(num);
			System.out.println(repeated);
			num--; 
			
		}
	}
}
