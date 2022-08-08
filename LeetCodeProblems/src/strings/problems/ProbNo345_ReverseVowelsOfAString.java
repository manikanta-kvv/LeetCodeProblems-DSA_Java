package strings.problems;


public class ProbNo345_ReverseVowelsOfAString {

	private static boolean isVowel(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
		return false;
		
	}
	
	public static String reverseVowels(String s) {

		int head = 0;
		int tail = s.length() - 1;
		char[] charArray = s.toCharArray();
		while(head < tail) {
			while(head < tail && !isVowel(charArray[head])) {
				
				head++;
			}
			while(head < tail && !isVowel(charArray[tail])) {
				
				tail--;
			}
			while(head < tail && isVowel(charArray[head]) && isVowel(charArray[tail])) {
				char temp = charArray[head];
				charArray[head] = charArray[tail];
				charArray[tail] = temp;
				head++;
				tail--;
			}
		}
		return new String(charArray);

    }
	public static void main(String[] args) {
		String res = reverseVowels("hello");
		System.out.println(res);
	}
}
