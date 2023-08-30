package com.task;

import java.util.Arrays;
import java.util.List;

public class StringsToUpperCase {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("raju", "prashanth", "sandhya", "manohar");

		list.stream().map(x -> x.toUpperCase()).forEach(x -> System.out.println(x));
	}

}
