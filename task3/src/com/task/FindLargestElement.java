package com.task;

import java.util.Arrays;
import java.util.List;

public class FindLargestElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 4, 3, 5, 6, 8, 9, 7, 10);

		int secondSmallest = list.stream().sorted().distinct().skip(1).findFirst().orElse(-1);

		System.out.println("Second Smallest is: " + secondSmallest);

		int highestNumber = list.stream().distinct().max((l1, l2) -> l1.compareTo(l2)).orElse(-1);
		System.out.println("Highest Number is : " + highestNumber);

	}

}
