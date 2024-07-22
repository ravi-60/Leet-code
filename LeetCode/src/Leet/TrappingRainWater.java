package Leet;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));
	}

	private static int trap(int[] height) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = height.length - 1;
		int lmax = 0, rmax = 0;
		int totalwater = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				if (height[left] >= lmax) {
					lmax = height[left];
				} else {
					totalwater += lmax - height[left];
				}
			left++;
			}else {
				if(height[right] >= rmax) {
					rmax = height[right];
				}else {
					totalwater += rmax - height[right];
				}
				right--;
			}
		}

		return totalwater;
	}

}
