package com.task2;

public class EnumExample {

	public enum Month {
		JANUARY(31), FEBUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30),
		OCTOBER(31), NOVEMBER(30), DECEMBER(31);

		private final int days;

		Month(int days) {
			this.days = days;
		}

		private int getDays() {
			return days;
		}
	}

	public static void main(String[] args) {
		
		Month month = Month.MARCH;
		System.out.println(month.getDays()+" days");

	}

}
