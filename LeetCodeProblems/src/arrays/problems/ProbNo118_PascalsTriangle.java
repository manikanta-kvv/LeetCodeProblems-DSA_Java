package arrays.problems;

import java.util.ArrayList;
import java.util.List;

public class ProbNo118_PascalsTriangle {
	
	static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i< numRows; i++) {
        	List<Integer> list = new ArrayList<>();
        	for(int j = 0; j < i + 1; j++) {
        		if(j == 0 || j == i) {
        			list.add(1);
        		}
        		else {
        			int a = result.get(i - 1).get(j - 1);
        			int b = result.get(i - 1).get(j);
        			list.add(a + b);
        		}
        	}
        	result.add(list);
        }
        return result;
    }
	public static void main(String[] args) {
		List<List<Integer>> res = generate(6);
		System.out.println(res);
	}
}
