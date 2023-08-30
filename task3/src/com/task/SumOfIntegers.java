package com.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfIntegers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		double average = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Average is :" + average);

	}

}
