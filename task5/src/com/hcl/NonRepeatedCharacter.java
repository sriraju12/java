package com.hcl;

import java.util.Optional;
import java.util.Scanner;

public class NonRepeatedCharacter {

	public static Optional<Character> firstNonRepeatedChar(String str) {
		Optional<Character> result = str.chars().mapToObj(x -> (char) x)
				.filter(x -> str.indexOf(x) != str.lastIndexOf(x)).findFirst();
		return result;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		System.out.println(firstNonRepeatedChar(str).get());

	}

}
