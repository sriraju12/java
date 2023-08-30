package com.task2;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		int sum = 0;

		for (Integer result : list) {
			sum = sum + result;
		}
		System.out.println("Sum of integers is:" + sum);

	}

}
