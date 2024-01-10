package PepCoding;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		arr[0] = 12;
		arr[1] = 13;
		arr[2] = 14;
		arr[3] = 15;
		arr[4] = 16;

		
//		System.out.println("Enter the number in array :");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		// Array of objects;

		String[] str = new String[4];

		for (int i = 0; i < str.length; i++) {
			str[i] = sc.next();
		}
		System.out.println(Arrays.toString(str));


	}
}
