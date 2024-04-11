package Recursion;

public class ToCheck {
	public static void main(String[] args) {
		String s = "abc";
		String sb = " ";
//		for (int i = 0; i < s.length(); i++) {
//			sb = s.substring(0, i);
//		}
		System.out.println(s.substring(0, 0));
		System.out.println(s.substring(0, 1));
		System.out.println(s.substring(0, 2));
		System.out.println(s.substring(0, 3));
		System.out.println();
		System.out.println(s.substring(1));
		System.out.println(s.substring(2));
		System.out.println(s.substring(3));


		System.out.println(s.substring(0, 0) + s.substring(1));
		System.out.println(s.substring(0, 1) + s.substring(1));
		System.out.println(s.substring(0, 2) + s.substring(3));
//		System.out.println(s.substring(0, 3) + s.substring(0));
//		System.out.println(s.substring(0, 3) + s.substring(0));
//		System.out.println(s.substring(0, 3) + s.substring(0));
//		System.out.println(s.substring(0, 3) + s.substring(0));


	}

}
