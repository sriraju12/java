package com.hcl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MaxElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		Optional<Integer> max = list.stream().sorted(Collections.reverseOrder()).findFirst();
		System.out.println("Max Element :" + max.get());

		int maximum = list.stream().distinct().max((x1, x2) -> x1.compareTo(x2)).orElse(0);
		System.out.println(maximum);
	}

}
