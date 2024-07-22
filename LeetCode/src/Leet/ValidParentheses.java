package Leet;

import java.util.Stack;

public class ValidParentheses {
	public static boolean matched(char f, char l) {
		return (f == '(' && l == ')') || (f == '{' && l == '}') || (f == '[' && l == ']');
	}
	public static boolean valid(String s) {
		char[] a = s.toCharArray();
		Stack<Character> s1 = new Stack<Character>();
		for (char c : a) {
			if (c == '(' || c == '{' || c == '[') {
				s1.push(c);
			} else if (s1.isEmpty() || !matched(s1.pop(), c)) {
				return false;
			}
		}
		return (s1.isEmpty()) ? true : false;
	}
	public static void main(String[] args) {
		String s = "{}()[]";
		System.out.println(valid(s));
	}
}
