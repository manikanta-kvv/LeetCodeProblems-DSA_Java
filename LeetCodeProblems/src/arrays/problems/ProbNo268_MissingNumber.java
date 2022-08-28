package arrays.problems;

public class ProbNo268_MissingNumber {
	
	static int missingNumber(int[] nums) {
		/*
		 * bitwise XOR manipulation
		 *  0 ^ 0 = 0
		 *  1 ^ 1 = 0
		 *  1 ^ 0 = 1
		 *  
		 *  pattern : length ^ index position ^ element 
		 */
		int res = nums.length;
		for(int i = 0; i< nums.length; i++) {
			res = res ^ i;
			res = res ^ nums[i];
		}
		return res;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,0};
		int res = missingNumber(arr);
		System.out.println(res);
//		System.out.println(2 ^ 1);
	}
}
