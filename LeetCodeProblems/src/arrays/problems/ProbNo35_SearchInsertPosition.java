package arrays.problems;

public class ProbNo35_SearchInsertPosition {
	public static void main(String[] args) {
		int[] arr = {1,3,5,6};
		int res = searchInsert(arr, 6);
		System.out.println(res);
	}
	
	static int searchInsert(int[] nums, int target) {
		//using binary search
		//nums = [1,3,3,4,5,6], target = 5;  2 4 6 8 10 16 18
		int start = 0;
		int end = nums.length;
		while(start < end) {
			int mid = start + (end - start) / 2;
			
			if(nums[mid] == target) {
				return mid;
			}
			else if (nums[mid] < target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		for(int i = 0; i<nums.length; i++) {
			if(target <= nums[i]) {
				return i;
			}
		}
		return nums.length;
		
	}
}
