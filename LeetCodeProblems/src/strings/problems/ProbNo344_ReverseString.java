package strings.problems;


import java.util.Arrays;

public class ProbNo344_ReverseString {
	public static void reverseString(char[] s) {
       int head = 0;
       int tail = s.length - 1;
       while(head < tail) {
        	char tempHead = s[head];
        	s[head] = s[tail];
        	s[tail] = tempHead;
        	head++;
        	tail--;
   
        }
        System.out.println(Arrays.toString(s));
  
    }
	public static void main(String[] args) {
		char[] input = {'h','e','l','l','o'};
		reverseString(input);
	}
}
