package com.hcl;

import java.util.Arrays;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 8, 3, 4, 20, 34, 53);
		list.stream().sorted().forEach(System.out::println);
	}

}
