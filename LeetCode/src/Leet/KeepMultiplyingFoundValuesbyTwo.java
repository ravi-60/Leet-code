package Leet;

public class KeepMultiplyingFoundValuesbyTwo {
	public static int findFinalValue(int[] nums, int original) {
		for(int i : nums) {
			if(original == i) {
				original *= 2;
				return findFinalValue(nums, original);
			}
		}
		return original;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {5,3,6,1,12};
		int o = 3;
		System.out.println(findFinalValue(n, o));
	}

}
