package PepCoding;

public class FibbocciNumber {
	public static void swap(int n) {
		int num1 = 0;
		int num2 = 1;
		for (int i = 0; i < n; i++) {
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			System.out.println(num1 + " ");
		}
	}

	public static void main(String[] args) {
		FibbocciNumber fibb = new FibbocciNumber();
		fibb.swap(10);





	}

}
