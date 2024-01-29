package practice.Arrays;

import java.util.ArrayList;

public class UtkarshDynaminc1D {
	public static void main(String[] args) {
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(1);
//		a.add(89);
//		a.add(-123);
//		System.out.println(a);
//		a.set(1, 1000);
//		System.out.println(a);
//		System.out.println(a.get(2));

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		System.out.println(list.size());

//		int[][] arrDynamic = new int[3][2];
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number :");
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				arrDynamic[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(arrDynamic[i][j] + " ");
//
//			}
//			System.out.println(" ");
//		}
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 3; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				temp.add(i);
			}
			arr.add(temp);
		}

		System.out.print(arr);
		System.out.println();
		arr.get(2).set(2, 50);
		System.out.println(arr);
	}

}
