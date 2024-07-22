package Leet;

import java.util.Arrays;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}

		digits = new int[digits.length + 1];
		digits[0] = 1;
		return digits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {1,9};
		int[] j = plusOne(i);
		System.out.println(Arrays.toString(j));
		//System.out.println(j);
	}

}
