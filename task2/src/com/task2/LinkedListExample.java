package com.task2;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<String>();
		names.add("Ganga");
		names.add("Yamuna");
		names.add("Narmada");

		System.out.println("Original list:" + names);
		Collections.reverse(names);
		System.out.println("Reverse list:" + names);
	}

}
