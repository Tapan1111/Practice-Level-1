package OOPs;

public class BookRunner {

	public static void main(String[] args) {

		Reviews review = new Reviews(1, "very good", 6);
		Books book = new Books(1, "Java Journney", "Tapan");
		book.addReview(new Reviews(2, "very good", 5));

		System.out.println(book);

	}

}
