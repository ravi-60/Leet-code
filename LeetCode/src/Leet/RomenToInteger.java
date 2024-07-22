package Leet;

import java.util.HashMap;
public class RomenToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('i', 1);
		map.put('v', 5);
		map.put('x', 10);
		map.put('l', 50);
		String g = "XIII";
		g = g.toLowerCase();
		int r = 0;
		int pv = 0;
		for (int i = g.length() - 1; i >= 0; i--) {
			int cv = map.get(g.charAt(i));
			if (cv < pv) {
				r -= map.get(g.charAt(i));
			} else {
				r += map.get(g.charAt(i));
			}
			pv = cv;
		}
		System.out.println(r);
	}

}
