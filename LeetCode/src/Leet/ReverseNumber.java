package Leet;

public class ReverseNumber {
	public static int reverse(int x) {
		long rev = 0;
        int s = 0;
        while (x != 0) {
            s = x % 10;
            rev = (rev * 10) + s; 
            x = x / 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
        	return 0;
        }
        if(x< 0) {
        	return (int)(-1 * rev);
        }
        return (int)rev;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-123));
	}

}