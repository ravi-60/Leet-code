package Leet;

import java.util.Arrays;
//Two Sum if sorted
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while(left < right) {
			int sum = nums[left] + nums[right];
			if(sum == target) {
				int[] r = {left , right};
				return r;
			}else if(sum < target) {
				left++;
			}else {
				right++;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int target = 6;
		int[] nums = { 3, 2, 4};
		Arrays.sort(nums);
		int[] arr = twoSum(nums, target);
		System.out.println(Arrays.toString(arr));

	}

}
