package Leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		if (nums.length < 4) {
			return ans;
		}

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue;

				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

						left++;
						right--;

						while (left < right && nums[left] == nums[left - 1])
							left++;
						while (left < right && nums[right] == nums[right + 1])
							right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}

			}
		}

		return ans;
	}

	public static void main(String[] args) {
		FourSum solution = new FourSum();
		int[] nums = { 2, 2, 2, 2, 2 };
		List<List<Integer>> result = solution.fourSum(nums, 0);
		System.out.println(result);
	}

}
