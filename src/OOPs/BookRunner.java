package OOPs;

public class BookRunner {

	public static void main(String[] args) {

		Books book = new Books(2, "The Simplified Physics", "S.L. Arrora");
		Reviews review = new Reviews(5, "very helpful", 5);
		book.addReview(new Reviews(55, "very informatic", 5));

		System.out.println(book);

	}

}
