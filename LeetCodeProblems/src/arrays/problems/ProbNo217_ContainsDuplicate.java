package arrays.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ProbNo217_ContainsDuplicate {
	static boolean containsDuplicate(int[] nums) {
		/*
		 * Map<Integer, Integer> map = new HashMap<>(); for(int i = 0; i< nums.length;
		 * i++) { map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); }
		 * 
		 * for(Map.Entry<Integer, Integer> setEntry : map.entrySet()) {
		 * if(setEntry.getValue() >= 2) return true; }
		 */
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i : nums) {
			if(!hashSet.add(i)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
		boolean res = containsDuplicate(arr);
		System.out.println(res);
	}
}
