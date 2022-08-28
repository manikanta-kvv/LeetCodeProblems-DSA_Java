package arrays.problems;

import java.util.Arrays;

public class ProbNo283_MoveZeroes {
	static void moveZeroes(int[] nums) {
        //moving non-zero elements to front by indexing from 0 and insert 0's at remaining index positions
		int insertPosition = 0;
        for(int n : nums) {
        	if(n!= 0) {
        		nums[insertPosition] = n;
        		insertPosition++;
        	}
        }
        while(insertPosition < nums.length) {
        	nums[insertPosition] = 0;
        	insertPosition++;
        }
        System.out.println(Arrays.toString(nums));
    }
	
	public static void main(String[] args) {
		int[] arr = {0};
		moveZeroes(arr);
	}
}
