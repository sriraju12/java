package com.task1;

import java.util.Scanner;

public class StringRevUsingBuiltIn {

	public static String stringRev(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		System.out.println("After Reverse of String :" + stringRev(str));

	}

}
