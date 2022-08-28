package patterns;

/* 
    
*
**
***
****
*****
****
***
**
*



*/

public class Pattern10 {
	public void pattern(int num, String symbol) {
		for(int i = 1; i<=num; i++) {
			System.out.println(symbol.repeat(i));
		}
		for(int i = num-1; i>0; i--) {
			System.out.println(symbol.repeat(i));
		}
	}
}
