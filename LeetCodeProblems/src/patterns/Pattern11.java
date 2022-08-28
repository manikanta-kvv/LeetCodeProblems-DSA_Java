package patterns;

/* 

1
01
101
0101
10101



*/

public class Pattern11 {
	public void pattern(int num, String symbol) {
		//if i+j coordinates equals to even(%2 == 0), then display 1, else 0
		for(int i = 1; i<=num; i++) {
			for(int j = 1; j<=i; j++) {
				if((i+j)%2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
