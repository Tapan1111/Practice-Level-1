package PepCoding;

public class MergeStringsAlternatively {
	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "pqrstuvw";
		boolean flag = true;
		int i = 0;
		int j = 0;
		StringBuilder finalWord = new StringBuilder();


		while (i < word1.length() && j < word2.length()) {
			if(flag) {
				finalWord.append(word1.charAt(i));
				i++;
				flag = !flag;
			}else {
				finalWord.append(word2.charAt(j));
				j++;
				flag = !flag;
			}
		}
		while(i<word1.length()) {
			finalWord.append(word1.charAt(i));
			i++;
		}
		while(j<word2.length()) {
			finalWord.append(word2.charAt(j));
			j++;
		}
		System.out.println(finalWord);

	}
}
