package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaces1 {
	public static void main(String[] args) {

		Set<Integer> numbers = new HashSet<Integer>();
		System.out.println(numbers);
		numbers.add(456);
		numbers.add(123);
		numbers.add(345);
		numbers.add(987);
		numbers.add(23);
		numbers.add(1);
		System.out.println(numbers);

		Set<Integer> nums = new LinkedHashSet<Integer>();
		System.out.println(nums);
		nums.add(123);
		nums.add(6789);
		nums.add(9090);
		nums.add(34);
		nums.add(56767);
		nums.add(98);
		nums.add(12);
		System.out.println(nums);

		Set<Integer> digits = new TreeSet<Integer>();
		System.out.println(digits);
		digits.add(23);
		digits.add(234);
		digits.add(65);
		digits.add(7);
		digits.add(98765);
		digits.add(555);
		System.out.println(digits);

		List<Character> characters = List.of('A', 'Z', 'C', 'V', 'Z', 'A');
		Set<Character> charc = new TreeSet<Character>(characters);
		charc.add('E');
		System.out.println(charc);
		Set<Character> linkSet = new LinkedHashSet<Character>(characters);
		System.out.println(linkSet);

		Set<Character> hashset = new HashSet<Character>(characters);
		System.out.println(hashset);

	}


}
