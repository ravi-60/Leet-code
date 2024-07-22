package Leet;

public class Palindrome {
	public static boolean check(String l) {
		char[] a = l.toCharArray();
		int len = a.length - 1;
		int i = 0;
		while(i < len) {
			if(a[i] != a[len]) {
				return false;
			}
			len--;
			i++;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1231;
		String l = String.valueOf(x);
		System.out.println(check(l));
	}

}
