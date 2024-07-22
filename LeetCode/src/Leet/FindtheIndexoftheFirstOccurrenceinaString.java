package Leet;

public class FindtheIndexoftheFirstOccurrenceinaString {
	public static int strStr(String haystack, String needle) {
//        char[] arr = haystack.toCharArray();
//        if(arr.length == 1) {
//        	return 0;
//        }
//        for(int i = 0; i <= arr.length; i++) {
//        	for(int j = i + 1; j <= arr.length; j++) {
//        		System.out.println(haystack.substring(i,j));
//        		if(haystack.substring(i,j).equals(needle)) {
//        			return i;
//        		}
//        	}
//        }
//        return -1;
		return haystack.indexOf(needle);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("abc", "c"));
	}

}
