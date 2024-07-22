package Leet;

import java.util.Arrays;

public class StringtoInteger {
	public static int myAtoi(String s) {
//		s = s.trim();
		char[] c = s.toCharArray();
		double count = 0;
		int c2 = 0;
		boolean neg = false;
		for (char c1 : c) {
			if (Character.isDigit(c1)) {
				count = count * 10 + Character.getNumericValue(c1);
				c2++;
			} else if (c1 == '-' && c2 == 0) {
				neg = true;
			} else {
				break;
			}
		}
		if (neg) {
			count = count * -1;
		}
		if (count < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		if (count > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}
		return (int)count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-91283472332";
		System.out.println(myAtoi(s));
	}

}
