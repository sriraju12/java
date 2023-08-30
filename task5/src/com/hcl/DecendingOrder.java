package com.hcl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DecendingOrder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 8, 3, 4, 20, 34, 53);
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

	}

}
