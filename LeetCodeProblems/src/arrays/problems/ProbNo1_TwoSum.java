package arrays.problems;


import java.util.Arrays;
import java.util.HashMap;

public class ProbNo1_TwoSum {
	public static void main(String[] args) {
		
		int[] arr = {2,7,11,15};
		int[] result = twoSum(arr, 9);
		
		System.out.println(Arrays.toString(result));
	}
	public static int[] twoSum(int[] nums, int target) {
    	//updated code
		/*
		 * start i and j at 1, compare every two elements by incrementing i, j: where those two elements addition equal to target value
		 */
    	for(int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[j] + nums[j-i] == target) return new int[] {j-i, j};
            }
        }
    		
		return null;
    	}
}

    
