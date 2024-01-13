package PepCoding;

import java.util.Scanner;

public class PallidromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = sc.nextLine();
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				System.out.println("Pallindrom");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Not a Pallindrom");
	}

}
