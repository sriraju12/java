package com.task1;

import java.util.Scanner;

public class StudentGradeUsingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();
		switch (grade) {
		case "A":
			System.out.println("Excellent job!");
			break;
		case "B":
			System.out.println("Good job!");
			break;
		case "C":
			System.out.println("Average job!");
			break;
		case "D":
			System.out.println("Needs improvement");
			break;
		case "f":
			System.out.println("Failed");
			break;
		default:
			System.out.println("Invalid grade");
			break;
		}

	}

}
