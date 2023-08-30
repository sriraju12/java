package com.task;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 1, 2, 4, 5);

		list.stream().distinct().forEach(x -> System.out.println(x));

	}

}
