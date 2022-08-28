package arrays.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ProbNo169_MajorityElement {

	static int majorityElement(int[] nums) {
/*
 * if majority element doesn't exists return 0
 * Map<Integer, Integer> map = new HashMap<>();
		int majorityEle = 0;
		int frequency  = nums.length/2;
		for(int i = 0; i<nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			int val = map.get(nums[i]);
			if(val > frequency) {
				majorityEle = nums[i];
				break;
			}
		}
		
		return majorityEle;
 */
		
		
		//if assumes majority element always exist 
		int count = 0;
		int candidate = nums[0];
		for(int i:nums) {
			if(candidate == i) {
				count++;
				continue;
			}
			else {
				--count;
				if(count == 0) {
					candidate = i;
					count++;
				
				}
			}
		}
		return candidate;
		
    }
	
	// count the no of occurances of a number
/*	
 * static int countOccurances(int[] arr, int num) {
		int count = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) count++;
		}
		return count;
	}
*/	
	public static void main(String[] args) {
		int[] arr = {1, 1,1, 2, 2, 2};
		int res = majorityElement(arr);
		System.out.println(res);
	
}}
