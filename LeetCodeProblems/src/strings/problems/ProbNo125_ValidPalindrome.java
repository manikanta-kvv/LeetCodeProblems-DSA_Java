package strings.problems;

import java.util.Arrays;

public class ProbNo125_ValidPalindrome {
	public static boolean isPalindrome(String s) {
		if(s == " ") return true;
		int head = 0;
		int tail = s.length()-1;
		while(head <= tail) {
			while(head <= tail && !Character.isLetterOrDigit(s.charAt(head))) {
				head++;
			}
			while (head <= tail && !Character.isLetterOrDigit(s.charAt(tail))) {
				tail--;
			}
			if(head <= tail && Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) {
				return false;
			}
			head++;
			tail--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean res = isPalindrome("\\ ");
		System.out.println(res);
	}
}


/* Another way to do
 *private static final char[]charMap = new char[256];
	static{
	    for(int i=0;i<10;i++){
	        charMap[i+'0'] = (char)(1+i);  // numeric
	    }
	    for(int i=0;i<26;i++){
	        charMap[i+'a'] = charMap[i+'A'] = (char)(11+i);  //alphabetic, ignore cases
	    }
	    
	}
	public static boolean isPalindrome(String s) {
	    char[]pChars = s.toCharArray();
	    int start = 0,end=pChars.length-1;
	    char cS,cE;
	    System.out.println((char)(1+0));
	    while(start<end){
	        cS = charMap[pChars[start]];
	        cE = charMap[pChars[end]];
	        if(cS!=0 && cE!=0){
	            if(cS!=cE)return false;
	            start++;
	            end--;
	        }else{
	            if(cS==0)start++;
	            if(cE==0)end--;
	        }
	    }
	    return true; 
 * 
 * */
 