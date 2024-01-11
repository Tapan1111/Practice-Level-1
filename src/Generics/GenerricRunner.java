package Generics;

public class GenerricRunner {

	public static void main(String[] args) {
		MyList<String> list = new MyList<String>();
		list.addElement("element1");
		list.addElement("element2");
		String value = list.get(0);
		System.out.println(list);
		System.out.println(value);


		MyList<Integer> list2 = new MyList<Integer>();
		list2.addElement(Integer.valueOf(5));
		System.out.println(list2);
		Integer number = list2.get(0);
		System.out.println(number);

	}

}
