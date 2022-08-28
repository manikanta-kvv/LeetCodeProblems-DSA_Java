package patterns;

/* 

*********
 ******* 
  *****  
   ***   
    *    


*/

public class Pattern8 {
	public void pattern(int num, String symbol) {
		for(int i = num; i>0; i--) {
			
				String repeatedSpaces = " ".repeat(num-i);
				System.out.print(repeatedSpaces + symbol.repeat(i));
				System.out.print(symbol.repeat(i-1) + repeatedSpaces);
			
			System.out.println();
		}
	}
}
