package com.hcl;

import java.util.Arrays;
import java.util.List;

public class FilterNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 11);
		list.stream().map(x -> x.toString()).filter(x -> x.startsWith("1")).forEach(System.out::println);

	}

}
