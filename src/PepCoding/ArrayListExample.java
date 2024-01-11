package PepCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}

	}

}
