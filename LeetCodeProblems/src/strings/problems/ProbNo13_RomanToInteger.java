package strings.problems;

import java.util.HashMap;
import java.util.Scanner;

public class ProbNo13_RomanToInteger {
	public static void main(String[] args) {
		
		HashMap<Character, Integer> romanHashMap = new HashMap<>();
		romanHashMap.put('I',1);
		romanHashMap.put('V', 5);
		romanHashMap.put('X', 10);
		romanHashMap.put('L', 50);
		romanHashMap.put('C', 100);
		romanHashMap.put('D', 500);
		romanHashMap.put('M', 1000);
		
		//	I             1
		//	V             5
		//	X             10
		//	L             50
		//	C             100
		//	D             500
		//	M             1000
		
		//largest to smallest : add them
		// smaller before larger : subtract smaller
		
		Scanner sc = new Scanner(System.in);
		String romanString = sc.next();
		char[] charArray = romanString.toCharArray();
		Integer outputValue = 0;
		for(int i= 0; i<romanString.length()-1; i++) {
			if(romanHashMap.get(charArray[i]) >= romanHashMap.get(charArray[i+1])) {
				outputValue += romanHashMap.get(charArray[i]);
			}
			else {
				outputValue -= romanHashMap.get(charArray[i]);
			}
		}
		System.out.println(outputValue + romanHashMap.get(charArray[charArray.length - 1]));
//		System.out.println(outputValue);
	}
}
