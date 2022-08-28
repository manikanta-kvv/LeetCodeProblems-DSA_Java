package patterns;

/* 
  
  ###
  ###
  ###
  
*/

public class Pattern1 {
	public void pattern(int num, String symbol) {
		String repeated = symbol.repeat(num);
		while(num > 0) {
			System.out.println(repeated);
			num--;
		}
}
}
