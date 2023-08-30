package com.hcl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> even = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		even.forEach(System.out::println);
	}

}
