package patterns;
/*

4444444
4333334
4322234
4321234
4322234
4333334
4444444

*/

public class Pattern22 {
	public void pattern(int num) {
		int min;
		for(int i = 1; i<=num; i++) {
			
			for(int j = 1; j<=num; j++) {
				
				min = i < j ? i: j;
				System.out.print(num - min + 1);
				
			}
			for(int k = num - 1; k >= 1; k--) {
				min = i < k ? i : k;
				System.out.print(num - min + 1);
			}
			System.out.println();
		}
		for(int i = num -1; i >= 1; i--) {
			for(int j = 1; j<=num; j++) {
				min = i < j ? i : j;
				System.out.print(num - min + 1);
			}
			for(int k = num - 1; k >=1; k--) {
				min = i < k ? i : k;
				System.out.print(num - min + 1);
			}
			System.out.println();
		}
	
	}
}
