package com.task1;

import java.util.Scanner;

public class StringRevWithoutBuiltIn {

	public static String revStringWithoutBuiltIn(String str) {

		char c[] = str.toCharArray();
		String revString = " ";
		for (int i = c.length - 1; i >= 0; i--) {
			revString = revString + c[i];
		}
		return revString;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		System.out.println("Reverse String is :" + revStringWithoutBuiltIn(str));

	}

}
