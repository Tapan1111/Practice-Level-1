package practice;


public class A {
	public void add() {
		int a = 10;
		int b = 20;
		int c = 0;
		c = a + b;
		System.out.println(c);
	}

	public void add(int x, int y) {
		int c = x + y;
		System.out.println(c);
	}

	public void add(int i, double j) {
		double c = i + j;
		System.out.println(c);
	}

	public static void main(String[] args) {
		A sum = new A();
		sum.add();
		sum.add(17, 76);
		sum.add(23, 90.05);
	}

}
