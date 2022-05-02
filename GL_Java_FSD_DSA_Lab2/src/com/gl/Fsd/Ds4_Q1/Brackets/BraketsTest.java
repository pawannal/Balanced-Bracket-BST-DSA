package com.gl.Fsd.Ds4_Q1.Brackets;

public class BraketsTest {

	public static void main(String[] args) {
		test("{[()]}");
		test(" ([[{}]])) ");
		test("{}");
	}

	private static void test(String brackets) {

		BalancedBracketChecker checker = new BalancedBracketChecker(brackets);
		boolean result = checker.check();
		System.out.println("----------------------------------------" + "---------------------------------------");
		if (result) {
			System.out.println("\t\tGiven,Bracket expression : '" + brackets
					+ "' \n\t The above expression has Balanced Brackets");
		} else {
			System.out.println("\t\tGiven,Bracket expression : '" + brackets
					+ "' \n\t The entered Strings do not contain Balanced Brackets");
		}
	}
}
