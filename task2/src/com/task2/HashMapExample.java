package com.task2;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> students = new HashMap<String, String>();
		students.put("Raju", "A");
		students.put("Nitish", "B");
		students.put("Bharath", "C");
		students.put("veera", "D");
		students.put("Ashok", "F");
		students.put("Prashanth", "A");
		students.put("Satish", "F");

		System.out.println("Students are :" + students.entrySet());

		Map<String, String> passedStudents = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : students.entrySet()) {
			if (!entry.getValue().equals("F")) {
				passedStudents.put(entry.getKey(), entry.getValue());
			}
		}

		System.out.println("After removing Failed Students:" + passedStudents);

	}

}
