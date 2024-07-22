package Leet;

public class LongestPalindromicSubstring {
	public static boolean ispal(String s) {
		char[] a = s.toCharArray();
		String h = "";
		for (int i = a.length - 1; i >= 0; i--) {
			h = h + a[i];
		}
		return h.equals(s);
	}

	public static String longestPalindrome(String s) {
		String l = "";
		if(s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length()+1; j++) {
				String h = s.substring(i, j);
				System.out.println(h);
				if (ispal(h)) {
					if (h.length() >= l.length()) {
						l = h;
					}
				}
			}
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a";
		System.out.println(ispal(s));
		System.out.println(longestPalindrome(s));
	}

}
