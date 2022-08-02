package strings.problems;

public class ProbNo14_LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 if(strs.length == 0) return "";
	     if(strs.length >=1 && strs.length <= 200) {
	           String prefix = strs[0];
	           for (int i = 1; i < strs.length ; i++) {
	               while(strs[i].indexOf(prefix) != 0)  {
	                   prefix = prefix.substring(0, prefix.length() - 1);
	               }
	           }
	           return prefix;
	        }
	        return "";
	 }
	 public static void main(String[] args) {
		ProbNo14_LongestCommonPrefix pb = new ProbNo14_LongestCommonPrefix();
		String[] inputStr = {"dog","racecar","car"};

		String res = pb.longestCommonPrefix(inputStr);

		System.out.println(res);
	}
}
