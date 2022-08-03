package strings.problems;

public class ProbNo58_LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		int length = 0;
		for (int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) != ' ') {
				length++;
			}
			else {
				if (length > 0) return length;
			}
		}
		return length;
        
    }
	
	public static void main(String[] args) {
		int res = lengthOfLastWord("Haha");
		System.out.println(res);
		
	}
}
