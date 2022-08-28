package arrays.problems;


public class ProbNo136_SingleNumber {
	static int singleNumber(int[] nums) {
		int singleNumber = nums[0];
		for(int i = 1; i< nums.length; i++) {
			singleNumber = singleNumber ^ nums[i]; 
		}
        return singleNumber;
    }
	
	public static void main(String[] args) {
		int[] arr = {10,10};
		int res = singleNumber(arr);
		System.out.println(res);
		
	}
}
