package Leet;

import java.util.Arrays;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  hello world  ";
		System.out.println(reverse(s));
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		String[] arr = s.trim().split("\\s+");
		int i = 0;
		int l = arr.length - 1;
		while(i < l) {
			String t = arr[i];
			arr[i] = arr[l];
			arr[l] = t;
			i++;
			l--;
		}
		System.out.println(Arrays.toString(arr));
		StringBuilder b = new StringBuilder();
		for(int j = 0; j <= arr.length - 2; j++){
            b.append(arr[j]+ " ");
        }
        b.append(arr[arr.length - 1]);
		return b.toString();
	}

}
