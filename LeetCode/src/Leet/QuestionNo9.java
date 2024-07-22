package Leet;

public class QuestionNo9 {
	public static boolean isPalindrome(int x) {
		int num = x;
		int temp = 0;
		while (x > 0) {
			temp = (temp * 10) + x % 10;
			x = x / 10;
		}
		return temp == num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 12;
		boolean y = isPalindrome(x);
		System.out.println(y);
	}

}
