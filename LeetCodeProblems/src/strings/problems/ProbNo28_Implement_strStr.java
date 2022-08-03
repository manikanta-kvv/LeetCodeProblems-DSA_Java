package strings.problems;

/*Constraints:

	1 <= haystack.length, needle.length <= 104
	haystack and needle consist of only lowercase English characters.*/


public class ProbNo28_Implement_strStr {
	public static int strStr(String haystack, String needle) {
		
		if(needle == "") return 0;
		haystack = haystack.toLowerCase();
		needle = needle.toLowerCase();
		return haystack.indexOf(needle);

    }
	public static void main(String[] args) {
		int res = strStr("hello", "ll");
		System.out.println(res);
	}
}

