package Collections;

public class MyString {

	private String str;

	public MyString(String str) {
		this.str = str;
	}

	public boolean isHexaDecimalChar(char ch) {
		return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));
	}

	public boolean isHexaDecimal() {
		if (str == null || str.equals(" ")) {
			return false;
		}
		for (char ch : str.toCharArray()) {
			if (!isHexaDecimalChar(ch) && !Character.isDigit(ch)) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		MyString st = new MyString("abcdef123456789");
		System.out.println(st.isHexaDecimal());
		System.out.println(st.isHexaDecimalChar('f'));
	}


}
