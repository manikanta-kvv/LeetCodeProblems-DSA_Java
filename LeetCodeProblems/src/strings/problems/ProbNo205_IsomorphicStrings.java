package strings.problems;

public class ProbNo205_IsomorphicStrings {
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) return false;
		char[] s_charArray = s.toCharArray();
		char[] t_charArray = t.toCharArray();
		
		char[] s_charValueArray = new char[256];
		char[] t_charValueArray = new char[256];
		
		
		for(int i=0; i< s.length(); i++) {
			char s_indexChar = s_charArray[i];
			char t_indexChar = t_charArray[i];
			if(s_charValueArray[s_indexChar] == 0 && t_charValueArray[t_indexChar] == 0) {
				s_charValueArray[s_indexChar] = t_indexChar;
				t_charValueArray[t_indexChar] = s_indexChar;
			}
			else {
				if(s_charValueArray[s_indexChar] != t_indexChar || t_charValueArray[t_indexChar] != s_indexChar) return false;
			}
		}
		
		
		return true;
        
    }
	public static void main(String[] args) {
		boolean res = isIsomorphic("people", "hodhko");
		System.out.println(res);
	}
}
