package patterns;


/* 

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 


*/
public class Pattern13 {
	public void pattern(int num) {
		int counter = 1;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}
}
