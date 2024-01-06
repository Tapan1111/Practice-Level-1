package OOPs.Inheritance;

public class Dogg extends AbstractAnimal {

	public static void main(String[] args) {
		Dogg dog = new Dogg();
		dog.bark();
	}

	@Override
	public void bark() {
		System.out.println("boww..bow");
	}

}
