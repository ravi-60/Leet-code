package Leet;

import java.util.*;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if(i > 0 && nums[i] == nums[i - 1]) continue;
			int left = i + 1;
			int right = nums.length - 1;
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
					
					left++;
					right--;
					
					while(left < right && nums[left] == nums[left - 1]) left++;
					while(left < right && nums[right] == nums[right + 1]) right--;
				}else if(sum < 0) {
					left++;
				}else {
					right--;
				}
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		ThreeSum solution = new ThreeSum();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = solution.threeSum(nums);
		System.out.println(result);
	}
}
