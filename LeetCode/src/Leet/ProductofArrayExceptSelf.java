package Leet;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int[] n = new int[nums.length];
		int index = 0;
		for (int i : nums) {
			n[index++] = i;
		}
		for (int i = 0; i < nums.length; i++) {
			int r = 1;
			for (int j = 0; j < n.length; j++) {
				if (i != j) {
					r *= n[j];
				}
				nums[i] = r;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = { 1, 2, 3, 4 };
		int[] r = productExceptSelf(n);
		System.out.println(Arrays.toString(r));
	}

}
