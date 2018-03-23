/**
 * 
 */
package com.test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author pboini
 *
 */
public class FindIndexes {

	public static void main(String[] args) {

	}

	private static Set<Integer> getIndexes() {
		Set<Integer> indexes = new HashSet<>();
		int[] elements = new int[] { 0, 2, 5, 4, 8 };
		int leftElementsSum = 0;
		int rightElementsMultiplication = 0;
		if (elements == null || elements.length == 0 || elements.length == 2) {
			// return Empty set
			return indexes;
		}

		if (elements.length == 1) {
			// If it is Only One Element, previous and next are equal..
			indexes.add(0);
			return indexes;
		}

		int lastElement = elements[elements.length - 1];

		for (int i = 1; i < elements.length; i++) {
			// Previous Elements sum
			leftElementsSum += elements[i - 1];
			System.out.println("previousSum:" + leftElementsSum);
			// For multiplication
			for (int j = i + 1; j < elements.length; j++) {
				rightElementsMultiplication = rightElementsMultiplication * elements[j];
			}
			// Previous Sum and Next Multiplication is Equal..
			System.out.println("previousSum:" + leftElementsSum + ", nextMultiplication:" + rightElementsMultiplication);

			if (leftElementsSum == rightElementsMultiplication) {
				System.out.println("Previous Sum and Next Multiplication is Equal..previousSum:" + leftElementsSum
						+ ", nextMultiplication:" + rightElementsMultiplication);
				System.out.println("Current Index is:" + i);
				indexes.add(i);
			}

		}
		return indexes;
	}

}
