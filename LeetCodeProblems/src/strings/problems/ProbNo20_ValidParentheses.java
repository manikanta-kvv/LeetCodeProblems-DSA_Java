package strings.problems;


import java.util.Stack;

public class ProbNo20_ValidParentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = s.toCharArray();
		for(Character ch : charArray) {
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			else {
				if(!stack.isEmpty()) {
					Character topChar = stack.peek();
					if((ch == ')' && topChar == '(') ||
						(ch == '}' && topChar == '{') ||
						(ch == ']' && topChar == '[')) {
						stack.pop();
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
		
	
        
    }
	public static void main(String[] args) {
		ProbNo20_ValidParentheses validStr = new ProbNo20_ValidParentheses();
		Boolean b = validStr.isValid("((]]");
		System.out.println(b);
	}
}
