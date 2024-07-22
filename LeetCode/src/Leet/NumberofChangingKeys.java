package Leet;

public class NumberofChangingKeys {

	public static int countKeyChanges(String s) {
		int count = 0;
		
		s = s.toLowerCase();
		
		char[] arr = s.toCharArray();
		char pre = arr[0];
		for(int i = 1; i < s.length(); i++) {
			if(pre != arr[i]) {
				count++;
				pre = arr[i];
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aAbBcC";
		System.out.println(countKeyChanges(s));
	}

}
