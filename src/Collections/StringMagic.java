package Collections;

public class StringMagic {
	
	public String reverseWordsInSentence(String sentence) {

		if (sentence == null) {
			return "INVALID";
		}
		if (sentence == " ") {
			return " ";
		}
		StringBuilder reverseSentence = new StringBuilder();
		for (String words : sentence.split(" ")) {
			StringBuilder reverseword = new StringBuilder(words).reverse();
			System.out.println(reverseword);
			reverseSentence.append(reverseword).append(" ");
		}

		return reverseSentence.toString().trim();

	}

	public static void main(String[] args) {

		StringMagic mgc = new StringMagic();
		System.out.println(mgc.reverseWordsInSentence("Hello Folks"));
	}

}
