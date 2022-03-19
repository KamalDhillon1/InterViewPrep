package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortInDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer number[] = { 9, 5, 6, 4, 8, 10 };
		// invoking sort method
		Arrays.sort(number, Collections.reverseOrder());
		System.out.println("sort in descending order");
		// prints array
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
