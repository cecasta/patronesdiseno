package creacionales.factory;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		Sum s = new Sum();
		List<Integer> signalOne = Arrays.asList(1, 2, 3, 4, 1);
		List<Integer> signalTwo = Arrays.asList(5, 4, 3, 4, 1);

	}

	public static String sum(List<Integer> list, int k) {

		Integer[] array = list.toArray(new Integer[0]);

		boolean hasSum = false;

		for (int i = 0; i < array.length; i++) {

			hasSum = hasSum(i, array, k);

			if (hasSum) {

				break;

			}

		}

		return hasSum ? "yes" : "not";

	}

	private static boolean hasSum(int position, Integer[] array, int k) {

		for (int i = 0; i < array.length; i++) {

			if (i != position && (array[i] + array[position] == k)) {

				return true;

			}

		}

		return false;

	}

}
