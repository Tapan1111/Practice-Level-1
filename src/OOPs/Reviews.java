package OOPs;

public class Reviews {

	private int id;

	private String description;

	private int rate;

	public Reviews(int id, String description, int rate) {
		super();
		this.id = id;
		this.description = description;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", description=" + description + ", rate=" + rate + "]";
	}

}
