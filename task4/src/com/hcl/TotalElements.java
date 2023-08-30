package com.hcl;

import java.util.Arrays;
import java.util.List;

public class TotalElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 24, 12, 1, 2, 3);
		long totalCount = list.stream().distinct().count();
		System.out.println("Total Distinct elements is :" + totalCount);
	}

}
