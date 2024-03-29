package arrays.problems;

import java.util.*;


public class ProbNo350_IntersectionOfTwoArraysII {
	static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
        	return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) {
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(int num : nums2) {
        	int count = map.getOrDefault(num, 0);
        	if(count > 0) {
        		list.add(num);
        		map.put(num, count - 1);
        	}
        }
        
        int[] resArray = new int[list.size()];
        int i = 0;
        for(int num : list) {
        	resArray[i] = num;
        	i++;
        }
		return resArray;
    }
	
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,2,1};
		int[] arr2 = {2};
		int[] res = intersect(arr1, arr2);
		System.out.println(Arrays.toString(res));
	}
}
