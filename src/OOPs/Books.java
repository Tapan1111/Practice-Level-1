package OOPs;

import java.util.ArrayList;

public class Books {

	private int id;

	private String name;

	private String author;

	private ArrayList<Reviews> reviews = new ArrayList<Reviews>();

	public Books(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Reviews review) {
		this.reviews.add(review);
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", reviews=" + reviews + "]";
	}

}
