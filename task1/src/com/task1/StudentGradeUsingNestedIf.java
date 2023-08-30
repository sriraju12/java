package com.task1;

import java.util.Scanner;

public class StudentGradeUsingNestedIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the grade :");
		String grade = sc.nextLine();
		if(grade.equalsIgnoreCase("A")) {
			System.out.println("Excellent job!");
		}
		else if(grade.equalsIgnoreCase("B")) {
			System.out.println("Good job!");
		}
		else if(grade.equalsIgnoreCase("C")) {
			System.out.println("Average job!");
		}
		else if(grade.equalsIgnoreCase("D")) {
			System.out.println("Needs improvement");
		}
		else if(grade.equalsIgnoreCase("F")) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalid grade");
		}
	}

}
