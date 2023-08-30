package com.hcl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElement {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 12, 20, 18);
		Optional<Integer> number = list.stream().sorted().findFirst();
		System.out.println("First Element :" + number.get());

	}

}
