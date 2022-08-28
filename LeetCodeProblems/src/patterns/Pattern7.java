package patterns;

/* 

    *    
   ***   
  *****  
 ******* 
*********

*/

public class Pattern7 {
	
	public void pattern(int num, String symbol) {
		for(int i = 1; i<=num; i++) {
			
				String repeatedSpaces = " ".repeat(num-i);
				System.out.print(repeatedSpaces + symbol.repeat(i));
				System.out.print(symbol.repeat(i-1) + repeatedSpaces);
			
			System.out.println();
		}
	}
}
