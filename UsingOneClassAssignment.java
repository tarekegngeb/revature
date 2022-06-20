package com.revature.tarekegn.assignment1;
public class UsingOneClassAssignment {
	public static void main(String[] args) {
		
		System.out.println("The sum is "+sum(10, 20));
		System.out.println("The sub is "+sub(10, 20));
		System.out.println("Multiplication of "+multiply(10, 20));
		System.out.println("Division of "+division(10.0, 20.0));
	}
	public static int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	public static int sub(int x, int y) {
		int result = x - y;
		return result;
	}
	public static int multiply(int x, int y) {
		int result = x * y;
		return result;
	}
	public static double division(double x, double y) {
		double result = x / y;
		return result;
	}

}
