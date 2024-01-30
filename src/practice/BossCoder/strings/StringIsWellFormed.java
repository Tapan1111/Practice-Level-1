package practice.BossCoder.strings;

import java.util.Stack;

public class StringIsWellFormed {
	public static void main(String[] args) {
		String str = "[{()}]";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (stack.isEmpty()) {
				stack.push(ch);
			} else if (ch == '{' || ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == '}' && stack.peek() == '{') {
				stack.pop();
			} else if (ch == ')' && stack.peek() == '(') {
				stack.pop();
			} else if (ch == ']' && stack.peek() == '[') {
				stack.pop();
			}
		}

		if (stack.isEmpty()) {
			System.out.println("String is well formed");
		} else {
			System.out.println("String is not well formed");
		}

	}
}
