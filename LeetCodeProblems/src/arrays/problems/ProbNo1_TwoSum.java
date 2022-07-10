package arrays.problems;


import java.util.Arrays;
import java.util.HashMap;

public class ProbNo1_TwoSum {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = {2,7,11,15};
		int[] result = s.twoSum(arr, 9);
		System.out.println(Arrays.toString(result));
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	    	
    	HashMap<Integer, Integer> valIndexMap = new HashMap<>();
		for(int i = 0; i<nums.length; i++) {
			
			Integer newVal = (int) (target - nums[i]);
    			if(valIndexMap.containsKey(newVal)) {
    				int[] returnedArr= {valIndexMap.get(newVal), i};
    				return returnedArr;
 
    			}
    			valIndexMap.put(nums[i], i);
    		}
    		
		return null;
    	}
    }