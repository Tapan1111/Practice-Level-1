package practice.Arrays;

import java.util.Arrays;

public class VarsityPoint {
	public static void main(String[] args) {
		String[] names = { "Peter, John Doe" };
		int size = 1;

		// Get initials
		String result = getInitials(names, size);

		// Output result
		System.out.println(result);

	}

	public static String getInitials(String[] names, int size) {
		StringBuilder initials = new StringBuilder();

		for (int i = 0; i < size; i++) {
			String name = names[i];
			System.out.println(name);
			String[] parts = name.split(" ");
			System.out.println(Arrays.toString(parts));

			for (String part : parts) {
				initials.append(part.charAt(0));
			}
		}

		return initials.toString().toUpperCase();
	}

}
