package strings.problems;

import java.util.Arrays;


public class ProbNo242_ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;
		int[] charArray = new int[26];
		for(int i = 0; i< s.length() ; i++) {
			charArray[s.charAt(i) - 'a']++;
		}
		for(int i = 0; i<t.length(); i++) {
			charArray[t.charAt(i) - 'a']--;
		}
		for(int val : charArray) {
			if (val != 0) return false;
		}
		return true;
		
    }
	public static void main(String[] args) {
		boolean res = isAnagram("anagram", "nagaram");
		System.out.println(res);
	}
}
