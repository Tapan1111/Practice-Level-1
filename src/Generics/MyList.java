package Generics;

import java.util.ArrayList;

public class MyList<T> {

	ArrayList<T> list = new ArrayList<T>();

	public void addElement(T str) {
		list.add(str);
	}

	public void remove(T str) {
		list.remove(str);
	}

	public T get(int index) {
		return list.get(index);
	}
	@Override
	public String toString() {
		return list.toString().toString();
	}

}
