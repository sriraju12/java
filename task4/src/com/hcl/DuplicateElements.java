package com.hcl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 10, 1, 2, 3, 15,1,2);
		Set<Integer> duplicates = list.stream().filter(x -> Collections.frequency(list, x) > 1)
				.collect(Collectors.toSet());
		duplicates.forEach(System.out::println);
		
		

	}

}
